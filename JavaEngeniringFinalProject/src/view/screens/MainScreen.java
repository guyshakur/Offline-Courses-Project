package view.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MainScreenController;
import model.dao.StudentDao;
import view.utilities.RoundedBorder;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainScreen extends JFrame {
	
	
	JButton btnCCourse;
	private MainScreenController testController=null;
	private JLabel lblFirstName;
	Color c=new Color(171,240,250);
	public MainScreenController getTestController() {
		return testController;
	}

	public void setTestController(MainScreenController testController) {
		this.testController = testController;
	}
	
	public void displayName(String firstName,String lastName) {
		
		lblFirstName.setText("Hello "+firstName+" "+lastName);

	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		getContentPane().setBackground(c);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1392, 783);
		getContentPane().setLayout(null);
		
		lblFirstName = new JLabel("New label");
		lblFirstName.setBounds(50, 287, 175, 62);
		getContentPane().add(lblFirstName);
		
		JPanel panel = new JPanel();
		panel.setBackground(c);
		panel.setBounds(24, 421, 201, 293);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(c);
		panel_1.setBounds(288, 11, 1078, 722);
		getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel Courses_panel = new JPanel();
		Courses_panel.setBackground(c);
		panel_1.add(Courses_panel, "name_63400458013500");
		Courses_panel.setLayout(null);
		
		JButton btnCCourse = new JButton("C");
		btnCCourse.setBackground(c);
		btnCCourse.setBorder(new RoundedBorder());
		btnCCourse.setFont(new Font("Cambria", Font.BOLD, 70));
		btnCCourse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CCourseScreen cCourseScreen=new CCourseScreen();
				cCourseScreen.setVisible(true);
				
			}
		});
		btnCCourse.setBounds(10, 11, 500, 340);
		Courses_panel.add(btnCCourse);
		
		JButton btnJava = new JButton("JAVA");
		btnJava.setFont(new Font("Cambria", Font.BOLD, 70));
		btnJava.setBackground(c);
		btnJava.setBorder(new RoundedBorder());
		btnJava.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJava.setBounds(568, 11, 500, 340);
		Courses_panel.add(btnJava);
		
		JButton btnDataStructures = new JButton("DATA STRUCTURES");
		btnDataStructures.setFont(new Font("Cambria", Font.BOLD, 50));
		btnDataStructures.setBackground(c);
		btnDataStructures.setBorder(new RoundedBorder());
		btnDataStructures.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDataStructures.setBounds(10, 371, 500, 340);
		Courses_panel.add(btnDataStructures);
		
		JButton btnSql = new JButton("SQL");
		btnSql.setFont(new Font("Cambria", Font.BOLD, 70));
		btnSql.setBackground(c);
		btnSql.setBorder(new RoundedBorder());
		btnSql.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSql.setBounds(568, 371, 500, 340);
		Courses_panel.add(btnSql);
		
		JPanel Quizzes_panel = new JPanel();
		Quizzes_panel.setBackground(c);
		panel_1.add(Quizzes_panel, "name_63436498058100");
		Quizzes_panel.setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Cambria", Font.BOLD, 70));
		btnC.setBackground(c);
		btnC.setBorder(new RoundedBorder());
		btnC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC.setBounds(568, 11, 500, 340);
		Quizzes_panel.add(btnC);
		
		JButton btnJava_1 = new JButton("JAVA");
		btnJava_1.setFont(new Font("Cambria", Font.BOLD, 70));
		btnJava_1.setBackground(c);
		btnJava_1.setBorder(new RoundedBorder());
		btnJava_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJava_1.setBounds(10, 11, 500, 340);
		Quizzes_panel.add(btnJava_1);
		
		JButton btnSql_1 = new JButton("SQL");
		btnSql_1.setFont(new Font("Cambria", Font.BOLD, 70));
		btnSql_1.setBackground(c);
		btnSql_1.setBorder(new RoundedBorder());
		btnSql_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSql_1.setBounds(10, 371, 500, 340);
		Quizzes_panel.add(btnSql_1);
		
		JButton btnDataStructures_1 = new JButton("DATA STRUCTURES");
		btnDataStructures_1.setFont(new Font("Cambria", Font.BOLD, 50));
		btnDataStructures_1.setBackground(c);
		btnDataStructures_1.setBorder(new RoundedBorder());
		btnDataStructures_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDataStructures_1.setBounds(568, 371, 500, 340);
		Quizzes_panel.add(btnDataStructures_1);
		
		JPanel Goals_panel = new JPanel();
		Goals_panel.setBackground(c);
		panel_1.add(Goals_panel, "name_63440637138700");
		Goals_panel.setLayout(null);
		
		JButton btnMyMedals = new JButton("MY MEDALS");
		btnMyMedals.setFont(new Font("Cambria", Font.BOLD, 55));
		btnMyMedals.setBackground(c);
		btnMyMedals.setBorder(new RoundedBorder());
		btnMyMedals.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMyMedals.setBounds(568, 11, 500, 340);
		Goals_panel.add(btnMyMedals);
		
		JButton btnSolvedPuzzles = new JButton("SOLVED QUIZZES");
		btnSolvedPuzzles.setFont(new Font("Cambria", Font.BOLD, 55));
		btnSolvedPuzzles.setBackground(c);
		btnSolvedPuzzles.setBorder(new RoundedBorder());
		btnSolvedPuzzles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSolvedPuzzles.setBounds(10, 11, 500, 340);
		Goals_panel.add(btnSolvedPuzzles);
		
		JButton btnRankingTable = new JButton("RANKING TABLE");
		btnRankingTable.setFont(new Font("Cambria", Font.BOLD, 55));
		btnRankingTable.setBackground(c);
		btnRankingTable.setBorder(new RoundedBorder());
		btnRankingTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRankingTable.setBounds(294, 371, 500, 340);
		Goals_panel.add(btnRankingTable);
		
		JButton btnQuizzes = new JButton("Quizzes");
		JButton btnCourses = new JButton("Courses");
		btnCourses.setEnabled(false);
		JButton btnGoals = new JButton("Goals");
		
		btnCCourse=new JButton();
		btnCCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CCourseScreen cCourseScreen=new CCourseScreen();
				cCourseScreen.setVisible(true);
				
				
			}
		});
		
		btnCourses.setFont(new Font("Cambria", Font.BOLD, 20));
		btnCourses.setBackground(c);
		btnCourses.setBorder(new RoundedBorder());
		btnCourses.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels
				panel_1.removeAll();
				panel_1.repaint();
				panel_1.revalidate();
				
				btnCourses.setEnabled(false);
				btnQuizzes.setEnabled(true);
				btnGoals.setEnabled(true);
				
				//adding panels
				panel_1.add(Courses_panel);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		btnCourses.setBounds(10, 11, 181, 83);
		panel.add(btnCourses);
		
		btnQuizzes.setFont(new Font("Cambria", Font.BOLD, 20));
		btnQuizzes.setBackground(c);
		btnQuizzes.setBorder(new RoundedBorder());
		btnQuizzes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuizzes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels
				panel_1.removeAll();
				panel_1.repaint();
				panel_1.revalidate();
				
				btnCourses.setEnabled(true);
				btnQuizzes.setEnabled(false);
				btnGoals.setEnabled(true);
				
				//adding panels
				panel_1.add(Quizzes_panel);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnQuizzes.setBounds(10, 105, 181, 83);
		panel.add(btnQuizzes);
		
		btnGoals.setFont(new Font("Cambria", Font.BOLD, 20));
		btnGoals.setBackground(c);
		btnGoals.setBorder(new RoundedBorder());
		btnGoals.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGoals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels
				panel_1.removeAll();
				panel_1.repaint();
				panel_1.revalidate();
				
				btnCourses.setEnabled(true);
				btnQuizzes.setEnabled(true);
				btnGoals.setEnabled(false);
				
				//adding panels
				panel_1.add(Goals_panel);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnGoals.setBounds(10, 199, 181, 83);
		panel.add(btnGoals);
	}
	
}
