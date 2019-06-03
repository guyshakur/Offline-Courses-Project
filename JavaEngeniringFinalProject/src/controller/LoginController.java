package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.SignUpScreen;
import view.screens.TestScreen;

public class LoginController implements Controller {
	private static LoginController thisObj=null;
	private static LoginScreen loginScreen=null;
	private static SignUpScreen signUpScreen=null;
	private TestScreen testScreen=null;
	private StudentDao studentDao=null;
	
	public LoginController() {
		thisObj=this;
	}
	
	
	public LoginScreen getLoginScreen() {
		return loginScreen;
	}



	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}



	public TestScreen getTestScreen() {
		return testScreen;
	}



	public void setTestScreen(TestScreen testScreen) {
		this.testScreen = testScreen;
	}



	public StudentDao getStudentDao() {
		return studentDao;
	}



	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginScreen.setLoginController(thisObj);
					LoginController.loginScreen.setVisible(true);
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public void StartSignInScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Controller controller=
						NavigationFactory.create("Login");
				controller.start();
				signUpScreen.setLoginController(thisObj);
				 signUpScreen.setVisible(true); 
			
			}
	});
	
	}
	
	

		
	public void login(String userName,String password) {
		try {
			if(studentDao.login(userName, password)) {
				Student currentUser=new Student();
				currentUser.setUserName(userName);
				Session.getInstance().setCurrentUser(currentUser);
				loginScreen	.close();
				Controller controller=
						NavigationFactory.create("After Successfull Login");
				controller.setStudentDao(studentDao);
				controller.start();
				
			}
			else {
				
				loginScreen.displayStatus("invalid username or password");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	}


	public static SignUpScreen getSignUpScreen() {
		return signUpScreen;
	}


	public static void setSignUpScreen(SignUpScreen signUpScreen) {
		LoginController.signUpScreen = signUpScreen;
	}
	
	
}
