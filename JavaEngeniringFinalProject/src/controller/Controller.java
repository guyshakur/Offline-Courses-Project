package controller;

import model.dao.StudentDao;

public interface Controller {

	public void start();
	public void setStudentDao(StudentDao studentDao) ;
	
}
