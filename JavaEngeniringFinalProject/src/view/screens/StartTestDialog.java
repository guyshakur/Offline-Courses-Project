package view.screens;

import java.awt.BorderLayout;import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CQuizController;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartTestDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static CQuizScreen cQuizScreen=null;
	private static CQuizController cQuizController=null;
	Color c=new Color(171,240,250);
	Color c2=new Color(169,192,237);



	public StartTestDialog() {
		setBounds(100, 100, 434, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(59, 76, 279, 45);
			buttonPane.setBackground(c2);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnOk = new JButton("OK");
				btnOk.setBounds(72, 5, 71, 23);
				btnOk.setActionCommand("OK");
				btnOk.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cQuizController.startTheTest();
						dispose();
					}
				});
				buttonPane.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
			}
			{
				
			}
		}

		JTextArea textDialog = new JTextArea();
		textDialog.setFont(new Font("Courier New", Font.PLAIN, 13));
		textDialog.setText("You will have 10 minutes for the quiz. \r\nwhen you select \"ok\" you could not stop the quiz. \r\n\r\nAre you sure you want to start?");
		textDialog.setBounds(0, 0, 428, 79);
		textDialog.setBackground(c2);
		textDialog.setEditable(false);
		contentPanel.add(textDialog);
		contentPanel.setBackground(c2);
		setResizable(false);
	}



	public static CQuizScreen getcQuizScreen() {
		return cQuizScreen;
	}



	public  void setcQuizScreen(CQuizScreen cQuizScreen) {
		StartTestDialog.cQuizScreen = cQuizScreen;
	}



	public  CQuizController getcQuizController() {
		return cQuizController;
	}



	public  void setcQuizController(CQuizController cQuizController) {
		StartTestDialog.cQuizController = cQuizController;
	}
	
	
}
