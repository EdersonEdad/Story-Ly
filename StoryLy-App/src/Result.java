import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Result {
	
public JFrame frame;


JLabel resulttext = new JLabel();
JLabel percentage = new JLabel();



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
        
        
        ImageIcon Label1 = new ImageIcon(getClass(). getResource("Copy of START PAGE (17)_transparent_Craiyon.png"));  
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(Label1);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(554, 107, 299, 97);
		frame.add(lblNewLabel_3);
		
	
		JLabel textField = new JLabel(QuizforStory1.correct_guesses + QuizforStory2.correct_guesses + QuizforStory3.correct_guesses +  QuizforStory4.correct_guesses +  QuizforStory5.correct_guesses +  QuizforStory6.correct_guesses + "/5");
		textField.setForeground(new Color(255, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 40));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(600, 258, 198, 69);
		frame.add(textField);
		
		
		JLabel lblNewLabel_4 = new JLabel("SCORE:");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 40));
		lblNewLabel_4.setForeground(new Color(245, 198, 35));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(600, 214, 208, 47);
		frame.add(lblNewLabel_4);
		
		
		ImageIcon Label2 = new ImageIcon(getClass(). getResource("Copy of START PAGE (22)_transparent_Craiyon.png")); 
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(Label2);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(539, 156, 330, 185);	
		frame.add(lblNewLabel_2);
		
	
		percentage.setForeground(new Color(0, 96, 0));
		percentage.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 40));
		percentage.setHorizontalTextPosition(SwingConstants.CENTER);
		percentage.setHorizontalAlignment(SwingConstants.CENTER);
		percentage.setBounds(600, 356, 208, 47);
		frame.add(percentage);
		
		
		resulttext.setForeground(new Color(0, 96, 0));
		resulttext.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 40));
		resulttext.setHorizontalTextPosition(SwingConstants.CENTER);
		resulttext.setHorizontalAlignment(SwingConstants.CENTER);
		resulttext.setBounds(581, 401, 254, 47);
		frame.add(resulttext);
		
		
		ImageIcon Story_Button = new ImageIcon(getClass(). getResource("Copy of START PAGE (18)_transparent_Craiyon.png"));  
		JButton StoryButton = new JButton();
		StoryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		StoryButton.setIcon(Story_Button);
		StoryButton.setContentAreaFilled(false);
		StoryButton.setBorder(null);
		StoryButton.setHorizontalTextPosition(SwingConstants.CENTER);
		StoryButton.setBounds(539, 496, 84, 69);
		frame.add(StoryButton);
		StoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuizforStory1.correct_guesses = 0;
				QuizforStory2.correct_guesses = 0;
				QuizforStory3.correct_guesses = 0;
				QuizforStory4.correct_guesses = 0;
				QuizforStory5.correct_guesses = 0;
				QuizforStory6.correct_guesses = 0;
				
					   new KwentoNgBuwaya();
					   frame.dispose();
				
			}
		});
		
		
		ImageIcon Select_Button = new ImageIcon(getClass(). getResource("Copy of START PAGE (19)_transparent_Craiyon.png"));  
		JButton SelectionButton = new JButton();
		SelectionButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SelectionButton.setContentAreaFilled(false);
		SelectionButton.setOpaque(false);
		SelectionButton.setBorderPainted(false);
		SelectionButton.setBorder(null);
		SelectionButton.setHorizontalTextPosition(SwingConstants.CENTER);
		SelectionButton.setIcon(Select_Button);
		SelectionButton.setBounds(664, 496, 84, 69);
		frame.add(SelectionButton);
		SelectionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuizforStory1.correct_guesses = 0;
				QuizforStory2.correct_guesses = 0;
				QuizforStory3.correct_guesses = 0;
				QuizforStory4.correct_guesses = 0;
				QuizforStory5.correct_guesses = 0;
				QuizforStory6.correct_guesses = 0;
					  new StartInterface();
					  frame.dispose();
				
				
			}
		});
		
		ImageIcon Front_Page = new ImageIcon(getClass(). getResource("Copy of START PAGE (20)_transparent_Craiyon.png"));  
		JButton FrontPage = new JButton();
		FrontPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		FrontPage.setContentAreaFilled(false);
		FrontPage.setIcon(Front_Page);
		FrontPage.setOpaque(false);
		FrontPage.setHorizontalTextPosition(SwingConstants.CENTER);
		FrontPage.setBorderPainted(false);
		FrontPage.setBorder(null);
		FrontPage.setBounds(782, 496, 84, 69);
		frame.add(FrontPage);
		FrontPage .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuizforStory1.correct_guesses = 0;
				QuizforStory2.correct_guesses = 0;
				QuizforStory3.correct_guesses = 0;
				QuizforStory4.correct_guesses = 0;
				QuizforStory5.correct_guesses = 0;
				QuizforStory6.correct_guesses = 0;
					   new title_page();
					   frame.dispose();
			
					   
			}
		});
		
		ImageIcon Label3 = new ImageIcon(getClass(). getResource("Copy of START PAGE (21)_transparent_Craiyon.png"));  
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(Label3);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(492, 88, 416, 458);
		frame.add(lblNewLabel_1);
		
		frame.setVisible(true);
		
		Scores();
		ScorePercentage();
	}
	
	public void  Scores() {
		
		if (QuizforStory1.correct_guesses + QuizforStory2.correct_guesses + 
			QuizforStory3.correct_guesses + QuizforStory4.correct_guesses + 
			QuizforStory5.correct_guesses + QuizforStory6.correct_guesses >=3) {
			resulttext.setText("VERY GOOD");
		}else {
			resulttext.setText("TRY HARDER");
	
		}
		
	}
	
	public void ScorePercentage() {
		
		double result = (int)(((QuizforStory1.correct_guesses + QuizforStory2.correct_guesses + 
								QuizforStory3.correct_guesses + QuizforStory4.correct_guesses + 
								QuizforStory5.correct_guesses + QuizforStory6.correct_guesses )/(double)5)*100);
		String str = Double.toString(result);
		percentage.setText(str + "%");

		
	}
}
