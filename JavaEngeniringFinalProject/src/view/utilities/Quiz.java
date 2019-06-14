package view.utilities;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import controller.CQuizController;
import view.screens.StartTestDialog;

public class Quiz extends JFrame {
	Color c=new Color(171,240,250);
	Color c2=new Color(169,192,237);

	protected CQuizController cQuizController=null;
	public JPanel contentPane;
	public JPanel panelBar;
	protected JPanel panelImage;
	protected JLabel lblImage;
	protected JLabel lblNewLabel;
	protected JLabel lblHelloFirstAndLastName;
	protected JLabel lblClickLogOut;
	protected JLabel lblClickCourses;
	protected JLabel lblClickQuizzes;
	protected JSeparator separator;
	protected JSeparator separator_1;
	protected JLabel lblClickGoals;
	protected JSeparator separator_2;
	protected JPanel panelQuizz;
	protected JPanel panelQuetion1;
	protected JPanel panelQuetion3;
	protected JPanel panelQuetion4;
	protected JPanel panelQuetion5;
	protected JPanel panelQuetion6;
	JLabel lblHeadLine;
	protected JLabel lblHeadline;
	protected JScrollPane scrollpaneQuetion1;
	protected JTextArea textAreaQuetion1;
	protected JLabel lblQuetion1;
	protected JLabel lblQuetion2;
	JRadioButton rdbQuetion1A;
	JRadioButton rdbQuetion1B;
	JRadioButton rdbQuetion1C;
	JRadioButton rdbQuetion1D;
	protected JPanel panelQuetion2;
	protected JScrollPane scrollPaneQuetion2;
	protected JRadioButton rdbQuetion2A;
	protected JRadioButton rdbQuetion2B;
	protected JRadioButton rdbQuetion2C;
	protected JRadioButton rdbQuetion2D;
	protected JTextArea textAreaQuetion2;
	protected JLabel label2;
	protected JScrollPane scrollPaneQuetion3;
	protected JRadioButton rdbQuetion3A;
	protected JRadioButton rdbQuetion3B;
	protected JRadioButton rdbQuetion3C;
	protected JRadioButton rdbQuetion3D;
	protected JTextArea textAreaQuetion3;
	protected JLabel label;
	public JScrollPane scrollPaneQuetion4;
	protected JRadioButton rdbQuetion4D;
	protected JRadioButton rdbQuetion4A;
	protected JRadioButton rdbQuetion4B;
	protected JRadioButton rdbQuetion4C;
	protected JTextArea textAreaQuetion4;
	protected JLabel lblQuetion4;
	protected JButton btnNextPage;
	protected JLabel lblMin;
	protected JLabel lblSec;
	protected JButton btnStartTest;
	Timer timer;
	StartTestDialog startTestDialog;

	
	
	
	
	
	public Quiz() {
		
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
		textAreaQuetion2 = new JTextArea();
		textAreaQuetion2.setText("#include \"stdlib.h\"\r\nint main()\r\n{\r\n int *pInt;\r\n int **ppInt1;\r\n int **ppInt2;\r\n \r\n pInt = (int*)malloc(sizeof(int));\r\n ppInt1 = (int**)malloc(10*sizeof(int*));\r\n ppInt2 = (int**)malloc(10*sizeof(int*));\r\n \r\n free(pInt);\r\n free(ppInt1);\r\n free(*ppInt2);\r\n return 0;\r\n}\r\n\r\nChoose the correct statement w.r.t. above C program.\r\n");


		//panelQuetion1
		panelQuetion1 = new JPanel();
		panelQuetion1.setVisible(false);
		panelQuetion1.setBounds(10, 110, 471, 291);
		panelQuetion1.setForeground(c);
		panelQuetion1.setBackground(c);
		panelQuetion1.setLayout(null);
		textAreaQuetion1 = new JTextArea();
		textAreaQuetion1.setText("#include \"stdlib.h\"\r\nint main()\r\n{\r\n int *pInt;\r\n int **ppInt1;\r\n int **ppInt2;\r\n \r\n pInt = (int*)malloc(sizeof(int));\r\n ppInt1 = (int**)malloc(10*sizeof(int*));\r\n ppInt2 = (int**)malloc(10*sizeof(int*));\r\n \r\n free(pInt);\r\n free(ppInt1);\r\n free(*ppInt2);\r\n return 0;\r\n}\r\n\r\nChoose the correct statement w.r.t. above C program.\r\n");
		scrollpaneQuetion1 = new JScrollPane();
		scrollpaneQuetion1.setBorder(BorderFactory.createEmptyBorder());
		scrollpaneQuetion1.setForeground(c);
		scrollpaneQuetion1.setBounds(0, 0, 296, 176);
		scrollpaneQuetion1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollpaneQuetion1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpaneQuetion1.getHorizontalScrollBar().setBackground(c);
		panelQuetion1.add(scrollpaneQuetion1);
		scrollpaneQuetion1.setViewportView(textAreaQuetion1);
		scrollpaneQuetion1.setBackground(c);
		scrollpaneQuetion1.getVerticalScrollBar().setBackground(c);
		textAreaQuetion1.setBackground(c);
		textAreaQuetion1.setEditable(false);
		lblQuetion1 = new JLabel("1.");
		scrollpaneQuetion1.setColumnHeaderView(lblQuetion1);
		scrollpaneQuetion1.getColumnHeader().setBackground(c);
		textAreaQuetion1.setCaretPosition(0);
		rdbQuetion1A = new JRadioButton("A. malloc() for ppInt1 and ppInt2 isn’t correct. It’ll give compile time error.");
		rdbQuetion1A.setBounds(0, 183, 444, 23);
		rdbQuetion1A.setBackground(c);
		panelQuetion1.add(rdbQuetion1A);
		rdbQuetion1B = new JRadioButton("B. free(*ppInt2) is not correct. It’ll give compile time error.");
		rdbQuetion1B.setBounds(0, 209, 559, 23);
		rdbQuetion1B.setBackground(c);
		panelQuetion1.add(rdbQuetion1B);
		rdbQuetion1C = new JRadioButton("C. free(*ppInt2) is not correct. It’ll give run time error.");
		rdbQuetion1C.setBounds(0, 235, 559, 23);
		rdbQuetion1C.setBackground(c);
		panelQuetion1.add(rdbQuetion1C);
		rdbQuetion1D = new JRadioButton("D. No issue with any of the malloc() and free() i.e. no compile/run time error.");
		rdbQuetion1D.setBounds(0, 261, 559, 23);
		rdbQuetion1D.setBackground(c);
		panelQuetion1.add(rdbQuetion1D);
		ButtonGroup btnGroupQuetion1=new ButtonGroup();
		btnGroupQuetion1.add(rdbQuetion1A);
		btnGroupQuetion1.add(rdbQuetion1B);
		btnGroupQuetion1.add(rdbQuetion1C);
		btnGroupQuetion1.add(rdbQuetion1D);
		
		//panelQuetion2
		panelQuetion2 = new JPanel();
		panelQuetion2.setVisible(false);
		panelQuetion2.setLayout(null);
		panelQuetion2.setForeground(new Color(171, 240, 250));
		panelQuetion2.setBackground(new Color(171, 240, 250));
		panelQuetion2.setBounds(504, 110, 513, 291);
		scrollPaneQuetion2 = new JScrollPane();
		label2 = new JLabel("2.");
		scrollPaneQuetion2.setColumnHeaderView(label2);
		scrollPaneQuetion2.getColumnHeader().setBackground(c);
		scrollPaneQuetion2.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion2.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion2.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion2.setBounds(0, 0, 380, 176);
		//scrollPaneQuetion2.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
		panelQuetion2.add(scrollPaneQuetion2);
		textAreaQuetion2 = new JTextArea();
		textAreaQuetion2.setEditable(false);
		textAreaQuetion2.setBackground(c);
		textAreaQuetion2.setText("Consider the following variable declarations and definitions in C\r\ni) int var_9 = 1;\r\nii) int 9_var = 2;\r\niii) int _ = 3;\r\n\r\n\r\n\r\nChoose the correct statement w.r.t. above variables.\r\n");
		scrollPaneQuetion2.setViewportView(textAreaQuetion2);
		rdbQuetion2A = new JRadioButton("A.Both i) and iii) are valid.\r\n");
		rdbQuetion2A.setBackground(new Color(171, 240, 250));
		rdbQuetion2A.setBounds(0, 183, 541, 23);
		panelQuetion2.add(rdbQuetion2A);
		rdbQuetion2B = new JRadioButton("B. Only i) is valid.");
		rdbQuetion2B.setBackground(new Color(171, 240, 250));
		rdbQuetion2B.setBounds(0, 209, 559, 23);
		panelQuetion2.add(rdbQuetion2B);
		rdbQuetion2C = new JRadioButton("C. Both i) and ii) are valid.");
		rdbQuetion2C.setBackground(new Color(171, 240, 250));
		rdbQuetion2C.setBounds(0, 235, 559, 23);
		panelQuetion2.add(rdbQuetion2C);
		rdbQuetion2D = new JRadioButton("D. All are valid.");
		rdbQuetion2D.setBackground(new Color(171, 240, 250));
		rdbQuetion2D.setBounds(0, 261, 559, 23);
		panelQuetion2.add(rdbQuetion2D);
		ButtonGroup btnGroupQetion2=new ButtonGroup();
		btnGroupQetion2.add(rdbQuetion2A);
		btnGroupQetion2.add(rdbQuetion2B);
		btnGroupQetion2.add(rdbQuetion2C);
		btnGroupQetion2.add(rdbQuetion2D);

		//panelQuetion3
		panelQuetion3 = new JPanel();
		panelQuetion3.setVisible(false);
		panelQuetion3.setLayout(null);
		panelQuetion3.setForeground(new Color(171, 240, 250));
		panelQuetion3.setBackground(new Color(171, 240, 250));
		panelQuetion3.setBounds(10, 447, 483, 333);
		scrollPaneQuetion3 = new JScrollPane();
		scrollPaneQuetion3.setBackground(c);
		label = new JLabel("3.");
		scrollPaneQuetion3.setColumnHeaderView(label);
		scrollPaneQuetion3.getColumnHeader().setBackground(c);
		scrollPaneQuetion3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion3.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion3.getHorizontalScrollBar().setBackground(c);		
		scrollPaneQuetion3.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion3.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion3.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion3.setBounds(10, 0, 222, 218);
		panelQuetion3.add(scrollPaneQuetion3);
		textAreaQuetion3 = new JTextArea();
		textAreaQuetion3.setBackground(c);
		textAreaQuetion3.setEditable(false);
		textAreaQuetion3.setText("Consider following two C - program : \r\nP1 :\r\nint main()\r\n{\r\n    int (*ptr)(int ) = fun;\r\n    (*ptr)(3);\r\n    return 0;\r\n}\r\n\r\nint fun(int n)\r\n{\r\n  for(;n > 0; n--)\r\n    printf(\"GeeksQuiz \");\r\n  return 0;\r\n}\r\nRun on IDE\r\nP2 :\r\nint main()\r\n{\r\n    void demo();\r\n    void (*fun)();\r\n    fun = demo;\r\n    (*fun)();\r\n    fun();\r\n    return 0;\r\n}\r\n \r\nvoid demo()\r\n{\r\n    printf(\"GeeksQuiz \");\r\n}\r\n\r\nWhich of the following option is correct?\r\n");
		textAreaQuetion3.setCaretPosition(0);
		scrollPaneQuetion3.setViewportView(textAreaQuetion3);
		rdbQuetion3A = new JRadioButton("A. P1 printed \"GeeksQuiz GeeksQuiz\" and P2 printed \"GeeksQuiz GeeksQuiz\"");
		rdbQuetion3A.setBackground(new Color(171, 240, 250));
		rdbQuetion3A.setBounds(0, 225, 541, 23);
		panelQuetion3.add(rdbQuetion3A);
		rdbQuetion3B = new JRadioButton("B. P1 printed \"GeeksQuiz GeeksQuiz\" and P2 gives compiler error");
		rdbQuetion3B.setBackground(new Color(171, 240, 250));
		rdbQuetion3B.setBounds(0, 251, 559, 23);
		panelQuetion3.add(rdbQuetion3B);
		rdbQuetion3C = new JRadioButton("C. P1 gives compiler error and P2 printed \"GeeksQuiz GeeksQuiz\"");
		rdbQuetion3C.setBackground(new Color(171, 240, 250));
		rdbQuetion3C.setBounds(0, 277, 559, 23);
		panelQuetion3.add(rdbQuetion3C);
		rdbQuetion3D = new JRadioButton("D. None of the above");
		rdbQuetion3D.setBackground(new Color(171, 240, 250));
		rdbQuetion3D.setBounds(0, 303, 559, 23);
		panelQuetion3.add(rdbQuetion3D);

		ButtonGroup btnGroupQuetion3 = new ButtonGroup();
		btnGroupQuetion3.add(rdbQuetion3A);
		btnGroupQuetion3.add(rdbQuetion3B);
		btnGroupQuetion3.add(rdbQuetion3C);
		btnGroupQuetion3.add(rdbQuetion3D);
		
		
		
		//panelQuetion4
		panelQuetion4 = new JPanel();
		panelQuetion4.setVisible(false);
		panelQuetion4.setLayout(null);
		panelQuetion4.setForeground(new Color(171, 240, 250));
		panelQuetion4.setBackground(new Color(171, 240, 250));
		panelQuetion4.setBounds(504, 447, 524, 333);
		scrollPaneQuetion4 = new JScrollPane();
		scrollPaneQuetion4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneQuetion4.getVerticalScrollBar().setBackground(c);
		scrollPaneQuetion4.getHorizontalScrollBar().setBackground(c);
		scrollPaneQuetion4.setForeground(new Color(171, 240, 250));
		scrollPaneQuetion4.setBorder(BorderFactory.createEmptyBorder());
		scrollPaneQuetion4.setBackground(new Color(171, 240, 250));
		scrollPaneQuetion4.setBounds(10, 0, 273, 218);
		panelQuetion4.add(scrollPaneQuetion4);
		textAreaQuetion4 = new JTextArea();
		textAreaQuetion4.setEditable(false);
		textAreaQuetion4.setBackground(c);
		textAreaQuetion4.setText("Choose the best statement with respect to following three program snippets.\r\n/*Program Snippet 1 with for loop*/\r\nfor (i = 0; i < 10; i++)\r\n{\r\n   /*statement1*/\r\n   continue;\r\n   /*statement2*/\r\n}\r\n \r\n/*Program Snippet 2 with while loop*/\r\ni = 0;\r\nwhile (i < 10)\r\n{\r\n   /*statement1*/\r\n   continue;\r\n   /*statement2*/\r\n   i++;\r\n}\r\n \r\n/*Program Snippet 3 with do-while loop*/\r\ni = 0;\r\ndo\r\n{\r\n   /*statement1*/\r\n   continue;\r\n   /*statement2*/\r\n   i++;\r\n}while (i < 10);\r\n");
		scrollPaneQuetion4.setViewportView(textAreaQuetion4);
		textAreaQuetion4.setCaretPosition(0);
		lblQuetion4 = new JLabel("4.");
		scrollPaneQuetion4.setColumnHeaderView(lblQuetion4);
		scrollPaneQuetion4.getColumnHeader().setBackground(c);
		rdbQuetion4A = new JRadioButton("A. All the loops are equivalent i.e. any of the three can be chosen and they all will perform exactly same.");
		rdbQuetion4A.setBackground(new Color(171, 240, 250));
		rdbQuetion4A.setBounds(0, 225, 541, 23);
		panelQuetion4.add(rdbQuetion4A);
		rdbQuetion4B = new JRadioButton("B. continue can't be used with all the three loops in C.");
		rdbQuetion4B.setBackground(new Color(171, 240, 250));
		rdbQuetion4B.setBounds(0, 251, 559, 23);
		panelQuetion4.add(rdbQuetion4B);
		rdbQuetion4C = new JRadioButton("C. After hitting the continue; statement in all the loops, the next expression to be executed would be controlling expression (i.e. i < 10) in all the 3 loops. ");
		rdbQuetion4C.setBackground(new Color(171, 240, 250));
		rdbQuetion4C.setBounds(0, 277, 559, 23);
		panelQuetion4.add(rdbQuetion4C);
		rdbQuetion4D = new JRadioButton("D. None of the above is Correct.");
		rdbQuetion4D.setBackground(new Color(171, 240, 250));
		rdbQuetion4D.setBounds(0, 303, 559, 23);
		panelQuetion4.add(rdbQuetion4D);
		
		ButtonGroup btnGroupQuetion4 =new ButtonGroup();
		btnGroupQuetion4.add(rdbQuetion4A);
		btnGroupQuetion4.add(rdbQuetion4B);
		btnGroupQuetion4.add(rdbQuetion4C);
		btnGroupQuetion4.add(rdbQuetion4D);
		
		//btnStartTest
		btnStartTest = new JButton("Start Test");
		btnStartTest.setBounds(208, 824, 89, 23);
		btnStartTest.setBorder(new RoundBorder());
		//btnNext
		btnNextPage = new JButton("Next");
		btnNextPage.setVisible(false);
		btnNextPage.setBounds(333, 824, 89, 23);
		btnNextPage.setBorder(new RoundBorder());
		
		//lbltimer
		lblMin = new JLabel("00 :");
		lblMin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMin.setBounds(931, 32, 44, 36);
		lblSec = new JLabel("00");
		lblSec.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSec.setBounds(964, 38, 53, 25);
		
		

		//panelquizz
		panelQuizz = new JPanel();
		panelQuizz.setBounds(186, 0, 1515, 1061);
		panelQuizz.setBackground(c);
		panelQuizz.setLayout(null);
		panelQuizz.add(lblHeadline);
		panelQuizz.add(separator_3);
		panelQuizz.add(panelQuetion1);
		panelQuizz.add(panelQuetion2);
		panelQuizz.add(panelQuetion3);
		panelQuizz.add(panelQuetion4);
		panelQuizz.add(btnNextPage);
		panelQuizz.add(btnStartTest);
		panelQuizz.add(lblMin);
		panelQuizz.add(lblSec);





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
			
		btnStartTest.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			cQuizController.startTestDialog();			
		}
	});
		
	}
	

	
	public void getTheValuesForQuetion() {
		

	
	}
	
	
	
	public void bla() {
		System.out.println("fkfk");
	}
	
	public void visibaleAll() {
		
	}
	
	public JPanel getPanelBar() {
		return panelBar;
	}



	public void setPanelBar(JPanel panelBar) {
		this.panelBar = panelBar;
	}

	public void setLblSec(JLabel lblSec) {
		// TODO Auto-generated method stub
		
	}

	public JLabel getLblSec() {
		// TODO Auto-generated method stub
		return null;
	}

	public CQuizController getcQuizController() {
		// TODO Auto-generated method stub
		return cQuizController;
	}

	public void setcQuizController(CQuizController cQuizController) {
		this.cQuizController=cQuizController;
		
	}

	public JLabel getLblHelloFirstAndLastName() {
		return lblHelloFirstAndLastName;
	}

	public void setLblHelloFirstAndLastName(JLabel lblHelloFirstAndLastName) {
		this.lblHelloFirstAndLastName=lblHelloFirstAndLastName;
		
	}

	public JLabel getLblMin() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLblMin(JLabel lblMin) {
		// TODO Auto-generated method stub
		
	}
}
