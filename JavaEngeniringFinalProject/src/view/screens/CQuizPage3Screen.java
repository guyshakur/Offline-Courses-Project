package view.screens;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import view.utilities.RoundBorder;

public class CQuizPage3Screen extends JFrame {

	
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
	JButton btnSubmit;
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
	private JPanel panelQuetion12;
	private JScrollPane scrollPaneQuetion12;
	private JTextArea textAreaQuetion12;
	private JLabel lblQuetion12;
	private JRadioButton rdbQuetion12A;
	private JRadioButton rdbQuetion12B;
	private JRadioButton rdbQuetion12C;
	private JRadioButton rdbQuetion12D;
	private ButtonGroup btnGroupQuetion8;
	private JButton btnPrevPage;
	private JPanel panelQuetion9;
	private JTextArea textAreaQuetion9;
	private JScrollPane scrollpaneQuetion9;
	private JLabel lblQuetion9;
	private JRadioButton rdbQuetion9A;
	private JRadioButton rdbQuetion9B;
	private JRadioButton rdbQuetion9C;
	private JRadioButton rdbQuetion9D;
	private JPanel panelQuetion10;
	private JScrollPane scrollPaneQuetion10;
	private JLabel label10;
	private JTextArea textAreaQuetion10;
	private JRadioButton rdbQuetion10A;
	private JRadioButton rdbQuetion10B;
	private JRadioButton rdbQuetion10C;
	private JRadioButton rdbQuetion10D;
	private JPanel panelQuetion11;
	private JScrollPane scrollPaneQuetion11;
	private JLabel label11;
	private JTextArea textAreaQuetion11;
	private JRadioButton rdbQuetion11A;
	private JRadioButton rdbQuetion11B;
	private JRadioButton rdbQuetion11C;
	private JRadioButton rdbQuetion11D;


