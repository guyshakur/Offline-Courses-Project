package controller;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;
import view.screens.TestScreen;

public class LoginController implements Controller {
	private static LoginController thisObj=null;
	private static LoginScreen loginScreen=null;
	//private static SignUpScreen signUpScreen=null;
	private static SignUpDialog signUpDialog=null;
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

	public void startSignUpDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Controller controller=
						NavigationFactory.create("Login");
				signUpDialog.setLoginController(thisObj);	
				signUpDialog.setLocationRelativeTo(loginScreen);
				setEnable();
				signUpDialog.setVisible(true); 



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


	public  SignUpDialog getSignUpScreen() {
		return signUpDialog;
	}


	public  void setSignUpDialog(SignUpDialog signUpDialog) {
		LoginController.signUpDialog = signUpDialog;
	}

	public void setEnable() {

		if (loginScreen.isEnabled()) {
			loginScreen.setEnabled(false);
		}
		else
			loginScreen.setEnabled(true);
	}
}
