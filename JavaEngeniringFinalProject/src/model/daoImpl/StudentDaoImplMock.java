package model.daoImpl;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import model.dao.StudentDao;
import model.transferObjects.Student;


public class StudentDaoImplMock implements StudentDao {

	HashMap <String,Student> students = new HashMap<String, Student>();
	
	




	public String getConnectionString() {
		return "";
	}

	public void setConnectionString(String connectionString) {
		
	}

	public void connect() throws Exception {
		

	}

	@Override
	public void insert(Student student) throws Exception {
		students.put(student.getUserName(),student);
	}

	public boolean isUserExist(String userName) throws Exception {
		return students.containsKey(userName);
	}

	@Override
	public boolean login(String userName,String password) throws Exception {
		if(!isUserExist(userName)) {
			return false;
		}
		
		return students.get(userName).getPassword().equals(password);
	}

	@Override
	public Student getStudent(String userName) throws Exception {
		// TODO Auto-generated method stub
		return students.get(userName);
	}
	
	
	

}
