package view.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.TestController;
import model.dao.StudentDao;

import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class TestScreen extends JFrame {
	private TestController testController=null;
	private JLabel lblFirstName;

	public TestController getTestController() {
		return testController;
	}

	public void setTestController(TestController testController) {
		this.testController = testController;
	}
	
	public void displayName(String firstName) {
		
		lblFirstName.setText(firstName);

	}
	
	

	/**
	 * Create the frame.
	 */
	public TestScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblFirstName = new JLabel("New label");
		lblFirstName.setBounds(117, 101, 175, 62);
		getContentPane().add(lblFirstName);
	}
}
