import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class StartInterface
{
	
	public JFrame frame;
	public MainPage backgroundMusic;
		

	{
	//Adding custom fonts for the aesthetic of the game		
	//This code is where I insert the Logo to the top left side of the Frame
		Image LogoFrame = Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoFrame.png"));
	   	Image BG1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("background1.jpg"));
	   	
        frame = new JFrame("StoryLy - (Interactive Software for StoryTelling)");                                                                      
        frame.setIconImage((Image) LogoFrame);                                                                                                                
        frame.setPreferredSize(new Dimension(1300, 700));                                                                                             
        frame.setResizable(false);                                                                                                                    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                                         
        frame.setLocation(140, 50);                                                                                                                    
        frame.setContentPane(new JLabel(new ImageIcon(BG1)));                 
        frame.setLayout(new FlowLayout());                                                                                                            
        frame.setLayout(null);                                                                                                                        
        frame.pack(); 
	
	// This Part is where the picture/images were modified and set location on the front page of the software	
		
        ImageIcon Label1 = new ImageIcon(getClass(). getResource("Logo2.png"));
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(Label1);
		lblNewLabel_5.setBorder(null);
		lblNewLabel_5.setBounds(0, 0, 105, 100);
		frame.add(lblNewLabel_5);
		
		 ImageIcon Label2 = new ImageIcon(getClass(). getResource("Landing Page (18).(1).png"));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(Label2);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(489, -13, 318, 127);
		frame.add(lblNewLabel_2);
		
		
		
		//Story Design for (Ang Kwento ng Buwaya)
		 ImageIcon Label3 = new ImageIcon(getClass(). getResource("Landing Page (5).png"));
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(Label3);
		lblNewLabel_3.setBounds(238, 109, 200, 161);
		frame.add(lblNewLabel_3);
		
		 ImageIcon Label4 = new ImageIcon(getClass(). getResource("Landing Page (6).png"));
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(Label4);
		lblNewLabel_4.setBounds(238, 264, 200, 76);
		frame.add(lblNewLabel_4);
		
		
		
		ImageIcon Buttones = new ImageIcon(getClass(). getResource("Landing Page (4).png"));
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new LineBorder(new Color(235, 186, 37), 8));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new KwentoNgBuwaya();
				frame.dispose();
				 
			}
		});
		
		btnNewButton.setIcon(Buttones);
		btnNewButton.setBounds(238, 109, 200, 239);
		frame.add(btnNewButton);
		
		
		//Story Design for (May Alaga akong Bakulaw) 
		
		 ImageIcon Label5 = new ImageIcon(getClass(). getResource("ANEUUgJPExM-rhMHJGyEm-transformed.png"));
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_1.setIcon(Label5);
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(538, 109, 208, 161);
		frame.add(lblNewLabel_3_1);
		
		 ImageIcon Label6 = new ImageIcon(getClass(). getResource("Landing Page (8).png"));
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_1.setIcon(Label6);
		lblNewLabel_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(538, 264, 208, 76);
		frame.add(lblNewLabel_4_1);
		
		

//4
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setIcon(Buttones);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setBorder(new LineBorder(new Color(235, 186, 37), 8, true));
		btnNewButton_2.setBounds(538, 109, 208, 239);
		frame.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new MayAlagaAkongBakulaw();
				frame.dispose();
				 
			}
		});
		
		
		
		
		
		//Story Design for (Apolakus)
		 ImageIcon Label7 = new ImageIcon(getClass(). getResource("Landing Page (10).png"));		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_2.setIcon(Label7);
		lblNewLabel_3_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(865, 119, 200, 161);
		frame.add(lblNewLabel_3_2);
		
		
		 ImageIcon Label8 = new ImageIcon(getClass(). getResource("Landing Page (9).png"));
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_2.setIcon(Label8);
		lblNewLabel_4_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(865, 274, 200, 76);
		frame.add(lblNewLabel_4_2);
		
