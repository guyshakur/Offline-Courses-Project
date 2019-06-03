package main;

import java.awt.EventQueue;
import java.net.URLDecoder;

import javax.swing.JOptionPane;

import controller.LoginController;
import controller.TestController;
import model.dao.StudentDao;
import model.daoImpl.StudentDaoImplForSqlite;
import model.daoImpl.StudentDaoImplMock;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.SignUpScreen;
import view.screens.TestScreen;

public class Main {

	public static void main(String[] args) {
		try {

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						startApplication();
						//						TestScreen frame = new TestScreen();
						//						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});



		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}

		//new LoginScreen();
	}

	public static void startApplication() {
		try {
			StudentDaoImplForSqlite studentDaoImplForSqlite=new StudentDaoImplForSqlite();
			//inject dependency to the object 
			String path=Main.class.getClassLoader().getResource("").getPath();
			String fullPath=URLDecoder.decode(path,"UTF-8");
			fullPath=fullPath.substring(1);
			String dbPath="jdbc:sqlite:"+fullPath+"students.db";
			studentDaoImplForSqlite.setConnectionString(dbPath);
			studentDaoImplForSqlite.connect();
			
			StudentDao studentDao=studentDaoImplForSqlite;
			LoginController loginController=new LoginController();
			loginController.setStudentDao(studentDao);
			LoginScreen loginScreen =new LoginScreen();
			SignUpScreen signUpScreen=new SignUpScreen();
			TestScreen testScreen=new TestScreen();
			loginController.setLoginScreen(loginScreen);
			loginController.setSignUpScreen(signUpScreen);
			TestController testController=new TestController();
			testController.setTestScreen(testScreen);
			loginController.start();
		}
		catch (Exception e){
			System.out.println("Failed to Start Application. "+e.getMessage());

		}
	}

	public static void testApplication() {
		try {
			StudentDao studentDao=new StudentDaoImplMock();
			Student student =new Student();
			student.setUserName("guy");
			student.setPassword("123");
			studentDao.insert(student);
			LoginController loginController=new LoginController();
			loginController.setStudentDao(studentDao);
			LoginScreen loginScreen =new LoginScreen();
			TestScreen testScreen=new TestScreen();
			loginController.setLoginScreen(loginScreen);
			loginController.setTestScreen(testScreen);
			loginController.start();
		}
		catch (Exception e){
			System.out.println("Failed to Start Application. "+e.getMessage());

		}
	}

}
