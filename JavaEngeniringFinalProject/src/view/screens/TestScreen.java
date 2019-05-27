package view.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.TestController;
import model.dao.StudentDao;

import javax.swing.JLabel;

public class TestScreen extends JFrame {

	private JPanel contentPane;
	private TestController testController=null;
	private JLabel lblNewLabel;
	

	public TestController getTestController() {
		return testController;
	}

	public void setTestController(TestController testController) {
		this.testController = testController;
	}
	
	public static String displayName(String username) {
		return username;

	}
	
	

	/**
	 * Create the frame.
	 */
	public TestScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel();
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}
