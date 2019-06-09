package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.MainScreen;

public class MainScreenController implements Controller {
	private static MainScreenController thisObj=null;
	private static MainScreen testScreen=null;
	private static StudentDao studentDao=null;
	
	
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}



	public void setStudentDao(StudentDao studentDao) {

		MainScreenController.studentDao = studentDao;
	}



	public MainScreen getTestScreen() {
		return testScreen;
	}



	public void setTestScreen(MainScreen testScreen) {
		this.testScreen = testScreen;
	}



	public MainScreenController() {
		thisObj=this;
	}
	

	@Override
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testScreen.setTestController(thisObj);
					Student student=studentDao.getStudent(Session.getInstance().getCurrentUser().getUserName());
					testScreen.displayName(student.getFirstName(),student.getLastName());
					MainScreenController.testScreen.setVisible(true);
					
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	
	
}
