package view.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.MainScreenController;
import model.dao.StudentDao;
import view.utilities.RoundedBorder;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class MainScreen extends JFrame {
	Color c=new Color(171,240,250);
	Color c2=new Color(169,192,237);

	private JPanel panelBar;
	private JPanel panelImage;
	private JLabel lblImage;
	private JLabel lblNewLabel;
	JLabel lblHelloFirstAndLastName;
	private JLabel lblClickLogOut;
	private JLabel lblClickCourses;
	private JLabel lblClickQuizzes;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblClickGoals;
	private JSeparator separator_2;
	private JPanel contentPane;
	private MainScreenController mainScreenController=null;
	private JButton btnCChoise;
	private JButton btnJavaChoise;
	private JButton btnDataStructuresChoise;
	private JButton btnSqlChoise;
	public String selectedItem;



	public MainScreen() {

		//panelImage & lblImage
		ImageIcon image_icon=new ImageIcon(getClass().getResource("/view/images/lala.png"));
		Image image=image_icon.getImage();
		Image fixedImage=image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		image_icon=new ImageIcon(fixedImage);
		lblImage = new JLabel();
		panelImage = new JPanel();
		panelImage.setSize(120,120);
		lblImage.setIcon(image_icon);
		lblImage.setBounds(10, 11, 46, 14);
		lblImage.setSize(120,120);
		panelImage.add(lblImage);
		panelImage.setBounds(10, 13, 143, 138);
		panelImage.setLayout(null);
		panelImage.setBackground(c2);



		//lblhellousername
		lblHelloFirstAndLastName = new JLabel("New label");
		lblHelloFirstAndLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloFirstAndLastName.setBounds(20, 160, 133, 14);

		//lblClickLogOut
		lblClickLogOut = new JLabel("Log Out");
		lblClickLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClickLogOut.setBounds(61, 185, 46, 14);

		//lblClickCourses
		lblClickCourses = new JLabel("Courses");
		lblClickCourses.putClientProperty("courses", lblClickCourses);
		lblClickCourses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClickCourses.setBounds(61, 274, 70, 14);
		lblClickCourses.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		//lblClickQuizzes
		lblClickQuizzes = new JLabel("Quizzes");
		lblClickQuizzes.putClientProperty("Quizzes", lblClickQuizzes);
		lblClickQuizzes.getClientProperty("Quizzes").getClass().getName();
		lblClickQuizzes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblClickQuizzes.setBounds(61, 311, 70, 14);
		lblClickQuizzes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		//lblClickGoals
		lblClickGoals = new JLabel("Goals");
		lblClickGoals.setBounds(61, 349, 46, 14);
		lblClickGoals.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		//separators
		separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 298, 143, 2);
		separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 336, 143, 2);
		separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 374, 143, 2);
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(151, 44, 296, 2);


		//panelBar
		panelBar = new JPanel();
		panelBar.setLayout(null);
		panelBar.setBounds(0, 0, 183, 1137);
		panelBar.add(lblHelloFirstAndLastName);
		panelBar.add(panelImage);
		panelBar.add(lblClickLogOut);
		panelBar.add(lblClickCourses);
		panelBar.add(lblClickQuizzes);
		panelBar.add(separator);
		panelBar.add(separator_1);
		panelBar.add(lblClickGoals);
		panelBar.add(separator_2);
		panelBar.setBackground(c2);
		
		btnCChoise = new JButton("C");
		btnCChoise.setBackground(Color.LIGHT_GRAY);
		btnCChoise.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCChoise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCChoise.setBounds(288, 90, 213, 198);
		
		btnJavaChoise = new JButton("JAVA");
		btnJavaChoise.setBackground(Color.LIGHT_GRAY);
		btnJavaChoise.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnJavaChoise.setBounds(798, 90, 213, 198);
		
		btnDataStructuresChoise = new JButton("DATA STRUCTURES");
		btnDataStructuresChoise.setBackground(Color.LIGHT_GRAY);
		btnDataStructuresChoise.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDataStructuresChoise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDataStructuresChoise.setBounds(288, 378, 213, 198);
		
		btnSqlChoise = new JButton("SQL");
		btnSqlChoise.setBackground(c);
		btnSqlChoise.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSqlChoise.setBounds(798, 378, 213, 198);
		
lblClickLogOut.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {

		mainScreenController.logOut();
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});

lblClickCourses.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {

	lblClickCourses.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblClickQuizzes.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblClickGoals.setFont(new Font("Tahoma", Font.PLAIN, 14));
	
	btnCChoise.setText("C");
	btnJavaChoise.setText("JAVA");
	btnDataStructuresChoise.setText("Data Structures");
	btnSqlChoise.setText("SQL");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});		

lblClickQuizzes.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		lblClickCourses.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClickQuizzes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClickGoals.setFont(new Font("Tahoma", Font.PLAIN, 14));		
		
		btnCChoise.setText("C Quiz");
		btnJavaChoise.setText("JAVA Quiz");
		btnDataStructuresChoise.setText("Data Structures Quiz");
		btnSqlChoise.setText("SQL Structures Quiz");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});

lblClickGoals.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		lblClickCourses.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClickQuizzes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClickGoals.setFont(new Font("Tahoma", Font.BOLD, 14));		
		
		
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});


btnCChoise.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		selectedItem=btnCChoise.getText();	
		mainScreenController.selectedSubject(selectedItem);
	}
});
		//maincontent
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1300,900);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(panelBar);
		contentPane.setBackground(c);
		contentPane.add(btnCChoise);
		contentPane.add(btnJavaChoise);
		contentPane.add(btnSqlChoise);
		contentPane.add(btnDataStructuresChoise);
		
		





	}
	
	
	

	public MainScreenController getMainScreenController() {
		return mainScreenController;
	}

	public void setMainScreenController(MainScreenController mainScreenController) {
		this.mainScreenController = mainScreenController;
	}



	public JLabel getLblHelloFirstAndLastName() {
		return lblHelloFirstAndLastName;
	}



	public void setLblHelloFirstAndLastName(JLabel lblHelloFirstAndLastName) {
		this.lblHelloFirstAndLastName = lblHelloFirstAndLastName;
	}
	
	

}

