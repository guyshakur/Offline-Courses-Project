package controller;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.CQuizPage2Screen;
import view.screens.CQuizPage3Screen;
import view.screens.CQuizScreen;
import view.screens.MainScreen;
import view.utilities.DisplayFromSession;

public class CQuizController implements Controller {

private static CQuizController thisObj=null;	
private static CQuizScreen cQuizScreen=null;
private static MainScreen mainScreen=null;
private static CQuizPage2Screen cQuizPage2Screen=null;
private static CQuizPage3Screen cQuizPage3Screen=null;
private StudentDao studentDao=null;
@Override



public void start() {
	cQuizScreen.setVisible(true);
	

	mainScreen.dispose();
	Student student;
	try {
		student = studentDao.getStudent(Session.getInstance().getCurrentUser().getUserName());
		DisplayFromSession displayFromSession=new DisplayFromSession();
		displayFromSession.displaylblUser(student.getFirstName(), student.getLastName(), cQuizScreen.getLblHelloFirstAndLastName());

	} catch (Exception e) {
System.out.println("fff");		
e.printStackTrace();
	}

}
@Override
public void setStudentDao(StudentDao studentDao) {
	this.studentDao=studentDao;
	
}
public static CQuizScreen getcQuizScreen() {
	return cQuizScreen;
}
public static void setcQuizScreen(CQuizScreen cQuizScreen) {
	CQuizController.cQuizScreen = cQuizScreen;
}
public static MainScreen getMainScreen() {
	return mainScreen;
}
public static void setMainScreen(MainScreen mainScreen) {
	CQuizController.mainScreen = mainScreen;
}
public static CQuizPage2Screen getcQuizPage2Screen() {
	return cQuizPage2Screen;
}
public static void setcQuizPage2Screen(CQuizPage2Screen cQuizPage2Screen) {
	CQuizController.cQuizPage2Screen = cQuizPage2Screen;
}
public static CQuizPage3Screen getcQuizPage3Screen() {
	return cQuizPage3Screen;
}
public static void setcQuizPage3Screen(CQuizPage3Screen cQuizPage3Screen) {
	CQuizController.cQuizPage3Screen = cQuizPage3Screen;
}

public CQuizController() {
	
	thisObj=this;
}
	
	
}
