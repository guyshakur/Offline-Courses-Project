package model.daoImpl;

import java.sql.*;

import model.dao.StudentDao;
import model.transferObjects.Student;


public class StudentDaoImplForSqlite implements StudentDao {

	private String connectionString=null;
	private Connection connection=null;
	private PreparedStatement statment=null;




	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void connect() throws Exception {
		try {
			Class.forName("org.sqlite.JDBC");
			//connection=DriverManager.getConnection("jdbc:sqlite:C:/Users/USER/Desktop/students.db");
			connection=DriverManager.getConnection(connectionString);
		} catch (Exception e) {
			throw new Exception("Failed connecting to db. "+e.getMessage());
		}


	}

	@Override
	public void insert(Student student) throws Exception {
		try {
			String sql="INSERT INTO students (user_name, password, first_name, last_name) "+
					"VALUES (?,?,?,?)";
			statment = connection.prepareStatement(sql);
			statment.setString(1, student.getUserName());
			statment.setString(2, student.getPassword());
			statment.setString(3, student.getFirstName());
			statment.setString(4, student.getLastName());
			statment.executeUpdate();

		} catch (SQLException e) {
			throw new Exception("Failed to insert student to db. "+e.getMessage());
		}
		finally {

			if(statment!=null) {
				statment.close();
			}
		}

	}

	public boolean isUserExist(String userName) throws Exception {
		boolean result=false;
		ResultSet resultSet=null;
		try {
			String sql="SELECT user_name FROM students WHERE user_name=?";
			statment = connection.prepareStatement(sql);
			statment.setString(1, userName);
			resultSet=statment.executeQuery();

			result = resultSet.next();

			return result;

		} catch (Exception e) {
			throw new Exception("Failed to check if user exist in db. "+e.getMessage());
		}
		finally {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statment!=null) {
				statment.close();
			}
		}
	}

	@Override
	public boolean login(String userName,String password) throws Exception {
		boolean result=false;
		ResultSet resultSet=null;
		try {
			String sql="SELECT user_name FROM students WHERE user_name=? AND password=?";
			statment = connection.prepareStatement(sql);
			statment.setString(1, userName);
			statment.setString(2, password);
			resultSet=statment.executeQuery();

			result = resultSet.next();

			return result;

		} catch (Exception e) {
			throw new Exception("Failed to check student in  db . "+e.getMessage());
		}
		finally {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statment!=null) {
				statment.close();
			}
		}
	}

	@Override
	public Student getStudent(String userName) throws Exception {
		Student student =null;
		ResultSet resultSet=null;
		try {
			String sql="SELECT user_name,first_name,last_name,password FROM students WHERE user_name=?";
			statment = connection.prepareStatement(sql);
			statment.setString(1, userName);
			resultSet=statment.executeQuery();

			if(resultSet.next()) {
				student=new Student();
				student.setUserName(resultSet.getString("user_name"));
				student.setFirstName(resultSet.getString("first_name"));
				student.setLastName(resultSet.getString("last_name"));
				student.setPassword(resultSet.getString("password"));
			}

			return student;

		} catch (Exception e) {
			throw new Exception("Failed to get user from db. "+e.getMessage());
		}
		finally {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statment!=null) {
				statment.close();
			}
		}
	}



}
