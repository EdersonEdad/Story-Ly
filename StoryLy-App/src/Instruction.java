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


public class Instruction {
public JFrame frame;
	
	
	ImageIcon P1 = new ImageIcon(getClass().getResource("Instruction1.jpg"));
	ImageIcon P2 = new ImageIcon(getClass().getResource("Instruction2.jpg"));
	ImageIcon P3 = new ImageIcon(getClass().getResource("Instruction3.jpg"));
	ImageIcon P4 = new ImageIcon(getClass().getResource("Instruction4.jpg"));


	ImageIcon[] imagearr = {P1, P2, P3, P4};
	
	int index = 0;
	
	
	JButton prev_button = new JButton();
	JButton next_button = new JButton();
	JLabel Story1_Label = new JLabel();

	
	{
		
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



        ImageIcon Label1 = new ImageIcon(getClass().getResource("Instruction1.jpg"));
		Story1_Label.setIcon(Label1);
		Story1_Label.setHorizontalTextPosition(SwingConstants.CENTER);
		Story1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Story1_Label.setBounds(267, 137, 733, 451);
		updateImage();
		frame.add(Story1_Label);


		ImageIcon Prev_Button = new ImageIcon(getClass().getResource("prev.png"));
		prev_button.setContentAreaFilled(false);
		prev_button.setBorder(null);
		prev_button.setIcon(Prev_Button);
		prev_button.setHorizontalTextPosition(SwingConstants.CENTER);
		prev_button.setBounds(137, 248, 120, 114);
		prev_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevButton();		
			}
		});
		frame.add(prev_button);

		ImageIcon NextButton = new ImageIcon(getClass().getResource("next.png"));
		next_button.setIcon(NextButton);
		next_button.setHorizontalTextPosition(SwingConstants.CENTER);
		next_button.setContentAreaFilled(false);
		next_button.setBorder(null);
		next_button.setBounds(1013, 248, 114, 114);
		next_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nextButton();
				
			}
		});
		frame.add(next_button);

		




		ImageIcon BackButton = new ImageIcon(getClass().getResource("Landing Page (1) (1).png"));
		JButton Back_Button = new JButton();
		Back_Button.setIcon(BackButton);
		Back_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Back_Button.setBorder(null);
		Back_Button.setContentAreaFilled(false);
		Back_Button.setBorderPainted(false);
		Back_Button.setBounds(1107, 0, 179, 56);
		frame.add(Back_Button);
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new title_page();
				frame.dispose();
				
			}
		});

		ImageIcon Label3 = new ImageIcon(getClass().getResource("Logo2.png"));
		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setIcon(Label3);
		lblNewLabel_7.setBounds(0, 0, 103, 104);
		frame.add(lblNewLabel_7);

		ImageIcon Label4 = new ImageIcon(getClass().getResource("BrownBg_forStory.png"));
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(Label4);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(233, 81, 804, 554);
		frame.add(lblNewLabel_2);

		ImageIcon Label5 = new ImageIcon(getClass().getResource("GreenBg_forStory1.png"));
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 12));
		lblNewLabel_1.setIcon(Label5);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(113, 33, 1031, 620);
		frame.add(lblNewLabel_1);

		ImageIcon Label6 = new ImageIcon(getClass().getResource("background1.jpg"));
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIconTextGap(2);
		lblNewLabel.setIcon(Label6);
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
       
	}	
	
		
	public void nextButton() {
	    index = (index + 1) % imagearr.length;
	    updateImage();
	    updateButtonVisibility();
	}

	public void prevButton() {
	    // Ensure index does not become negative
	    index = (index - 1 + imagearr.length) % imagearr.length;
	    updateImage();
	    updateButtonVisibility();
	}
}

	