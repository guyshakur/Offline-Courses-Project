package controller;

import model.dao.StudentDao;

public interface Controller {

	Controller controller=null;
	
	public void start();
	public void setStudentDao(StudentDao studentDao) ;
	
}
