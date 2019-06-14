package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import model.Session;
import model.dao.StudentDao;
import model.transferObjects.Student;
import view.screens.CCourseScreen;
import view.screens.CQuizPage2Screen;
import view.screens.CQuizPage3Screen;
import view.screens.CQuizScreen;
import view.screens.LoginScreen;
import view.screens.MainScreen;
import view.screens.StartTestDialog;
import view.utilities.DisplayFromSession;
import view.utilities.Quiz;

public class CQuizController implements Controller {
	private static Controller controller=null;
	private static CQuizController thisObj=null;	
	private static CQuizScreen cQuizScreen=null;
	private static MainScreen mainScreen=null;
	private static StartTestDialog startTestDialog=null;
	private static CQuizPage2Screen cQuizPage2Screen=null;
	private static CQuizPage3Screen cQuizPage3Screen=null;
	private StudentDao studentDao=null;
	private  Quiz quiz=null;
	Timer timer;
	public int sec=0;
	public int min=10;
	public int curSec=0;
	public int curMin=0;
	public static int pageNumber=0;

	private LoginController loginController=null;


	@Override
	public void start() {
		cQuizScreen.setVisible(true);
		Student student;
		try {
			student = studentDao.getStudent(Session.getInstance().getCurrentUser().getUserName());
			DisplayFromSession displayFromSession=new DisplayFromSession();
			displayFromSession.displaylblUser(student.getFirstName(), student.getLastName(), cQuizScreen.getLblHelloFirstAndLastName());
			displayFromSession.displaylblUser(student.getFirstName(), student.getLastName(), cQuizPage2Screen.getLblHelloFirstAndLastName());

		} catch (Exception e) {
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


	public void startTestDialog() {


		startTestDialog=new StartTestDialog();
		startTestDialog.setVisible(true);

	}


	
	public void startTheTest() {
		quiz.visibaleAll();
		sec=0;
		min=10;

		quiz.getPanelBar().setEnabled(false);
		quiz.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		timer=new Timer(1000, new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {
				curMin=min;
				curSec=sec;
				if(sec<=0) {
					min--;
					sec=60;
					cQuizScreen.getLblMin().setText("0"+min+":");

				}
				sec--;
				if(sec<=10) {
					cQuizScreen.getLblSec().setText("0"+sec);
				}
				else
					cQuizScreen.getLblSec().setText(""+sec);

				if(min==0&&sec==0) {

					timer.stop();
				}


			}
		});

		timer.start();
	}
	
	public  Quiz getQuiz() {
		return quiz;
	}
	
	
	public  void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public void goToNextOrPrevPage() {
		
		if(pageNumber==0) {
			cQuizScreen.setVisible(true);
			cQuizPage2Screen.dispose();
			cQuizScreen.getPanelBar().setEnabled(false);
			cQuizScreen.getPanelImage().setEnabled(false);
			cQuizScreen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			cQuizScreen.getLblMin().setText("0"+min+":");
			if(curSec<10) {
				cQuizScreen.getLblSec().setText("0"+sec);
			}
			else
				cQuizScreen.getLblSec().setText(""+curSec);
			
			timer=new Timer(1000, new ActionListener() {



				@Override
				public void actionPerformed(ActionEvent e) {
					cQuizScreen.getLblMin().setText("0"+min+":");
					if(curSec<=0) {
						curMin--;
						curSec=60;
						cQuizScreen.getLblMin().setText("0"+min+":");

					}
					curSec--;
					if(curSec<10) {
						cQuizScreen.getLblSec().setText("0"+sec);
					}
					else
						cQuizScreen.getLblSec().setText(""+curSec);

					if(min==0&&sec==0) {

						timer.stop();
					}


				}
			});

			timer.start();
			
		}
		else if(pageNumber==1) {
			cQuizPage2Screen.setVisible(true);
			cQuizScreen.dispose();
			cQuizPage3Screen.dispose();
			cQuizPage2Screen.getPanelBar().setEnabled(false);
			cQuizPage2Screen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			cQuizPage2Screen.getLblMin().setText("0"+min+":");
			if(curSec<10) {
				cQuizPage2Screen.getLblSec().setText("0"+sec);
			}
			else
				cQuizPage2Screen.getLblSec().setText(""+curSec);
			
			timer=new Timer(1000, new ActionListener() {



				@Override
				public void actionPerformed(ActionEvent e) {
					cQuizPage2Screen.getLblMin().setText("0"+min+":");
					if(curSec<=0) {
						curMin--;
						curSec=60;
						cQuizPage2Screen.getLblMin().setText("0"+min+":");

					}
					curSec--;
					if(curSec<10) {
						cQuizPage2Screen.getLblSec().setText("0"+sec);
					}
					else
						cQuizPage2Screen.getLblSec().setText(""+curSec);

					if(min==0&&sec==0) {

						timer.stop();
					}


				}
			});

			timer.start();
		}
		
		else if(pageNumber==2) {
			cQuizPage3Screen.setVisible(true);
			cQuizPage2Screen.dispose();
			cQuizPage3Screen.getPanelBar().setEnabled(false);
			cQuizPage3Screen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			cQuizPage3Screen.getLblMin().setText("0"+min+":");
			if(curSec<10) {
				cQuizPage3Screen.getLblMin().setText("0"+sec);
			}
			else
				cQuizPage3Screen.getLblMin().setText(""+curSec);
			
			timer=new Timer(1000, new ActionListener() {



				@Override
				public void actionPerformed(ActionEvent e) {
					cQuizPage3Screen.getLblMin().setText("0"+min+":");
					if(curSec<=0) {
						curMin--;
						curSec=60;
						cQuizPage3Screen.getLblMin().setText("0"+min+":");

					}
					curSec--;
					if(curSec<10) {
						cQuizPage3Screen.getLblMin().setText("0"+sec);
					}
					else
						cQuizPage3Screen.getLblMin().setText(""+curSec);

					if(min==0&&sec==0) {

						timer.stop();
					}


				}
			});

			timer.start();
		}

	}
	
	public void logOut() {
		if(pageNumber==0) {
			cQuizScreen.dispose();
			loginController.start();
			loginController.cleanTextFields();
		}
		else if(pageNumber==1) {
			cQuizScreen.dispose();
			loginController.start();
			loginController.cleanTextFields();
	}
		
		else if(pageNumber==2) {
			cQuizPage3Screen.disable();
			loginController.start();
			loginController.cleanTextFields();
		}
		
	}

	public void setLoginController(LoginController loginController) {
		this.loginController=loginController;
	}
}
