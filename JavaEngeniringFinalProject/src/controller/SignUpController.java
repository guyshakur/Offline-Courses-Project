package controller;

import java.awt.EventQueue;

import model.dao.StudentDao;
import view.screens.LoginScreen;
import view.screens.SignUpScreen;

public class SignUpController implements Controller {
	private static LoginController thisObj=null;
	private static SignUpScreen registrationScreen=null;
	private static LoginScreen loginScreen=null;
	

	public static SignUpScreen getRegistrationScreen() {
		return registrationScreen;
	}

	public static void setRegistrationScreen(SignUpScreen registrationScreen) {
		SignUpController.registrationScreen = registrationScreen;
	}

	@Override
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					loginScreen.setLoginController(thisObj);
					registrationScreen.setVisible(true);
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	@Override
	public void setStudentDao(StudentDao studentDao) {
		// TODO Auto-generated method stub
		
	}

}
