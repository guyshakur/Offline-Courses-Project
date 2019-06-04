package view.screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import controller.LoginController;
import controller.SignUpController;
import view.utilities.HintPasswordField;
import view.utilities.HintTextField;
import view.utilities.RoundBorder;

public class SignUpDialog extends JDialog {



	SignUpController signUpController=null;
	LoginController loginController=null;
	private HintTextField hintTextfirstName ;
	private HintTextField hintLasttName;
	private HintTextField hintuserName;
	private HintPasswordField hintPasswordField;
	private JButton btnSend;
	Color c=new Color(171,240,250);
	private JPanel panelImage;
	private JLabel labelImage;
	private JLabel lblStatus;
	private JLabel lblSignUp;


	public SignUpDialog(Frame owner) {

		setModalityType(ModalityType.APPLICATION_MODAL);

		//lableImage
		labelImage=new JLabel();
		ImageIcon image_icon=new ImageIcon(getClass().getResource("/view/images/lala.png"));
		Image image=image_icon.getImage();
		Image fixedImage=image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		image_icon=new ImageIcon(fixedImage);
		labelImage.setIcon(image_icon);

		//panelImage
		panelImage =new JPanel();
		panelImage.setBackground(c);
		panelImage.add(labelImage);
		panelImage.setBounds(77, 0, 219, 145);

		//lblSignUp
		lblSignUp = new JLabel("Sign Up");
		lblSignUp.setBounds(166, 149, 46, 14);



		//hintTextFirstName
		hintTextfirstName = new HintTextField("First Name");
		hintTextfirstName.setBounds(136, 171, 112, 20);

		//hintTextLastName
		hintLasttName = new HintTextField("Last Name");
		hintLasttName.setBounds(136, 202, 112, 20);

		//hintTextUserName
		hintuserName=new HintTextField("User Name");
		hintuserName.setBounds(136, 233, 112, 20);

		//HintPasswordField
		hintPasswordField=new HintPasswordField("Password");
		hintPasswordField.setBounds(136, 264, 112, 20);

		//btnSend
		btnSend = new JButton("Send");
		btnSend.setBounds(146, 297, 89, 23);
		btnSend.setBorder(new RoundBorder());

		//lblStatus
		lblStatus = new JLabel("");
		lblStatus.setBounds(166, 331, 46, 14);









		//JDialog
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(panelImage);
		getContentPane().add(lblSignUp);
		getContentPane().add(hintTextfirstName);
		getContentPane().add(hintLasttName);
		getContentPane().add(hintuserName);
		getContentPane().add(hintPasswordField);		
		getContentPane().add(btnSend);
		getContentPane().add(lblStatus);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pack();
		setSize(new Dimension(400,400));  
		setResizable(false);


		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				loginController.setEnable();

			}
		});








	}

	public SignUpController getSignUpController() {
		return signUpController;
	}



	public void setSignUpController(SignUpController signUpController) {
		this.signUpController = signUpController;
	}

	public LoginController getLoginController() {
		return loginController;
	}

	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}


}


