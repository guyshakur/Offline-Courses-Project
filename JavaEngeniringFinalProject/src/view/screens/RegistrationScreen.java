package view.screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.utilities.GenericRoundedButton;
import view.utilities.HintPasswordField;
import view.utilities.HintTextField;
import view.utilities.RoundBorder;
import view.utilities.RoundBorder2;
import view.utilities.RoundButton;
import view.utilities.RoundCornerButton;
import view.utilities.RoundedBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class RegistrationScreen extends JFrame {
	private HintTextField hintTextfirstName ;
	private HintTextField hintLasttName;
	private HintTextField hintuserName;
	private HintPasswordField hintPasswordField;
	private GenericRoundedButton btnSend;
	private JLabel lblImage;
	private JLabel lblX;
	private JPanel panel;
	
	Color c=new Color(171,240,250);
	private JPanel panel_1;
	private JLabel lblNewLabel;



	/**
	 * Create the frame.
	 */
	public RegistrationScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		hintTextfirstName = new HintTextField("First Name");
		hintTextfirstName.setBounds(154, 90, 112, 20);
		hintLasttName = new HintTextField("Last Name");
		hintLasttName.setBounds(154, 121, 112, 20);
		hintuserName=new HintTextField("User Name");
		hintuserName.setBounds(154, 152, 112, 20);
		hintPasswordField=new HintPasswordField("Password");
		hintPasswordField.setBounds(154, 183, 112, 20);
		getContentPane().setLayout(null);
		getContentPane().add(hintTextfirstName);
		hintLasttName.setColumns(10);
		getContentPane().add(hintLasttName);
		hintLasttName.setColumns(10);
		getContentPane().add(hintuserName);
		hintuserName.setColumns(10);
		getContentPane().add(hintPasswordField);
		hintPasswordField.setColumns(10);
		getContentPane().add(hintTextfirstName);
		
		btnSend = new GenericRoundedButton();
		btnSend.setBounds(0, 0, 0, 0);
		btnSend.setText("ggg");
		//btnSend.setBounds(164, 205, 90, 25);
		//btnSend.setBorder(new RoundBorder());
		getContentPane().add(btnSend);
		//lblX.setBounds(351, 25, 1, -14);
		ImageIcon image_icon=new ImageIcon(getClass().getResource("/view/images/X.png"));
		Image image=image_icon.getImage();
		Image fixedImage=image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		image_icon=new ImageIcon(fixedImage);
		
		panel = new JPanel();
		panel.setBounds(359, -11, 75, 60);
		panel.setBackground(c);
		getContentPane().add(panel);
		
		lblX = new JLabel();
		lblX.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblX);
		lblX.setIcon(image_icon);
		
		getContentPane().setBackground(c);
		
		panel_1 = new JPanel();
		panel_1.setBounds(137, 11, 129, 68);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(2000, 2000, 129, 68);
		ImageIcon image_icon2=new ImageIcon(getClass().getResource("/view/images/X.png"));
		Image imag2e=image_icon2.getImage();
		Image fixedImage2=imag2e.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
		image_icon2=new ImageIcon(fixedImage2);
		panel_1.add(lblNewLabel);
		
		
	}
}
