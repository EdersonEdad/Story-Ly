import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Credits
	
{
	public JFrame frame;

		

	{
	//Adding custom fonts for the aesthetic of the game		
	//This code is where I insert the Logo to the top left side of the Frame
		
				
	//This Part is where the Frame of the software were customized
			
		frame = new JFrame("StoryLy - (Interactve Software for StoryTelling)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(650, 260, 315, 300);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0, 0, 0, 0));
		
		
		
	// This Part is where the picture/images were modified and set location on the front page of the software	
		ImageIcon Label1 = new ImageIcon(getClass().getResource("Credits topBg.png"));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(84, 0, 145, 58);
		lblNewLabel_2.setIcon(Label1);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(null);
		frame.add(lblNewLabel_2);
		
		
		ImageIcon Label2 = new ImageIcon(getClass().getResource("CREDITS__2_-removebg-preview.png"));
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(Label2);
		lblNewLabel_4.setBounds(0, 220, 72, 83);
		frame.add(lblNewLabel_4);
		
		ImageIcon Label3 = new ImageIcon(getClass().getResource("Name (Credits).png"));
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(33, 57, 242, 233);
		lblNewLabel_3.setIcon(Label3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		frame.add(lblNewLabel_3);
		
		
		ImageIcon BackButton = new ImageIcon(getClass().getResource("X.png"));
		JButton back_button = new JButton("");
		back_button .setBorderPainted(false);
		back_button .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		
		back_button.setIcon(BackButton);
		back_button.setContentAreaFilled(false);
		back_button.setHorizontalTextPosition(SwingConstants.CENTER);
		back_button.setBounds(267, 0, 50, 43);
		frame.add(back_button);
		
		
		ImageIcon Label4 = new ImageIcon(getClass().getResource("CREDITS__4_-removebg-preview.png"));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 317, 303);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(Label4);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(255, 218, 200));
		lblNewLabel_1.setBackground(Color.WHITE);
		frame.add(lblNewLabel_1);
			
		frame.setVisible(true);	
	}
}