//4			
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(Buttones);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new LineBorder(new Color(235, 186, 37), 8));
		btnNewButton_1.setBounds(865, 109, 200, 251);
		frame.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new Apolakus();
				frame.dispose();
				 
			}
		});
		
		//Story Design for (Ang Pagong at ang Kuneho)
		 ImageIcon Label9 = new ImageIcon(getClass(). getResource("Landing Page (12).png"));
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_3.setIcon(Label9);
		lblNewLabel_3_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(238, 362, 200, 161);
		frame.add(lblNewLabel_3_3);
		
		
		 ImageIcon Label10 = new ImageIcon(getClass(). getResource("Landing Page (11).png"));
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_3.setIcon(Label10);
		lblNewLabel_4_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(238, 519, 200, 76);
		frame.add(lblNewLabel_4_3);
		
//4		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setIcon(Buttones);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(new LineBorder(new Color(235, 186, 37), 8));
		btnNewButton_3.setBounds(238, 362, 200, 239);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new AngKunehoAtAngPagong();
				frame.dispose();
				 
			}
		});
		frame.add(btnNewButton_3);
		
		//Story Design for (Ang Sapatos ni Mommy)
		
		 ImageIcon Label11 = new ImageIcon(getClass(). getResource("Landing Page (14).png"));
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_4.setIcon(Label11);
		lblNewLabel_3_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(546, 362, 200, 161);
		frame.add(lblNewLabel_3_4);
		
		 ImageIcon Label12 = new ImageIcon(getClass(). getResource("Landing Page (13).png"));
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_4.setIcon(Label12);
		lblNewLabel_4_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setBounds(546, 519, 200, 76);
		frame.add(lblNewLabel_4_4);
		
//4		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setIcon(Buttones);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBorder(new LineBorder(new Color(235, 186, 37), 8));
		btnNewButton_4.setBounds(546, 362, 200, 239);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new AngSapatosNiMommy();
				frame.dispose();
				 
			}
		});
		frame.add(btnNewButton_4);
		
	//	Story Design for (Ang Matalinong Prinsipe)
		
		 ImageIcon Label13 = new ImageIcon(getClass(). getResource("Landing Page (16).png"));
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_5.setIcon(Label13);
		lblNewLabel_3_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setBounds(865, 362, 200, 161);
		frame.add(lblNewLabel_3_5);
		
		 ImageIcon Label14 = new ImageIcon(getClass(). getResource("Landing Page (15).png"));
		JLabel lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_5.setIcon(Label14);
		lblNewLabel_4_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setBounds(865, 519, 200, 76);
		frame.add(lblNewLabel_4_5);
	
//4		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setIcon(Buttones);
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBorder(new LineBorder(new Color(235, 186, 37), 8));
		btnNewButton_5.setBounds(865, 360, 200, 239);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new AngMatalinongPrinsipe();
				frame.dispose();
				 
			}
		});
		frame.add(btnNewButton_5);
		
		
	// BackButton Design
		 ImageIcon Label15 = new ImageIcon(getClass(). getResource("Landing Page (1) (1).png"));
		JButton Back_Button = new JButton("");
		Back_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Back_Button.setBorderPainted(false);
		Back_Button.setBorder(null);
		Back_Button.setIcon(Label15);
		Back_Button.setOpaque(false);
		Back_Button.setContentAreaFilled(false);
		Back_Button.setHorizontalTextPosition(SwingConstants.CENTER);
		Back_Button.setBounds(1073, 30, 174, 54);
		frame.add(Back_Button);
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				new title_page();
				frame.dispose(); 
						
			}
		});
		
	//Background for Story Selection	
		 ImageIcon Label16 = new ImageIcon(getClass(). getResource("Landing Page (3).(1).png"));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(Label16);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_1.setBounds(94, -30, 1087, 693);
		frame.add(lblNewLabel_1);
		frame.setVisible(true);	
		}
}

