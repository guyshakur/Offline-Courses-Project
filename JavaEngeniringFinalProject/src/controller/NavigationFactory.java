package controller;

import javax.swing.JFrame;

public  class NavigationFactory {
	
    //factory method
	public static Controller create(String name) {
		
		switch (name){
			case "Login":
				return new LoginController();
			
			case "After Successfull Login":
				return new TestController();
				
			default :
				return null;
		}
	}
}
