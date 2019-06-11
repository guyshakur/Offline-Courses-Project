package controller;

import javax.swing.JFrame;

import view.screens.CQuizScreen;
import view.screens.MainScreen;

public  class NavigationFactory {
	
    //factory method
	public static Controller create(String name) {
		
		switch (name){
			case "Login":
				return new LoginController();
			
			case "After Successfull Login":
				return new MainScreenController();
			
			case "Sign Up":
				return new SignUpController();
				
			case "C Quiz":
//				CQuizScreen cQuizScreen=new CQuizScreen();
//				CQuizController cQuizController=new CQuizController();
//				cQuizScreen.setcQuizController(cQuizController);
//				cQuizController.setcQuizScreen(cQuizScreen);
//				MainScreen mainScreen=new MainScreen();
//				mainScreen.dispose();
				return new CQuizController();
				
			default :
				return null;
		}
	}
}
