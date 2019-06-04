package controller;

import java.awt.EventQueue;

import model.dao.StudentDao;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;

public class SignUpController implements Controller {
	private static LoginController thisObj=null;
	private static SignUpDialog registrationScreen=null;
	private static LoginScreen loginScreen=null;
	

	public static SignUpDialog getRegistrationScreen() {
		return registrationScreen;
	}

	public static void setRegistrationScreen(SignUpDialog registrationScreen) {
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
