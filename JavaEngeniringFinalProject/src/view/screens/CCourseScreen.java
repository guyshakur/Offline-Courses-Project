package view.screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;

public class CCourseScreen extends JFrame {


	Color c=new Color(171,240,250);

	

	/**
	 * Create the frame.
	 */
	public CCourseScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 11, 2, 2);
		scrollPane.setSize(800,800);
	
		getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("C PROGRAMMING LANGUAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\shot-mini-20190608-21422-y3ayvh.jpeg"));
		scrollPane.setViewportView(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(434, 833, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(335, 833, 89, 23);
		getContentPane().add(btnNewButton_1);
	}
}
