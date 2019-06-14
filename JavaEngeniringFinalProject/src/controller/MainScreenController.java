package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.MainScreen;
import view.utilities.DisplayFromSession;
import view.utilities.Quiz;

public class MainScreenController implements Controller {
	private static MainScreenController thisObj=null;
	private static MainScreen mainScreen=null;
	private static StudentDao studentDao=null;
	private  static LoginController loginController=null;
	private static Controller controller=null;




	public StudentDao getStudentDao() {
		return studentDao;
	}



	public void setStudentDao(StudentDao studentDao) {

		MainScreenController.studentDao = studentDao;
	}



	public MainScreen getTestScreen() {
		return mainScreen;
	}



	public void setMainScreen(MainScreen testScreen) {
		this.mainScreen = testScreen;
	}



	public MainScreenController() {
		thisObj=this;
	}


	@Override
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainScreen.setMainScreenController(thisObj);
					Student student=studentDao.getStudent(Session.getInstance().getCurrentUser().getUserName());
					DisplayFromSession displayFromSession=new DisplayFromSession();
					displayFromSession.displaylblUser(student.getFirstName(), student.getLastName(), mainScreen.getLblHelloFirstAndLastName());
					MainScreenController.mainScreen.setVisible(true);


				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}



	public void logOut() {

		mainScreen.dispose();
		loginController.cleanTextFields();
		loginController.start();

	}



	public static LoginController getLoginController() {
		return loginController;
	}



	public static void setLoginController(LoginController loginController) {
		MainScreenController.loginController = loginController;
	}

	public void selectedSubject(String selected) {

		 controller=
				NavigationFactory.create(selected);
		controller.setStudentDao(studentDao);
		
		controller.start();
		mainScreen.dispose();
		
	}







	
	



}