	public CQuizPage3Screen() {


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


		//panelQuetion9
		panelQuetion9 = new JPanel();
		panelQuetion9.setBounds(10, 110, 471, 291);
		panelQuetion9.setForeground(c);
		panelQuetion9.setBackground(c);
		panelQuetion9.setLayout(null);
		textAreaQuetion9 = new JTextArea();
		textAreaQuetion9.setText("#include <stdio.h>\r\n// Assume base address of \"GeeksQuiz\" to be 1000\r\nint main()\r\n{\r\n   printf(5 + \"GeeksQuiz\");\r\n   return 0;\r\n}\r\n\r\nwhat will be te input?");
		scrollpaneQuetion9 = new JScrollPane();
		scrollpaneQuetion9.setBorder(BorderFactory.createEmptyBorder());
		scrollpaneQuetion9.setForeground(c);
		scrollpaneQuetion9.setBounds(0, 0, 461, 176);
		scrollpaneQuetion9.getHorizontalScrollBar().setBackground(c);
		panelQuetion9.add(scrollpaneQuetion9);
		scrollpaneQuetion9.setViewportView(textAreaQuetion9);
		scrollpaneQuetion9.setBackground(c);
		scrollpaneQuetion9.getVerticalScrollBar().setBackground(c);
		textAreaQuetion9.setBackground(c);
		textAreaQuetion9.setEditable(false);
		lblQuetion9 = new JLabel("9.");
		scrollpaneQuetion9.setColumnHeaderView(lblQuetion9);
		scrollpaneQuetion9.getColumnHeader().setBackground(c);
		scrollpaneQuetion9.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollpaneQuetion9.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textAreaQuetion9.setCaretPosition(0);
		rdbQuetion9A = new JRadioButton("A. GeeksQuiz");
		rdbQuetion9A.setBounds(0, 183, 444, 23);
		rdbQuetion9A.setBackground(c);
		panelQuetion9.add(rdbQuetion9A);
		rdbQuetion9B = new JRadioButton("B. Quiz");
		rdbQuetion9B.setBounds(0, 209, 559, 23);
		rdbQuetion9B.setBackground(c);
		panelQuetion9.add(rdbQuetion9B);
		rdbQuetion9C = new JRadioButton("C. 1005");
		rdbQuetion9C.setBounds(0, 235, 559, 23);
		rdbQuetion9C.setBackground(c);
		panelQuetion9.add(rdbQuetion9C);
		rdbQuetion9D = new JRadioButton("D. Compile-time error");
		rdbQuetion9D.setBounds(0, 261, 559, 23);
		rdbQuetion9D.setBackground(c);
		panelQuetion9.add(rdbQuetion9D);
		ButtonGroup btnGroupQuetion9=new ButtonGroup();
		btnGroupQuetion9.add(rdbQuetion9A);
		btnGroupQuetion9.add(rdbQuetion9B);
		btnGroupQuetion9.add(rdbQuetion9C);
		btnGroupQuetion9.add(rdbQuetion9D);
		
		//panelQuetion10
		panelQuetion10 = new JPanel();
		panelQuetion10.setLayout(null);
		panelQuetion10.setForeground(new Color(171, 240, 250));
		panelQuetion10.setBackground(new Color(171, 240, 250));
		panelQuetion10.setBounds(504, 110, 378, 177);
		scrollPaneQuetion10 = new JScrollPane();
		label10 = new JLabel("10.");
		scrollPaneQuetion10.setColumnHeaderView(label10);
		scrollPaneQuetion10.getColumnHeader().setBackground(c);
		scrollPaneQuetion10.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion10.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion10.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion10.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion10.setBounds(0, 0, 380, 54);
		panelQuetion10.add(scrollPaneQuetion10);
		textAreaQuetion10 = new JTextArea();
		textAreaQuetion10.setEditable(false);
		textAreaQuetion10.setBackground(c);
		textAreaQuetion10.setText("Which of the following is true");
		scrollPaneQuetion10.setViewportView(textAreaQuetion10);
		rdbQuetion10A = new JRadioButton("A. gets() doesn't do any array bound testing and should not be used.");
		rdbQuetion10A.setBackground(new Color(171, 240, 250));
		rdbQuetion10A.setBounds(10, 61, 541, 23);
		panelQuetion10.add(rdbQuetion10A);
		rdbQuetion10B = new JRadioButton("B. fgets() should be used in place of gets() only for files, otherwise gets() is fine");
		rdbQuetion10B.setBackground(new Color(171, 240, 250));
		rdbQuetion10B.setBounds(10, 87, 559, 23);
		panelQuetion10.add(rdbQuetion10B);
		rdbQuetion10C = new JRadioButton("C. gets() cannot read strings with spaces");
		rdbQuetion10C.setBackground(new Color(171, 240, 250));
		rdbQuetion10C.setBounds(10, 114, 559, 23);
		panelQuetion10.add(rdbQuetion10C);
		rdbQuetion10D = new JRadioButton("D. None of the above");
		rdbQuetion10D.setBackground(new Color(171, 240, 250));
		rdbQuetion10D.setBounds(10, 140, 559, 23);
		panelQuetion10.add(rdbQuetion10D);
		ButtonGroup btnGroupQetion10=new ButtonGroup();
		btnGroupQetion10.add(rdbQuetion10A);
		btnGroupQetion10.add(rdbQuetion10B);
		btnGroupQetion10.add(rdbQuetion10C);
		btnGroupQetion10.add(rdbQuetion10D);

		//panelQuetion11
		panelQuetion11 = new JPanel();
		panelQuetion11.setLayout(null);
		panelQuetion11.setForeground(new Color(171, 240, 250));
		panelQuetion11.setBackground(new Color(171, 240, 250));
		panelQuetion11.setBounds(10, 447, 483, 333);
		scrollPaneQuetion11 = new JScrollPane();
		scrollPaneQuetion11.setBackground(c);
		label11 = new JLabel("11.");
		scrollPaneQuetion11.setColumnHeaderView(label11);
		scrollPaneQuetion11.getColumnHeader().setBackground(c);
		scrollPaneQuetion11.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion11.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion11.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion11.getHorizontalScrollBar().setBackground(c);		
		scrollPaneQuetion11.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion11.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion11.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion11.setBounds(10, 0, 473, 218);
		panelQuetion11.add(scrollPaneQuetion11);
		textAreaQuetion11 = new JTextArea();
		textAreaQuetion11.setBackground(c);
		textAreaQuetion11.setEditable(false);
		textAreaQuetion11.setText("Which of the following implementations will produce the same output for f(173) as the above code? \r\n\r\nP1\r\nvoid f (int n)\r\n{\r\n    if (n/2)  {\r\n        f(n/2);\r\n    }\r\n    printf (\"%d\", n%2);\r\n}\r\n\r\nP2\r\nvoid f (int n)\r\n{\r\n    if (n <=1)  {\r\n        printf (\"%d\", n);\r\n    }\r\n    else {\r\n        printf (\"%d\", n%2);\r\n        f (n/2);\r\n    }\r\n}\r\n");
		textAreaQuetion11.setCaretPosition(0);
		scrollPaneQuetion11.setViewportView(textAreaQuetion11);
		rdbQuetion11A = new JRadioButton("A. Both P1 and P2");
		rdbQuetion11A.setBackground(new Color(171, 240, 250));
		rdbQuetion11A.setBounds(0, 225, 541, 23);
		panelQuetion11.add(rdbQuetion11A);
		rdbQuetion11B = new JRadioButton("B. P2 only");
		rdbQuetion11B.setBackground(new Color(171, 240, 250));
		rdbQuetion11B.setBounds(0, 251, 559, 23);
		panelQuetion11.add(rdbQuetion11B);
		rdbQuetion11C = new JRadioButton("C. P1 only");
		rdbQuetion11C.setBackground(new Color(171, 240, 250));
		rdbQuetion11C.setBounds(0, 277, 559, 23);
		panelQuetion11.add(rdbQuetion11C);
		rdbQuetion11D = new JRadioButton("D. Neither P1 nor P2");
		rdbQuetion11D.setBackground(new Color(171, 240, 250));
		rdbQuetion11D.setBounds(0, 303, 559, 23);
		panelQuetion11.add(rdbQuetion11D);

		ButtonGroup btnGroupQuetion11 = new ButtonGroup();
		btnGroupQuetion11.add(rdbQuetion11A);
		btnGroupQuetion11.add(rdbQuetion11B);
		btnGroupQuetion11.add(rdbQuetion11C);
		btnGroupQuetion11.add(rdbQuetion11D);
		
		
		
		//panelQuetion12
		panelQuetion12 = new JPanel();
		panelQuetion12.setLayout(null);
		panelQuetion12.setForeground(new Color(171, 240, 250));
		panelQuetion12.setBackground(new Color(171, 240, 250));
		panelQuetion12.setBounds(504, 447, 602, 369);
		scrollPaneQuetion12 = new JScrollPane();
		scrollPaneQuetion12.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion12.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion12.getHorizontalScrollBar().setBackground(c);
		scrollPaneQuetion12.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion12.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion12.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion12.setBounds(10, 0, 582, 75);
		panelQuetion12.add(scrollPaneQuetion12);
		textAreaQuetion12 = new JTextArea();
		textAreaQuetion12.setBackground(c);
		textAreaQuetion12.setEditable(false);
		textAreaQuetion12.setText("In the context of \"break\" and \"continue\" statements in C, pick the best statement.\r\n");
		scrollPaneQuetion12.setViewportView(textAreaQuetion12);
		textAreaQuetion12.setCaretPosition(0);
		lblQuetion12 = new JLabel("12.");
		scrollPaneQuetion12.setColumnHeaderView(lblQuetion12);
		scrollPaneQuetion12.getColumnHeader().setBackground(c);
		rdbQuetion12A = new JRadioButton();
		rdbQuetion12A.setText("A. \u201Cbreak\u201D can be used in \u201Cfor\u201D, \u201Cwhile\u201D and \u201Cdo-while\u201D loop body.");
		rdbQuetion12A.setBackground(new Color(171, 240, 250));
		rdbQuetion12A.setBounds(0, 147, 541, 37);
		panelQuetion12.add(rdbQuetion12A);
		rdbQuetion12B = new JRadioButton("B. \u201Ccontinue\u201D can be used in \u201Cfor\u201D, \u201Cwhile\u201D and \u201Cdo-while\u201D loop body");
		rdbQuetion12B.setBackground(new Color(171, 240, 250));
		rdbQuetion12B.setBounds(0, 187, 559, 35);
		panelQuetion12.add(rdbQuetion12B);
		rdbQuetion12C = new JRadioButton("C. \u201Cbreak\u201D and \u201Ccontinue\u201D can be used in \u201Cfor\u201D, \u201Cwhile\u201D, \u201Cdo-while\u201D loop body and \u201Cswitch\u201D body.\r\n");
		rdbQuetion12C.setBackground(new Color(171, 240, 250));
		rdbQuetion12C.setBounds(0, 225, 559, 37);
		panelQuetion12.add(rdbQuetion12C);
		rdbQuetion12D = new JRadioButton("D. \u201Cbreak\u201D and \u201Ccontinue\u201D can be used in \u201Cfor\u201D, \u201Cwhile\u201D and \u201Cdo-while\u201D loop body. But only  \u201Cbreak\u201D can be used in \u201Cswitch\u201D body.");
		rdbQuetion12D.setBackground(new Color(171, 240, 250));
		rdbQuetion12D.setBounds(0, 265, 559, 35);
		panelQuetion12.add(rdbQuetion12D);
		
		ButtonGroup btnGroupQuetion12 =new ButtonGroup();
		btnGroupQuetion12.add(rdbQuetion12A);
		btnGroupQuetion12.add(rdbQuetion12B);
		btnGroupQuetion12.add(rdbQuetion12C);
		btnGroupQuetion12.add(rdbQuetion12D);
		
		//btnNext
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(333, 824, 89, 23);
		btnSubmit.setBorder(new RoundBorder());
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
		panelQuizz.add(panelQuetion9);
		panelQuizz.add(panelQuetion10);
		panelQuizz.add(panelQuetion11);
		panelQuizz.add(panelQuetion12);
		panelQuizz.add(btnSubmit);
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

