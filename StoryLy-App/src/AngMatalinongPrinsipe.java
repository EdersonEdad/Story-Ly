import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class AngMatalinongPrinsipe
{
	
public JFrame frame;
	
	ImageIcon P1 = new ImageIcon(getClass().getResource("F1.png"));
	ImageIcon P2 = new ImageIcon(getClass().getResource("F2.png"));
	ImageIcon P3 = new ImageIcon(getClass().getResource("F3.png"));
	ImageIcon P4 = new ImageIcon(getClass().getResource("F4.png"));
	ImageIcon P5 = new ImageIcon(getClass().getResource("F5.png"));
	ImageIcon P6 = new ImageIcon(getClass().getResource("F6.png"));
	ImageIcon P7 = new ImageIcon(getClass().getResource("F7.png"));
	ImageIcon P8 = new ImageIcon(getClass().getResource("F8.png"));
	ImageIcon P9 = new ImageIcon(getClass().getResource("F9.png"));
	ImageIcon P10 = new ImageIcon(getClass().getResource("F10.png"));
	ImageIcon P11 = new ImageIcon(getClass().getResource("F11.png"));
	ImageIcon P12 = new ImageIcon(getClass().getResource("F12.png"));
	ImageIcon P13 = new ImageIcon(getClass().getResource("F13.png"));
	
	
	
	
	ImageIcon[] imagearr = {P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13};
	
int index = 0;
	
	JLabel Story1_Label = new JLabel();
	JButton prev_button = new JButton();
	JButton next_button = new JButton();
	JButton GoToQuiz_Button = new JButton();
	
	{
	//Adding custom fonts for the aesthetic of the game		
	//This code is where I insert the Logo to the top left side of the Frame
		
		
				
	//This Part is where the Frame of the software were customized
			
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
	

		Story1_Label.setHorizontalTextPosition(SwingConstants.CENTER);
		Story1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Story1_Label.setBounds(274, 241, 700, 351);
		Story1_Label.setVisible(true);
		updateImage();
		frame.add(Story1_Label);
		

		ImageIcon PrevButton = new ImageIcon(getClass(). getResource("prev.png"));  
		prev_button.setContentAreaFilled(false);
		prev_button.setBorder(null);
		prev_button.setIcon(PrevButton);
		prev_button.setHorizontalTextPosition(SwingConstants.CENTER);
		prev_button.setBounds(131, 260, 114, 114);
		
		frame.add(prev_button);
		prev_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prevButton();
				
			}
		});
			
		ImageIcon NextButton = new ImageIcon(getClass(). getResource("next.png"));  
		next_button.setIcon(NextButton);
		next_button.setHorizontalTextPosition(SwingConstants.CENTER);
		next_button.setContentAreaFilled(false);
		next_button.setBorder(null);
		next_button.setBounds(1000, 260, 114, 114);
		frame.add(next_button);
		next_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nextButton();
					   		
			}
		});
		
		ImageIcon Label1 = new ImageIcon(getClass(). getResource("Story6.png"));
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(Label1);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(546, 0, 197, 71);
		frame.add(lblNewLabel_3);
		
		ImageIcon Label2 = new ImageIcon(getClass(). getResource("Story6_title_img.png"));
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(Label2);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(341, 93, 138, 138);
		frame.add(lblNewLabel_4);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("ANG MATALINONG PRINSIPE");
		lblNewLabel_5.setForeground(new Color(112, 79, 35));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 33));
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(527, 109, 333, 51);
		frame.add(lblNewLabel_5);
		
		
	
		JLabel lblNewLabel_6 = new JLabel("Kwento ni Sarah Albee");
		lblNewLabel_6.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 23));
		lblNewLabel_6.setForeground(new Color(112, 79, 35));
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(565, 170, 268, 26);
		frame.add(lblNewLabel_6);
		
		
		ImageIcon GotoQuiz = new ImageIcon(getClass(). getResource("Copy of START PAGE (14)_transparent_Craiyon.png"));
		GoToQuiz_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GoToQuiz_Button.setHorizontalTextPosition(SwingConstants.CENTER);
		GoToQuiz_Button.setIcon(GotoQuiz);
		GoToQuiz_Button.setOpaque(false);
		GoToQuiz_Button.setContentAreaFilled(false);
		GoToQuiz_Button.setBorder(null);
		GoToQuiz_Button.setBounds(527, 607, 216, 56);
		frame.add(GoToQuiz_Button);
		GoToQuiz_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    new QuizforStory6();
				frame.dispose();
				
			}
		});
		
		
		ImageIcon Label4 = new ImageIcon(getClass(). getResource("Landing Page (1) (1).png"));
		JButton Back_Button = new JButton();
		Back_Button.setIcon(Label4);
		Back_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Back_Button.setBorder(null);
		Back_Button.setContentAreaFilled(false);
		Back_Button.setBorderPainted(false);
		Back_Button.setBounds(1107, 0, 179, 56);
		frame.add(Back_Button);
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new StartInterface();
				frame.dispose();
				
			}
		});
		
		ImageIcon Label5 = new ImageIcon(getClass(). getResource("Logo2.png"));
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(Label5);
		lblNewLabel_7.setBounds(0, 0, 103, 104);
		frame.add(lblNewLabel_7);
		
		
		ImageIcon Label6 = new ImageIcon(getClass(). getResource("BrownBg_forStory.png"));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(Label6);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(221, 33, 804, 602);
		frame.add(lblNewLabel_2);
		
		
		ImageIcon Label7 = new ImageIcon(getClass(). getResource("GreenBg_forStory1.png"));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 12));
		lblNewLabel_1.setIcon(Label7);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(113, 33, 1031, 620);
		frame.add(lblNewLabel_1);
		
		ImageIcon Label8 = new ImageIcon(getClass(). getResource("background1.jpg"));
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIconTextGap(2);
		lblNewLabel.setIcon(Label8);
		lblNewLabel.setBounds(0, 0, 1300, 700);
		frame.add(lblNewLabel);
		
		
		
		
		updateButtonVisibility();
		frame.setVisible(true);	
		}
	
	
	private void updateImage() {
        if (imagearr[index] != null) {
            Story1_Label.setIcon(imagearr[index]);
            Story1_Label.setText(null); // clear any previous text
        } else {
        	Story1_Label.setIcon(null);
        	Story1_Label.setText("Image not loaded.");
        }
       
       
        
        }
	public void updateButtonVisibility() {
		
        prev_button.setVisible(index > 0);
        next_button.setVisible(index < imagearr.length - 1);
        GoToQuiz_Button.setVisible(index == imagearr.length - 1);
	}	
	
		
	public void nextButton ()
	{
	index = (index + 1) % imagearr.length;
	updateImage();
	updateButtonVisibility();
	}

public void prevButton() {	
	index = (index - 1 + imagearr.length)  %imagearr.length;
	updateImage();
	updateButtonVisibility();
	}
}


	

	
