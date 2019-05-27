package view.utilities;
import java.awt.Color;  
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.FocusAdapter;  
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;  

public class HintPasswordField extends JPasswordField {  

	Font gainFont = new Font("Tahoma", Font.PLAIN, 11);  
	Font lostFont = new Font("Tahoma", Font.ITALIC, 11);  
	 @Override
	 protected void paintComponent(Graphics g) {
		    if (!isOpaque() && getBorder() instanceof RoundedBorder) {
		      Graphics2D g2 = (Graphics2D) g.create();
		      g2.setPaint(getBackground());
		      g2.fill(((RoundedBorder) getBorder()).getBorderShape(
		          0, 0, getWidth() - 1, getHeight() - 1));
		      g2.dispose();
		    }
		    super.paintComponent(g);
		  }
		  @Override public void updateUI() {
		    super.updateUI();
		    setOpaque(false);
		    setBorder(new RoundedBorder());
		  };

	public HintPasswordField(final String hint) {  
		setEchoChar((char)0);
		setText(hint);  
		setFont(lostFont);  
		setForeground(Color.GRAY);  

		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (String.valueOf(getPassword()).equals(hint)) {  
					setText("");
					setFont(gainFont);
					setForeground(Color.black);
					setEchoChar('*');

				}

				else if(String.valueOf(getPassword()).trim().length()==0) {
					setEchoChar((char)0);
					setText(hint);
					setFont(gainFont);
					setForeground(Color.gray);
					setCaretPosition(0);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(getText().equals(hint)){
					setCaretPosition(0);
				}

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
		

	}  
}  


