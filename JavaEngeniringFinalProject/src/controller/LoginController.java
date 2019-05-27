package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.dao.StudentDao;
import view.screens.LoginScreen;
import view.screens.TestScreen;

public class LoginController implements Controller {
	private static LoginController thisObj=null;
	private static LoginScreen loginScreen=null;
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

	public void login(String userName,String password) {
		try {
			if(studentDao.login(userName, password)) {
				loginScreen	.close();
				Controller controller=
						NavigationFactory.create("After Successfull Login");
				controller.start();
			}
			else {
				
				loginScreen.displayStatus("invalid username or password");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}
