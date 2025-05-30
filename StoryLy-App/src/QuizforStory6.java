import java.awt.Color;
import java.awt.ComponentOrientation;
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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;






public class QuizforStory6 implements ActionListener{
	
	public JFrame frame;

	String[] questions = 	{
			"Anong bagay and napadpad sa kamay"
			+ "\nng isang prinsipe?",
			"Saan galing ang kapirasong papel"
			+ "\nna napadpad sa kamay nito?",
			"Anong laman ng isang pirasong papel,"
			+ "\nkalkulasyon ng _________",
			"Anong nakita ng prinsipe nung nadating"
			+ "\nnito ang taas ng tore?",
			"Ano ang sinakyan ng prinsepe at ng"
			+ "\nprinsesa para makababa ng tore?"
		};
	String[][] options = 	{
			{"DAMIT", "PAPEL", "DAHON", "PARU-PARO"},
			{"SA PUNO", "SA BAHAY", "SA KASTILYO", "SA TORE"},
			{"HISTORY", "ENGLISH", "MATEMATIKA", "SIYENSA"},
			{"PRINSESA", "MGA GINTO", "SANGGOL", "DRAGON"},
			{"ELEVATOR", "DRAGON", "KABAYO", "IBON"}
		};
	char[] answers ={
			'B',
			'D',
			'C',
			'A',
			'A'
		};
	
	char guess;
	char answer;
	int index;
	static int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	
	
	JLabel QuestionLabel = new JLabel();
	JTextArea Question = new JTextArea();
	JButton ButtonA = new JButton();
	JButton ButtonB = new JButton();
	JButton ButtonC = new JButton();
	JButton ButtonD = new JButton();
	JLabel Label_A = new JLabel();
	JLabel Label_B = new JLabel();
	JLabel Label_C = new JLabel();
	JLabel Label_D = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	
	
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
		
        ImageIcon Label1 = new ImageIcon(getClass(). getResource("Logo2.png"));
		JLabel lblNewLabel_10 = new JLabel();
		lblNewLabel_10.setIcon(Label1);
		lblNewLabel_10.setBounds(0, 0, 103, 104);
		frame.add(lblNewLabel_10);
		
		
		ImageIcon Label2 = new ImageIcon(getClass(). getResource("Copy of START PAGE_transparent_Craiyon.png"));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(Label2);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setBounds(571, 0, 167, 162);
		frame.add(lblNewLabel_2);
		
		
		ImageIcon Label3 = new ImageIcon(getClass(). getResource("Copy of START PAGE (3)_transparent_Craiyon.png"));
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(Label3);
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(315, 428, 55, 44);
		frame.add(lblNewLabel_4);
		
		
		ImageIcon Label4 = new ImageIcon(getClass(). getResource("Copy of START PAGE (5)_transparent_Craiyon.png"));
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(Label4);
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.setBounds(771, 428, 45, 44);
		frame.add(lblNewLabel_5);
		
		
		ImageIcon Label5 = new ImageIcon(getClass(). getResource("Copy of START PAGE (4)_transparent_Craiyon.png"));
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(Label5);
		lblNewLabel_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.setBounds(315, 537, 45, 44);
		frame.add(lblNewLabel_6);
		
		
		ImageIcon Label6 = new ImageIcon(getClass(). getResource("Copy of START PAGE (6)_transparent_Craiyon.png"));
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(Label6);
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_7.setBounds(771, 537, 45, 44);
		frame.add(lblNewLabel_7);
		
		
		// Designs For the Label of the multiple Choices A,B,C, and D
		
		
		Label_A.setForeground(new Color(0, 96, 0));
		Label_A.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		Label_A.setHorizontalTextPosition(SwingConstants.CENTER);
		Label_A.setHorizontalAlignment(SwingConstants.CENTER);
		Label_A.setBounds(368, 415, 167, 57);
		frame.add(Label_A);
			
		
		Label_B.setHorizontalTextPosition(SwingConstants.CENTER);
		Label_B.setHorizontalAlignment(SwingConstants.CENTER);
		Label_B.setForeground(new Color(0, 96, 0));
		Label_B.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		Label_B.setBounds(370, 524, 167, 57);
		frame.add(Label_B);
		
	
		Label_C.setHorizontalTextPosition(SwingConstants.CENTER);
		Label_C.setHorizontalAlignment(SwingConstants.CENTER);
		Label_C.setForeground(new Color(0, 96, 0));
		Label_C.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		Label_C.setBounds(826, 415, 167, 57);
		frame.add(Label_C);
		
		
		Label_D.setHorizontalTextPosition(SwingConstants.CENTER);
		Label_D.setHorizontalAlignment(SwingConstants.CENTER);
		Label_D.setForeground(new Color(0, 96, 0));
		Label_D.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		Label_D.setBounds(826, 524, 167, 57);
		frame.add(Label_D);
	
		// Designs For the Buttons of the multiple Choices A,B,C, and D
		
		
		ImageIcon Label7 = new ImageIcon(getClass(). getResource("Copy of START PAGE (2).(1)_transparent_Craiyon.png"));
		ButtonA.setForeground(new Color(0, 96, 0));
		ButtonA.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		ButtonA.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonA.setContentAreaFilled(false);
		ButtonA.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ButtonA.setIcon(Label7);
		ButtonA.setOpaque(false);
		ButtonA.setBorderPainted(false);
		ButtonA.setBorder(null);
		ButtonA.setBounds(288, 398, 282, 100);
		ButtonA.addActionListener(this);
		frame.add(ButtonA);
		
