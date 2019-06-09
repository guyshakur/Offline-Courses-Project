package view.screens;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.utilities.InsertToQuetionPanel;
import view.utilities.RoundBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.TextField;
import java.awt.Window;


public class CQuizPage2Screen extends JFrame{
	Color c=new Color(171,240,250);
	Color c2=new Color(169,192,237);
	private JPanel contentPane;
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
	private JPanel panelQuizz;
	private JPanel panelQuetion1;
	private JPanel panelQuetion3;
	private JPanel panelQuetion4;
	private JPanel panelQuetion5;
	private JPanel panelQuetion6;
	JLabel lblHeadLine;
	private JLabel lblHeadline;
	private JScrollPane scrollpaneQuetion1;
	JScrollPane scrollpaneQuetion5;
	JScrollPane scrollPane6;
	JScrollPane scrollpaneQuetion7;
	JScrollPane scrollpaneQuetion8;
	private JTextArea textAreaQuetion1;
	private JLabel lblQuetion1;
	private JLabel lblQuetion2;
	JRadioButton rdbQuetion1A;
	JRadioButton rdbQuetion1B;
	JRadioButton rdbQuetion1C;
	JRadioButton rdbQuetion1D;
	private JPanel panelQuetion2;
	private JScrollPane scrollPaneQuetion2;
	private JRadioButton rdbQuetion2A;
	private JRadioButton rdbQuetion2B;
	private JRadioButton rdbQuetion2C;
	private JRadioButton rdbQuetion2D;
	private JTextArea textAreaQuetion2;
	private JLabel label2;
	private JScrollPane scrollPaneQuetion3;
	private JRadioButton rdbQuetion3A;
	private JRadioButton rdbQuetion3B;
	private JRadioButton rdbQuetion3C;
	private JRadioButton rdbQuetion3D;
	private JTextArea textAreaQuetion3;
	private JLabel label;
	private JScrollPane scrollPaneQuetion4;
	private JRadioButton rdbQuetion4D;
	private JRadioButton rdbQuetion4A;
	private JRadioButton rdbQuetion4B;
	private JRadioButton rdbQuetion4C;
	private JTextArea textAreaQuetion4;
	private JTextArea textAreaQuetion5;
	private JLabel lblQuetion4;
	JButton btnNextPage;
	private JPanel panel;
	private JLabel lblQuetion5;
	private JRadioButton rdbQuetion5A;
	private JRadioButton rdbQuetion5B;
	private JRadioButton rdbQuetion5C;
	private JRadioButton rdbQuetion5D;
	private JLabel label6;
	private JScrollPane scrollPaneQuetion6;
	private JTextArea textAreaQuetion6;
	private JRadioButton rdbQuetion6A;
	private JRadioButton rdbQuetion6B;
	private JRadioButton rdbQuetion6C;
	private JRadioButton rdbQuetion6D;
	private JPanel panelQuetion7;
	private JScrollPane scrollPaneQuetion7;
	private JLabel label7;
	private JTextArea textAreaQuetion7;
	private JRadioButton rdbQuetion7A;
	private JRadioButton rdbQuetion7B;
	private JRadioButton rdbQuetion7C;
	private JRadioButton rdbQuetion7D;
	private JPanel panelQuetion8;
	private JScrollPane scrollPaneQuetion8;
	private JTextArea textAreaQuetion8;
	private JLabel lblQuetion8;
	private JRadioButton rdbQuetion8A;
	private JRadioButton rdbQuetion8B;
	private JRadioButton rdbQuetion8C;
	private JRadioButton rdbQuetion8D;
	private ButtonGroup btnGroupQuetion8;
	private JButton btnPrevPage;


