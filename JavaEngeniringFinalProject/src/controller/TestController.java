package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.TestScreen;

public class TestController implements Controller {
	private static TestController thisObj=null;
	private static TestScreen testScreen=null;
	private static StudentDao studentDao=null;
	
	
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}



	public void setStudentDao(StudentDao studentDao) {

		TestController.studentDao = studentDao;
	}



	public TestScreen getTestScreen() {
		return testScreen;
	}



	public void setTestScreen(TestScreen testScreen) {
		this.testScreen = testScreen;
	}



	public TestController() {
		thisObj=this;
	}
	

	@Override
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testScreen.setTestController(thisObj);
					Student student=studentDao.getStudent(Session.getInstance().getCurrentUser().getUserName());
					testScreen.displayName(student.getFirstName());
					TestController.testScreen.setVisible(true);
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	
	
}
