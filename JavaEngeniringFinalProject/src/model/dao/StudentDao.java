package model.dao;

import model.transferObjects.Student;

public interface StudentDao {

	void insert(Student student) throws Exception;

	boolean login(String userName, String password) throws Exception;
	
	boolean isUserExist(String userName) throws Exception;
	
	Student getStudent(String userName) throws Exception;

}