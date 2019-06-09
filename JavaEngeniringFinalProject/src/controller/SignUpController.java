package controller;

import java.awt.EventQueue;

import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;
import view.screens.MainScreen;
import model.Session;
import model.dao.StudentDao;


public class SignUpController implements Controller {
	private static SignUpController thisObj=null;
	private static SignUpDialog signUpDialog=null;
	private static LoginScreen loginScreen=null;
	private MainScreen testScreen=null;
	private  StudentDao studentDao=null;

	public SignUpController() {
		thisObj=this;
	}


	public  SignUpDialog getRegistrationScreen() {
		return signUpDialog;
	}

	public  void setSignUpDialog(SignUpDialog signUpDialog) {
		SignUpController.signUpDialog = signUpDialog;
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
					setEnable();
					signUpDialog.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}


	public void setEnable() {
		boolean isEnabled=loginScreen.isEnabled();
		loginScreen.setEnabled(!isEnabled);


	}



	public void setLoginScreen(LoginScreen loginScreen) {
		SignUpController.loginScreen = loginScreen;
	}


	public void saveUser(String firstName,String lastName,String userName,String password) {
		
		
		Student student =new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setUserName(userName);
		student.setPassword(password);

		try {
			Session.getInstance().setCurrentUser(student);
			this.studentDao.insert(student);
			


					Controller controller=
							NavigationFactory.create("After Successfull Login");
					controller.setStudentDao(studentDao);
					controller.start();
					loginScreen.dispose();
					signUpDialog.dispose();


		} catch (Exception e) {
			
			try {
				if(studentDao.isUserExist(userName)) {
					signUpDialog.displayStatusLabel();
					return;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();		}
	}


}
