package main;

import java.awt.EventQueue;
import java.net.URLDecoder;

import javax.swing.JOptionPane;

import controller.LoginController;
import controller.SignUpController;
import controller.TestController;
import model.dao.StudentDao;
import model.daoImpl.StudentDaoImplForSqlite;
import model.daoImpl.StudentDaoImplMock;
import model.transferObjects.Student;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;
import view.screens.TestScreen;

public class Main {

	public static void main(String[] args) {
		try {

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						startApplication();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});



		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void startApplication() {
		try {
			StudentDaoImplForSqlite studentDaoImplForSqlite=new StudentDaoImplForSqlite();
			StudentDaoImplForSqlite studentDaoImplForSqlite2=new StudentDaoImplForSqlite();
			//inject dependency to the object 
			String path=Main.class.getClassLoader().getResource("").getPath();
			//System.out.println(path);
			String fullPath=URLDecoder.decode(path,"UTF-8");
			fullPath=fullPath.substring(1);
			String dbPath="jdbc:sqlite:"+fullPath+"students.db";
			studentDaoImplForSqlite.setConnectionString(dbPath);
			studentDaoImplForSqlite.connect();
			studentDaoImplForSqlite2.setConnectionString(dbPath);
			studentDaoImplForSqlite2.connect();
			
			StudentDao studentDao=studentDaoImplForSqlite;
			
			StudentDao studentDao2=studentDaoImplForSqlite2;

			

			
			
			SignUpController signUpController=new SignUpController();
			LoginController loginController=new LoginController();
			LoginScreen loginScreen =new LoginScreen();
			loginScreen.setLoginController(loginController);
			loginScreen.setSignUpController(signUpController);
			SignUpDialog signUpDialog=new SignUpDialog();
			
			
			


			
			signUpController.setLoginScreen(loginScreen);
			signUpController.setSignUpDialog(signUpDialog);
			signUpController.setStudentDao(studentDao);
			signUpDialog.setSignUpController(signUpController);

			
			loginController.setStudentDao(studentDao);
			loginController.setLoginScreen(loginScreen);
			loginController.setSignUpDialog(signUpDialog);
			
			
			TestScreen testScreen=new TestScreen();
			TestController testController=new TestController();
			testController.setTestScreen(testScreen);
			testController.setStudentDao(studentDao);
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
