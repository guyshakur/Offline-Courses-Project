package main;

import java.awt.EventQueue;
import java.net.URLDecoder;

import javax.swing.JOptionPane;

import controller.CQuizController;
import controller.LoginController;
import controller.SignUpController;
import controller.MainScreenController;
import model.dao.StudentDao;
import model.daoImpl.StudentDaoImplForSqlite;
import model.daoImpl.StudentDaoImplMock;
import model.transferObjects.Student;
import view.screens.CQuizPage2Screen;
import view.screens.CQuizPage3Screen;
import view.screens.CQuizScreen;
import view.screens.LoginScreen;
import view.screens.SignUpDialog;
import view.screens.StartTestDialog;
import view.utilities.Quiz;
import view.screens.MainScreen;

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

			
			
			MainScreen mainScreen=new MainScreen();
			MainScreenController mainScreenController=new MainScreenController();
			mainScreen.setMainScreenController(mainScreenController);
			mainScreenController.setMainScreen(mainScreen);
			mainScreenController.setLoginController(loginController);
			
			mainScreenController.setStudentDao(studentDao);
			loginController.start();
			
			CQuizController cQuizController=new CQuizController();
			CQuizScreen cQuizScreen=new CQuizScreen();
			cQuizController.setMainScreen(mainScreen);
			cQuizController.setcQuizScreen(cQuizScreen);
			cQuizController.setStudentDao(studentDao);
			cQuizScreen.setcQuizController(cQuizController);
			
			StartTestDialog startTestDialog=new StartTestDialog();
			startTestDialog.setcQuizController(cQuizController);
			
			Quiz quiz = new CQuizScreen();
			cQuizController.setcQuizScreen((CQuizScreen) quiz);
			quiz.setcQuizController(cQuizController);
			cQuizController.setQuiz(quiz);
			CQuizPage2Screen cQuizPage2Screen=new CQuizPage2Screen();
			cQuizController.setcQuizPage2Screen(cQuizPage2Screen);
			cQuizController.setLoginController(loginController);
			CQuizPage3Screen cQuizPage3Screen=new CQuizPage3Screen();
			cQuizController.setcQuizPage3Screen(cQuizPage3Screen);
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
			MainScreen testScreen=new MainScreen();
			loginController.setLoginScreen(loginScreen);
			loginController.setTestScreen(testScreen);
			loginController.start();
		}
		catch (Exception e){
			System.out.println("Failed to Start Application. "+e.getMessage());

		}
	}

}