	public CQuizPage2Screen() {


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
		lblClickCourses.setBounds(61, 274, 70, 14);
		lblClickCourses.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		//lblClickQuizzes
		lblClickQuizzes = new JLabel("Quizzes");
		lblClickQuizzes.setFont(new Font("Tahoma", Font.BOLD, 14));
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









		
		
		//lblHeadLineQuizz
		lblHeadline = new JLabel("C Programming Language");
		lblHeadline.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHeadline.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeadline.setBounds(120, 11, 302, 22);


		//panelQuetion5
		panelQuetion5 = new JPanel();
		panelQuetion5.setBounds(10, 110, 471, 291);
		panelQuetion5.setForeground(c);
		panelQuetion5.setBackground(c);
		panelQuetion5.setLayout(null);
		textAreaQuetion5 = new JTextArea();
		textAreaQuetion5.setText("In the context of the below program snippet, pick the best answer.\r\n#include \"stdio.h\"\r\nint arr[10][10][10];\r\nint main()\r\n{\r\n arr[5][5][5] = 123;\r\n return 0;\r\n}\r\n\r\nWhich of the given printf statement(s) would be able to print arr[5][5][5]\r\n");
		scrollpaneQuetion5 = new JScrollPane();
		scrollpaneQuetion5.setBorder(BorderFactory.createEmptyBorder());
		scrollpaneQuetion5.setForeground(c);
		scrollpaneQuetion5.setBounds(0, 0, 461, 176);
		scrollpaneQuetion5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollpaneQuetion5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpaneQuetion5.getHorizontalScrollBar().setBackground(c);
		panelQuetion5.add(scrollpaneQuetion5);
		scrollpaneQuetion5.setViewportView(textAreaQuetion5);
		scrollpaneQuetion5.setBackground(c);
		scrollpaneQuetion5.getVerticalScrollBar().setBackground(c);
		textAreaQuetion5.setBackground(c);
		textAreaQuetion5.setEditable(false);
		lblQuetion5 = new JLabel("5.");
		scrollpaneQuetion5.setColumnHeaderView(lblQuetion5);
		scrollpaneQuetion5.getColumnHeader().setBackground(c);
		textAreaQuetion5.setCaretPosition(0);
		rdbQuetion5A = new JRadioButton("A. only (i) would compile and print 123.");
		rdbQuetion5A.setBounds(0, 183, 444, 23);
		rdbQuetion5A.setBackground(c);
		panelQuetion5.add(rdbQuetion5A);
		rdbQuetion5B = new JRadioButton("B. all (i), (ii), (iii) and (iv) would compile and all would print 123.");
		rdbQuetion5B.setBounds(0, 209, 559, 23);
		rdbQuetion5B.setBackground(c);
		panelQuetion5.add(rdbQuetion5B);
		rdbQuetion5C = new JRadioButton("C. only (i), (ii) and (iii) would compile and all three would print 123.");
		rdbQuetion5C.setBounds(0, 235, 559, 23);
		rdbQuetion5C.setBackground(c);
		panelQuetion5.add(rdbQuetion5C);
		rdbQuetion5D = new JRadioButton("D. all (i), (ii), (iii) and (iv) would compile but only (i) and (ii) would print 123.");
		rdbQuetion5D.setBounds(0, 261, 559, 23);
		rdbQuetion5D.setBackground(c);
		panelQuetion5.add(rdbQuetion5D);
		ButtonGroup btnGroupQuetion5=new ButtonGroup();
		btnGroupQuetion5.add(rdbQuetion4A);
		btnGroupQuetion5.add(rdbQuetion5B);
		btnGroupQuetion5.add(rdbQuetion5C);
		btnGroupQuetion5.add(rdbQuetion5D);
		
		//panelQuetion6
		panelQuetion6 = new JPanel();
		panelQuetion6.setLayout(null);
		panelQuetion6.setForeground(new Color(171, 240, 250));
		panelQuetion6.setBackground(new Color(171, 240, 250));
		panelQuetion6.setBounds(504, 110, 353, 177);
		scrollPaneQuetion6 = new JScrollPane();
		label6 = new JLabel("6.");
		scrollPaneQuetion6.setColumnHeaderView(label6);
		scrollPaneQuetion6.getColumnHeader().setBackground(c);
		scrollPaneQuetion6.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion6.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion6.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion6.setBounds(0, 0, 380, 54);
		panelQuetion6.add(scrollPaneQuetion6);
		textAreaQuetion6 = new JTextArea();
		textAreaQuetion6.setEditable(false);
		textAreaQuetion6.setBackground(c);
		textAreaQuetion6.setText("In the context of C data types, which of the followings is correct?\r\n" + "");
		scrollPaneQuetion6.setViewportView(textAreaQuetion6);
		rdbQuetion6A = new JRadioButton("A. “unsigned long long int” is a valid data type");
		rdbQuetion6A.setBackground(new Color(171, 240, 250));
		rdbQuetion6A.setBounds(10, 61, 541, 23);
		panelQuetion6.add(rdbQuetion6A);
		rdbQuetion6B = new JRadioButton("B. “long long double” is a valid data type");
		rdbQuetion6B.setBackground(new Color(171, 240, 250));
		rdbQuetion6B.setBounds(10, 87, 559, 23);
		panelQuetion6.add(rdbQuetion6B);
		rdbQuetion6C = new JRadioButton("C. “unsigned long double” is a valid data type.");
		rdbQuetion6C.setBackground(new Color(171, 240, 250));
		rdbQuetion6C.setBounds(10, 114, 559, 23);
		panelQuetion6.add(rdbQuetion6C);
		rdbQuetion6D = new JRadioButton("D. A), B) and C) all are invalid data types..");
		rdbQuetion6D.setBackground(new Color(171, 240, 250));
		rdbQuetion6D.setBounds(10, 140, 559, 23);
		panelQuetion6.add(rdbQuetion6D);
		ButtonGroup btnGroupQetion6=new ButtonGroup();
		btnGroupQetion6.add(rdbQuetion6A);
		btnGroupQetion6.add(rdbQuetion6B);
		btnGroupQetion6.add(rdbQuetion6C);
		btnGroupQetion6.add(rdbQuetion6D);

		//panelQuetion7
		panelQuetion7 = new JPanel();
		panelQuetion7.setLayout(null);
		panelQuetion7.setForeground(new Color(171, 240, 250));
		panelQuetion7.setBackground(new Color(171, 240, 250));
		panelQuetion7.setBounds(10, 447, 483, 333);
		scrollPaneQuetion7 = new JScrollPane();
		scrollPaneQuetion7.setBackground(c);
		label7 = new JLabel("7.");
		scrollPaneQuetion7.setColumnHeaderView(label7);
		scrollPaneQuetion7.getColumnHeader().setBackground(c);
		scrollPaneQuetion7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion7.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion7.getHorizontalScrollBar().setBackground(c);		
		scrollPaneQuetion7.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion7.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion7.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion7.setBounds(10, 0, 463, 218);
		panelQuetion7.add(scrollPaneQuetion7);
		textAreaQuetion7 = new JTextArea();
		textAreaQuetion7.setBackground(c);
		textAreaQuetion7.setEditable(false);
		textAreaQuetion7.setText("In C, 1D array of int can be defined as follows and both are correct.\r\nint array1D[4] = {1,2,3,4};\r\nint array1D[] = {1,2,3,4};\r\n\r\nBut given the following definitions (along-with initialization) of 2D arrays\r\n\r\nint array2D[2][4] = {1,2,3,4,5,6,7,8}; /* (i) */\r\nint array2D[][4] = {1,2,3,4,5,6,7,8}; /* (ii) */\r\nint array2D[2][] = {1,2,3,4,5,6,7,8}; /* (iii) */\r\nint array2D[][] = {1,2,3,4,5,6,7,8}; /* (iv) */\r\n\r\nPick the correct statements.\r\n");
		textAreaQuetion7.setCaretPosition(0);
		scrollPaneQuetion7.setViewportView(textAreaQuetion7);
		rdbQuetion7A = new JRadioButton("A. Only (i) is correct.");
		rdbQuetion7A.setBackground(new Color(171, 240, 250));
		rdbQuetion7A.setBounds(0, 225, 541, 23);
		panelQuetion7.add(rdbQuetion7A);
		rdbQuetion7B = new JRadioButton("B. Only (i) and (ii) are correct.");
		rdbQuetion7B.setBackground(new Color(171, 240, 250));
		rdbQuetion7B.setBounds(0, 251, 559, 23);
		panelQuetion7.add(rdbQuetion7B);
		rdbQuetion7C = new JRadioButton("C. Only (i), (ii) and (iii) are correct.");
		rdbQuetion7C.setBackground(new Color(171, 240, 250));
		rdbQuetion7C.setBounds(0, 277, 559, 23);
		panelQuetion7.add(rdbQuetion7C);
		rdbQuetion7D = new JRadioButton("D. All (i), (ii), (iii) and (iv) are correct.");
		rdbQuetion7D.setBackground(new Color(171, 240, 250));
		rdbQuetion7D.setBounds(0, 303, 559, 23);
		panelQuetion7.add(rdbQuetion7D);

		ButtonGroup btnGroupQuetion7 = new ButtonGroup();
		btnGroupQuetion7.add(rdbQuetion7A);
		btnGroupQuetion7.add(rdbQuetion7B);
		btnGroupQuetion7.add(rdbQuetion7C);
		btnGroupQuetion7.add(rdbQuetion7D);
		
		
		
		//panelQuetion8
		panelQuetion8 = new JPanel();
		panelQuetion8.setLayout(null);
		panelQuetion8.setForeground(new Color(171, 240, 250));
		panelQuetion8.setBackground(new Color(171, 240, 250));
		panelQuetion8.setBounds(504, 447, 602, 369);
		scrollPaneQuetion8 = new JScrollPane();
		scrollPaneQuetion8.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion8.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion8.getHorizontalScrollBar().setBackground(c);
		scrollPaneQuetion8.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion8.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion8.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion8.setBounds(10, 0, 582, 218);
		panelQuetion8.add(scrollPaneQuetion8);
		textAreaQuetion8 = new JTextArea();
		textAreaQuetion8.setBackground(c);
		textAreaQuetion8.setEditable(false);
		textAreaQuetion8.setText("Which one of the choices given below would be printed when the following program is executed?\r\n#include\r\nvoid swap (int *x, int *y)\r\n{\r\n    static int *temp;\r\n    temp = x;\r\n    x = y;\r\n    y = temp;\r\n}\r\nvoid printab ()\r\n{\r\n    static int i, a = -3, b = -6;\r\n    i = 0;\r\n    while (i <= 4)\r\n    {\r\n        if ((i++)%2 == 1) continue;\r\n        a = a + i;\r\n        b = b + i;\r\n    }\r\n    swap (&a, &b);\r\n    printf(\"a =  %d, b = %dn\", a, b);\r\n}\r\nmain()\r\n{\r\n    printab();\r\n    printab();\r\n} \r\n");
		scrollPaneQuetion8.setViewportView(textAreaQuetion8);
		textAreaQuetion8.setCaretPosition(0);
		lblQuetion8 = new JLabel("8.");
		scrollPaneQuetion8.setColumnHeaderView(lblQuetion8);
		scrollPaneQuetion8.getColumnHeader().setBackground(c);
		rdbQuetion8A = new JRadioButton();
		rdbQuetion8A.setText("<html>A. a = 0, b = 3<br />a = 0, b = 3</html>");
		rdbQuetion8A.setBackground(new Color(171, 240, 250));
		rdbQuetion8A.setBounds(0, 213, 541, 37);
		panelQuetion8.add(rdbQuetion8A);
		rdbQuetion8B = new JRadioButton("<html>B. a = 3, b = 0<br />a = 12, b = 9</html>");
		rdbQuetion8B.setBackground(new Color(171, 240, 250));
		rdbQuetion8B.setBounds(0, 253, 559, 35);
		panelQuetion8.add(rdbQuetion8B);
		rdbQuetion8C = new JRadioButton("<html>C. a = 3, b = 6<br />a = 3, b = 6</html>");
		rdbQuetion8C.setBackground(new Color(171, 240, 250));
		rdbQuetion8C.setBounds(0, 291, 559, 37);
		panelQuetion8.add(rdbQuetion8C);
		rdbQuetion8D = new JRadioButton("<html>D. a = 6, b = 3<br />a = 15, b = 12</html>");
		rdbQuetion8D.setBackground(new Color(171, 240, 250));
		rdbQuetion8D.setBounds(0, 327, 559, 35);
		panelQuetion8.add(rdbQuetion8D);
		
		ButtonGroup btnGroupQuetion8 =new ButtonGroup();
		btnGroupQuetion8.add(rdbQuetion8A);
		btnGroupQuetion8.add(rdbQuetion8B);
		btnGroupQuetion8.add(rdbQuetion8C);
		btnGroupQuetion8.add(rdbQuetion8D);
		
		//btnNext
		btnNextPage = new JButton("Next");
		btnNextPage.setBounds(333, 824, 89, 23);
		btnNextPage.setBorder(new RoundBorder());
		//btnPrevPage
		btnPrevPage = new JButton("Prev");
		btnPrevPage.setBounds(192, 824, 89, 23);
		btnPrevPage.setBorder(new RoundBorder());


		//panelquizz
		panelQuizz = new JPanel();
		panelQuizz.setBounds(186, 0, 1515, 1061);
		panelQuizz.setBackground(c);
		panelQuizz.setLayout(null);
		panelQuizz.add(lblHeadline);
		panelQuizz.add(separator_3);
		panelQuizz.add(panelQuetion5);
		panelQuizz.add(panelQuetion6);
		panelQuizz.add(panelQuetion7);
		panelQuizz.add(panelQuetion8);
		panelQuizz.add(btnNextPage);
		panelQuizz.add(btnPrevPage);


		//main panel
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				setSize(1300,900);
				setResizable(false);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				contentPane.add(panelBar);
				contentPane.add(panelQuizz);
				contentPane.setBackground(c);






	}

}
