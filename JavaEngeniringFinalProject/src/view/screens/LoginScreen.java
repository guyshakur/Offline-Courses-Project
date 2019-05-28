package view.screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controller.LoginController;
import model.dao.StudentDao;
import model.daoImpl.StudentDaoImplForSqlite;
import view.utilities.HintPasswordField;
import view.utilities.HintTextField;
import view.utilities.RoundedBorder;
import view.utilities.RoundedCorners;
import view.utilities.rounded;

public class LoginScreen extends JFrame  {
	
	LoginController loginController=null;
	
	Font textBoxFont = new Font("Tahoma", Font.PLAIN, 22); 
	Color c=new Color(171,240,250);

	JPanel panelLabelStatus;
	JPanel panelImage;
	JPanel panelTexts;
	JPanel panelButtons;
	JPanel panelMain;
	JLabel labelImage;
	JLabel labelSignUp;
	HintTextField hintTextUserName;
	HintPasswordField hintPasswordPassword;
	JButton buttonLogin;
	JLabel labelStatus;

	public LoginScreen() {


		//labelImage
		labelImage = new JLabel();
		ImageIcon image_icon=new ImageIcon(getClass().getResource("/view/images/lala.png"));
		Image image=image_icon.getImage();
		Image fixedImage=image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		image_icon=new ImageIcon(fixedImage);
		labelImage.setIcon(image_icon);

		//panelImage
		panelImage =new JPanel();
		panelImage.add(labelImage);
		panelImage.setBackground(c);

		//JTextusername
		hintTextUserName=new HintTextField("user Name");
		hintTextUserName.setPreferredSize(new Dimension(600, 40));
		hintTextUserName.setMaximumSize(new Dimension(600, 40));
		hintTextUserName.setFont(textBoxFont);



		// JtextPassword
		hintPasswordPassword = new HintPasswordField("Password");
		hintPasswordPassword.setPreferredSize(new Dimension(600, 40));
		hintPasswordPassword.setMaximumSize(new Dimension(600, 40));
		hintPasswordPassword.setFont(textBoxFont);

		//panelTexts
		panelTexts = new JPanel();
		panelTexts.setBackground(c);
		//panelTexts.setBorder(new EmptyBorder(250, 100, 20, 100));
		panelTexts.setLayout(new BoxLayout(panelTexts, BoxLayout.Y_AXIS));
		panelTexts.add(hintTextUserName);
		panelTexts.add(Box.createRigidArea(new Dimension(0,40)));
		panelTexts.add(hintPasswordPassword);



		//buttonLogin
		buttonLogin = new JButton("Login");
		buttonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLogin.setPreferredSize(new Dimension(150, 30));
		buttonLogin.setBorder(new RoundedBorder());
		buttonLogin.setMaximumSize(new Dimension(150, 30));


		//labelButton
		labelSignUp=new JLabel("no account? SIGN UP");
		labelSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));




		//panelButtons
		panelButtons = new JPanel();
		panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.X_AXIS));
		panelButtons.setBackground(c);
		panelButtons.add(labelSignUp);
		panelButtons.add(Box.createRigidArea(new Dimension(40,0)));
		panelButtons.add(buttonLogin);
		
		//labelStatus
		labelStatus=new JLabel();
		
		//panelLabelStatus
		panelLabelStatus=new JPanel();
		panelLabelStatus.setBounds(0, 0, 50, 50);
		panelLabelStatus.setBackground(c);
		panelLabelStatus.add(labelStatus);
	
		

		//panelMain
		panelMain=new JPanel();
		panelMain.setBackground(c);
		panelMain.setBorder(new EmptyBorder(100, 100, 100, 100));
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
		panelMain.add(panelImage);
		panelMain.add(Box.createRigidArea(new Dimension(0,20)));
		panelMain.add(panelTexts);
		panelMain.add(Box.createRigidArea(new Dimension(0,20)));
		panelMain.add(panelButtons);
		panelMain.add(Box.createRigidArea(new Dimension(0,20)));
		panelMain.add(panelLabelStatus);
		






		//jframe
		//getContentPane().add(panelTexts);
		//getContentPane().add(panelButtons);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		getContentPane().add(panelMain);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		buttonLogin.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {
				
				loginController.login(hintTextUserName.getText(), String.copyValueOf(hintPasswordPassword.getPassword()));
				


			}
		});


		setTitle("Please Login Here !");
		setSize(500,600);
		setResizable(false);
		//setVisible(true);

	}

	

	public LoginController getLoginController() {
		return loginController;
	}



	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}



	public void displayStatus(String status) {
		labelStatus.setText(status);

	}
	
	public void close() {
		this.dispose();
	}

	

}
