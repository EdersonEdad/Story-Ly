import java.awt.*;                                                                                                                                    
import javax.swing.*;                                                                                                                                 
import java.awt.event.*;                                                                                                                              
import java.io.File;
import java.net.URL;

import javax.sound.sampled.*;                                                                                                                         
                                                                                                                                                      
                                                                                                                                                      
class MainPage {                                                                                                                                      
    public static void main(String[] args) {                                                                                                          
        title_page menu = new title_page();                                                                                                           
    }                                                                                                                                                 
}                                                                                                                                                     
                                                                                                                                                      
class title_page {

	
	public static Object clip;
    public JFrame frame;
    


   {                                                                                                                                   
        // Adding custom fonts for the aesthetic of the game                                                                                          
        // This code is where I insert the Logo to the top left side of the Frame                                                                     
    	                                                                                                                                              
                                       
                                                                                                                                                      
        // This Part is where the Frame of the software were customized     
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
        JButton Start_Button = new JButton("Start");                                                                                                                                           
        Start_Button.addActionListener(new ActionListener() {                                                                                         
            public void actionPerformed(ActionEvent e) {                                                                                              
                new StartInterface();                                                                                                                 
                frame.dispose();                                                                                                                      
            }                                                                                                                                         
        });                                                                                                                                           
         
       
        ImageIcon GreenButton = new ImageIcon(getClass(). getResource("GreenButton.png"));
        Start_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        Start_Button.setIcon(GreenButton);
        Start_Button.setContentAreaFilled(false);                                                                                                     
        Start_Button.setBorderPainted(false);                                                                                                         
        Start_Button.setBorder(null);                                                                                                                 
        Start_Button.setForeground(new Color(0, 128, 0));                                                                                             
        Start_Button.setBounds(856, 145, 259, 78);                                                                                                    
        Start_Button.setFont(new Font("Arial", Font.BOLD, 34));                                                                                       
        Start_Button.setHorizontalTextPosition(SwingConstants.CENTER); 
        
        frame.add(Start_Button);                                                                                                                      
                                                                                                                                                      
        JButton Option_Button = new JButton("Option");   
        ImageIcon YellowButton = new ImageIcon(getClass(). getResource("YellowButton.png"));
        
        Option_Button.setIcon(YellowButton);
        Option_Button.setBorderPainted(false);                                                                                                        
        Option_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));                                                                      
        Option_Button.setContentAreaFilled(false);                                                                                                    
        Option_Button.setForeground(new Color(89, 91, 9));                                                                                            
        Option_Button.addActionListener(new ActionListener() {                                                                                        
            public void actionPerformed(ActionEvent e) {                                                                                              
                new Options();                                                                                                                        
                                                                                                                                                   
                                                                                                                  
                                                                                                                                                      
            }                                                                                                                                         
        });                                                                                                                                           
                                                                                                                                                      
        Option_Button.setFont(new Font("Arial", Font.BOLD, 34));                                                                                      
        Option_Button.setHorizontalTextPosition(SwingConstants.CENTER);                                                                               
        Option_Button.setBounds(856, 233, 259, 83);                                                                                                   
        frame.add(Option_Button);                                                                                                                     
                                                                                                                                                      
        JButton Instruction_Button = new JButton("Instruction");
        ImageIcon BlueButton = new ImageIcon(getClass(). getResource("BlueButton.png"));  
        
        Instruction_Button.setIcon(BlueButton);
        Instruction_Button.setBorderPainted(false);                                                                                                   
        Instruction_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));                                                                 
        Instruction_Button.setContentAreaFilled(false);                                                                                               
        Instruction_Button.setForeground(new Color(1, 72, 131));                                                                                      
        Instruction_Button.setFont(new Font("Arial", Font.BOLD, 29));                                                                                 
        Instruction_Button.setHorizontalTextPosition(SwingConstants.CENTER);                                                                          
        Instruction_Button.addActionListener(new ActionListener() {                                                                                   
            public void actionPerformed(ActionEvent e) {    
            	
            	new Instruction();
            	frame.dispose();
            }                                                                                                                                         
        });                                                                                                                                           
        Instruction_Button.setBounds(856, 326, 259, 78);                                                                                              
        frame.add(Instruction_Button);                                                                                                                
                                                                                                                                                      
        JButton Credits_Button = new JButton("Credits");   
        ImageIcon GreenButton1 = new ImageIcon(getClass(). getResource("GreenButton.png"));  
        
        Credits_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));                                                                     
        Credits_Button.setBorderPainted(false);                                                                                                       
        Credits_Button.addActionListener(new ActionListener() {                                                                                       
            public void actionPerformed(ActionEvent e) {                                                                                              
                new Credits();  
                
                         
                
            }                                                                                                                                         
        });                                                                                                                                           
        
                                                                                                                                                   
        Credits_Button.setForeground(new Color(0, 128, 0));                                                                                           
        Credits_Button.setHorizontalTextPosition(SwingConstants.CENTER);                                                                              
        Credits_Button.setIcon(GreenButton1);                                                 
        Credits_Button.setContentAreaFilled(false);                                                                                                   
        Credits_Button.setBorder(null);                                                                                                               
        Credits_Button.setFont(new Font("Arial", Font.BOLD, 35));                                                                                     
        Credits_Button.setBounds(856, 414, 259, 78);                                                                                                  
        frame.add(Credits_Button);                                                                                                                    
                                                                                                                                                      
       
        JButton Exit_Button = new JButton("EXIT"); 
        ImageIcon RedButton = new ImageIcon(getClass(). getResource("RedButton.png")); 
        Exit_Button.setIcon(RedButton);
        
        Exit_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));                                                                        
        Exit_Button.setForeground(new Color(119, 0, 0));                                                                                              
        Exit_Button.setBackground(Color.WHITE);                                                                                                                                                           
        Exit_Button.setHorizontalTextPosition(SwingConstants.CENTER);                                                                                 
        Exit_Button.setFont(new Font("Arial", Font.BOLD, 35));                                                                                        
        Exit_Button.setBorder(null);                                                                                                                  
        Exit_Button.setBorderPainted(false);                                                                                                          
        Exit_Button.addActionListener(new ActionListener() {                                                                                          
            public void actionPerformed(ActionEvent e) {                                                                                              
                frame.dispose();                                                                                                                      
            }                                                                                                                                         
        });                                                                                                                                           
        Exit_Button.setBounds(859, 503, 256, 72);                                                                                                     
        frame.add(Exit_Button);                                                                                                                       
                                                                                                                                                      
        JLabel lblNewLabel = new JLabel("StoryLy");                                                                                                   
        lblNewLabel.setForeground(Color.WHITE);                                                                                                       
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);                                                                                    
        lblNewLabel.setFont(new Font("appleberry", Font.BOLD, 64));                                                                                   
        lblNewLabel.setBounds(831, 65, 301, 85);                                                                                                      
        frame.add(lblNewLabel);                                                                                                                       
                                                                                                                                                      
        JLabel lblNewLabel_1 = new JLabel(""); 
        ImageIcon Label1 = new ImageIcon(getClass(). getResource("Logo1.png")); 
        
        lblNewLabel_1.setBackground(new Color(255, 255, 255));                                                                                        
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);                                                                                  
        lblNewLabel_1.setIcon(Label1);                                                        
        lblNewLabel_1.setBounds(0, 0, 143, 140);                                                                                                      
        frame.add(lblNewLabel_1);  
        
                                                                                                                                                      
        JLabel lblNewLabel_2 = new JLabel(""); 
        ImageIcon Label2 = new ImageIcon(getClass(). getResource("GirlReading.png")); 
        lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);                                                                               
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);                                                                                  
        lblNewLabel_2.setIcon(Label2);                            
        lblNewLabel_2.setBounds(102, 265, 206, 195);                                                                                                  
        frame.add(lblNewLabel_2);                                                                                                                     
                                                                                                                                                      
        JLabel lblNewLabel_3 = new JLabel("");  
        ImageIcon Label3 = new ImageIcon(getClass(). getResource("BoyReading.png")); 
        lblNewLabel_3.setIcon(Label3);                             
        lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);                                                                               
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);                                                                                  
        lblNewLabel_3.setBounds(294, 278, 215, 182);                                                                                                  
        frame.add(lblNewLabel_3);                                                                                                                     
                                                                                                                                                      
        JLabel lblNewLabel_4 = new JLabel("");  
        ImageIcon Label4 = new ImageIcon(getClass(). getResource("Magic.png")); 
        lblNewLabel_4.setIcon(Label4);                                  
        lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);                                                                               
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);                                                                                  
        lblNewLabel_4.setBounds(175, 121, 210, 227);                                                                                                  
        frame.add(lblNewLabel_4);                                                                                                                     
                                                                                                                                                      
        JLabel lblNewLabel_5 = new JLabel(""); 
        ImageIcon Label5 = new ImageIcon(getClass(). getResource("Fairy.png")); 
        lblNewLabel_5.setIcon(Label5);                                  
        lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);                                                                               
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);                                                                                  
        lblNewLabel_5.setBounds(210, 65, 152, 101);                                                                                                   
        frame.add(lblNewLabel_5);                                                                                                                     
                                                                                                                                                      
        URL musicURL = title_page.class.getResource("/Main_Page_Music_Background.wav");
        if (musicURL != null) {
            MusicPlayer.getInstance().playMusic(musicURL);
        } else {
            System.out.println("Music file not found!");
        }                                                   
   
                                                                                                                                           
                                                                                                                                                      
        frame.setVisible(true);                                                                                                                       
                                                                                                                                                   
    }                                                                                                                                                 
}                                                                                                                                                     
                                                                                                                                                      
   class MusicPlayer {
	    private static MusicPlayer instance;
	    private Clip clip;
        private static FloatControl volumeControl;
        boolean mute = false;
        private static float previousVolume = 0.0f;
        private static float currentVolume =  -17.0f;

	    private MusicPlayer() {
	        // private constructor to prevent instantiation
	    }

	    public static MusicPlayer getInstance() {
	        if (instance == null) {
	            instance = new MusicPlayer();
	        }
	        return instance;
	    }

	    public void playMusic(URL musicURL) {
	        if (mute) {
	            return; // Music is already playing
	        }
	        try {
	            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicURL);
	            clip = AudioSystem.getClip();
	            clip.open(audioInput);
	            clip.start();
	            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music continuously
	            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	            mute = true;
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    public void stopMusic() {
	        if (clip != null) {
	            clip.stop();
	            clip.close();
	            mute = false;
	        }
	    }
	    public void setVolume(float volume) {
            if (volumeControl != null) {
                volumeControl.setValue(volume);
            }
        }
	    
	    public void music_mute() {
            if (mute == false ) {
                previousVolume = currentVolume;
                currentVolume = -80.0f;
                setVolume(currentVolume);
                mute = true;
            } else if (mute == true ){
                currentVolume = previousVolume;
                setVolume(currentVolume);
                mute = false;
            }
        }
	}