		ImageIcon Label8 = new ImageIcon(getClass(). getResource("Copy of START PAGE (2).(1)_transparent_Craiyon.png"));
		ButtonC.setForeground(new Color(0, 96, 0));
		ButtonC.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		ButtonC.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonC.setContentAreaFilled(false);
		ButtonC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ButtonC.setIcon(Label8);
		ButtonC.setOpaque(false);
		ButtonC.setBorderPainted(false);
		ButtonC.setBorder(null);
		ButtonC.setBounds(745, 398, 282, 100);
		ButtonC.addActionListener(this);
		frame.add(ButtonC);
		
		
		ImageIcon Label9 = new ImageIcon(getClass(). getResource("Copy of START PAGE (2).(1)_transparent_Craiyon.png"));
		ButtonB.setForeground(new Color(0, 96, 0));
		ButtonB.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		ButtonB.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonB.setContentAreaFilled(false);
		ButtonB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ButtonB.setIcon(Label9);
		ButtonB.setOpaque(false);
		ButtonB.setBorderPainted(false);
		ButtonB.setBorder(null);
		ButtonB.setBounds(288, 508, 282, 100);
		ButtonB.addActionListener(this);
		
		frame.add(ButtonB);
		
		ImageIcon Label10 = new ImageIcon(getClass(). getResource("Copy of START PAGE (2).(1)_transparent_Craiyon.png"));
		ButtonD.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 30));
		ButtonD.setHorizontalTextPosition(SwingConstants.CENTER);
		ButtonD.setForeground(new Color(0, 96, 0));
		ButtonD.setContentAreaFilled(false);
		ButtonD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ButtonD.setIcon(Label10);
		ButtonD.setOpaque(false);
		ButtonD.setBorderPainted(false);
		ButtonD.setBorder(null);
		ButtonD.setBounds(745, 508, 282, 100);
		ButtonD.addActionListener(this);
		
		frame.add(ButtonD);
		
		
		
	
		QuestionLabel.setForeground(new Color(255, 255, 255));
		QuestionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		QuestionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		QuestionLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 50));
		QuestionLabel.setBorder(null);
		QuestionLabel.setBounds(421, 183, 521, 57);
		frame.add(QuestionLabel);
		
		Question.setTabSize(3);
		Question.setForeground(new Color(255, 255, 255));
		Question.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 35));
		Question.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Question.setBorder(null);
		Question.setOpaque(false);
		Question.setBounds(368, 244, 607, 89);
		Question.setEditable(false);
	

		frame.add(Question);
		
		//Design For Back button
		
		ImageIcon Label11 = new ImageIcon(getClass(). getResource("Landing Page (1) (1).png"));
		JButton BackButton = new JButton();
		BackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackButton.setHorizontalTextPosition(SwingConstants.CENTER);
		BackButton.setIcon(Label11);
		BackButton.setContentAreaFilled(false);
		BackButton.setBorderPainted(false);
		BackButton.setBorder(null);
		BackButton.setBounds(1096, 10, 180, 57);
		frame.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				correct_guesses = 0;
				index = 0;	
				new AngMatalinongPrinsipe();
				frame.dispose();
					   
					 				
			}
		});
		
		
		ImageIcon Label12 = new ImageIcon(getClass(). getResource("Photoroom-20240428_203708.png"));
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(Label12);
		lblNewLabel_3.setBounds(227, -19, 880, 445);
		frame.add(lblNewLabel_3);
		
		ImageIcon Label13 = new ImageIcon(getClass(). getResource("Landing Page (3).(1).png"));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(Label13);
		lblNewLabel_1.setBounds(67, 25, 1087, 613);
		frame.add(lblNewLabel_1);
		frame.setVisible(true);
				
	 nextQuestion();	
	}	
	
	public void nextQuestion() {
		
		if(index>=total_questions) {
			new Result();
			frame.dispose();
		}
		else {
			QuestionLabel.setText("Question: "+(index+1));
			Question.setText(questions[index]);
			Label_A.setText(options[index][0]);
			Label_B.setText(options[index][1]);
			Label_C.setText(options[index][2]);
			Label_D.setText(options[index][3]);
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		 ButtonA.setEnabled(false);
		 ButtonC.setEnabled(false);
		 ButtonB.setEnabled(false);
		 ButtonA.setEnabled(false);
		 ButtonD.setEnabled(false);
			
			if(e.getSource() == ButtonA) {
				answer= 'A';
				if(answer == answers[index]) {
					
					correct_guesses++;
									
				}else {
						
			}
		}	
			if(e.getSource()== ButtonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
													
				}else {
					
			}
		}	
			if(e.getSource()== ButtonC) {
				answer= 'C';
				if(answer == answers[index]) {
					
					correct_guesses++;	
					
				}else {
					
			}
		}	
			if(e.getSource() == ButtonD) {
				answer= 'D';
				if(answer == answers[index]) {
					
					correct_guesses++;	
					
				}else {
					
			}
		}	
			displayAnswer();
	}
	public void displayAnswer() {
		
		
		
		ButtonA.setEnabled(false);
		ButtonB.setEnabled(false);
		ButtonC.setEnabled(false);
		ButtonD.setEnabled(false);
		
		if(answers[index] != 'A')
			Label_A.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			Label_B.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			Label_C.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			Label_D.setForeground(new Color(255,0,0));
		

		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Label_A.setForeground(new Color(0,96,0));
				Label_B.setForeground(new Color(0,96,0));
				Label_C.setForeground(new Color(0,96,0));
				Label_D.setForeground(new Color(0,96,0));
				

				ButtonA.setEnabled(true);
				ButtonB.setEnabled(true);
				ButtonC.setEnabled(true);
				ButtonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
}
