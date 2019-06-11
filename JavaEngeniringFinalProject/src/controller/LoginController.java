package controller;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.CCourseScreen;
import view.screens.CQuizScreen;
import view.screens.CQuizPage2Screen;
import view.screens.CQuizPage3Screen;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;
import view.screens.MainScreen;
import view.utilities.InputValidator;

public class LoginController implements Controller {
	private static LoginController thisObj=null;
	private static LoginScreen loginScreen=null;
	private static CQuizScreen cQuizScreen=null;
	private static CQuizPage2Screen cQuizScreenNextPage=null;
	private static SignUpDialog signUpDialog=null;
	private MainScreen testScreen=null;
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



	public MainScreen getTestScreen() {
		return testScreen;
	}



	public void setTestScreen(MainScreen testScreen) {
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
				Student currentUser=new Student();
				currentUser.setUserName(userName);
				Session.getInstance().setCurrentUser(currentUser);
				loginScreen	.close();
				Controller controller=
						NavigationFactory.create("After Successfull Login");
				//controller.setStudentDao(studentDao);
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


	public void cleanTextFields() {
		loginScreen.getHintTextUserName().setText("");
		loginScreen.getHintPasswordField().setText("");
	}





}
