import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.sound.sampled.*;





public class Options
	
{
	
	
	public JFrame frame;

		
	JSlider Music_Slider = new JSlider(){
			private static final long serialVersionUID = 1L;

			@Override
	        public void updateUI() {
	            setUI(new CustomSliderUI(this));
	        }
	    }; 
	
	
	
	
	JButton Music_Button = new JButton();
    JButton  Back_Button = new JButton();

    public static float volume;
	{
	//Adding custom fonts for the aesthetic of the game		
	//This code is where I insert the Logo to the top left side of the Frame
		
				
		
	//This Part is where the Frame of the software were customized
		
		
		
		
			
		frame = new JFrame("StoryLy - (Interactve Software for StoryTelling)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 200, 745, 400);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0, 0, 0, 0));
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon Label1 = new ImageIcon(getClass(). getResource("OptionFrame.png")); 
		lblNewLabel_1.setIcon(Label1);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(220, 37, 290, 66);
		frame.add(lblNewLabel_1);
		
		 
		
		Music_Slider.setBounds(352, 179, 290, 42);
		Music_Slider.setPaintTrack(false);
		Music_Slider.setOpaque(false);
		Music_Slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                if (!source.getValueIsAdjusting()) {
                    float volume = (float) (Math.log10(source.getValue() / 100.0) * 20);
                    MusicPlayer.getInstance().setVolume(volume);
                }
            }
        });
		frame.add(Music_Slider);	
		
		JLabel Music_Label = new JLabel();
		ImageIcon MusicLabel = new ImageIcon(getClass(). getResource("MUSIC1.png")); 
		Music_Label.setBounds(64, 144, 616, 113);
		Music_Label.setHorizontalTextPosition(SwingConstants.CENTER);
		Music_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Music_Label.setIcon(MusicLabel);
		frame.add(Music_Label);
			
		
		
		ImageIcon MuteButton = new ImageIcon(getClass(). getResource("MuteMusic1.png"));
		ImageIcon UnmuteButton = new ImageIcon(getClass(). getResource("UnmuteMusic.png"));
		Music_Button.setBounds(320, 280, 82, 83);
		Music_Button.setIcon(UnmuteButton);
		Music_Button.setContentAreaFilled(false);
		Music_Button.setBorderPainted(false);
		Music_Button.setHorizontalTextPosition(SwingConstants.CENTER);
		Music_Button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                MusicPlayer.getInstance().music_mute();
	                if (MusicPlayer.getInstance().mute == false) {
	                	Music_Button.setIcon(UnmuteButton);
	                	
	                }else if (MusicPlayer.getInstance().mute == true){
	                	Music_Button.setIcon(MuteButton);
	                }
	            }
	        });
		
		frame.add(Music_Button);

		
		ImageIcon BackButton = new ImageIcon(getClass().getResource("X.png"));
		Back_Button.setBounds(595, 37, 58, 53);
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				
			}
		});
		
		
		Back_Button.setContentAreaFilled(false);
		Back_Button.setBorderPainted(false);
		Back_Button.setIcon(BackButton);
		frame.add(Back_Button);
		
		ImageIcon Label2 = new ImageIcon(getClass().getResource("OptionBackground.png"));
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(Label2);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIgnoreRepaint(true);
		lblNewLabel.setVerifyInputWhenFocusTarget(false);
		lblNewLabel.setBounds(78, 37, 575, 379);
		frame.add(lblNewLabel);
		
		frame.setVisible(true);
	}


private static class CustomSliderUI extends BasicSliderUI {

    private static final int TRACK_HEIGHT = 8;
    private static final int TRACK_WIDTH = 8;
    private static final int TRACK_ARC = 5;
    private static final Dimension THUMB_SIZE = new Dimension(40, 40);
    private final RoundRectangle2D.Float trackShape = new RoundRectangle2D.Float();

    public CustomSliderUI(final JSlider b) {
        super(b);
    }

    @Override
    protected void calculateTrackRect() {
        super.calculateTrackRect();
        if (isHorizontal()) {
            trackRect.y = trackRect.y + (trackRect.height - TRACK_HEIGHT) / 2;
            trackRect.height = TRACK_HEIGHT;
        } else {
            trackRect.x = trackRect.x + (trackRect.width - TRACK_WIDTH) / 2;
            trackRect.width = TRACK_WIDTH;
        }
        trackShape.setRoundRect(trackRect.x, trackRect.y, trackRect.width, trackRect.height, TRACK_ARC, TRACK_ARC);
    }

    @Override
    protected void calculateThumbLocation() {
        super.calculateThumbLocation();
        if (isHorizontal()) {
            thumbRect.y = trackRect.y + (trackRect.height - thumbRect.height) / 2;
        } else {
            thumbRect.x = trackRect.x + (trackRect.width - thumbRect.width) / 2;
        }
    }

    @Override
    protected Dimension getThumbSize() {
        return THUMB_SIZE;
    }

    private boolean isHorizontal() {
        return slider.getOrientation() == JSlider.HORIZONTAL;
    }

    @Override
    public void paint(final Graphics g, final JComponent c) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paint(g, c);
    }

    @Override
    public void paintTrack(final Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Shape clip = g2.getClip();

        boolean horizontal = isHorizontal();
        boolean inverted = slider.getInverted();

        // Paint shadow.
        g2.setColor(new Color(170, 170 ,170));
        g2.fill(trackShape);

        // Paint track background.
        g2.setColor(new Color(200, 200 ,200));
        g2.setClip(trackShape);
        trackShape.y += 1;
        g2.fill(trackShape);
        trackShape.y = trackRect.y;

        g2.setClip(clip);

        // Paint selected track.
        if (horizontal) {
            boolean ltr = slider.getComponentOrientation().isLeftToRight();
            if (ltr) inverted = !inverted;
            int thumbPos = thumbRect.x + thumbRect.width / 2;
            if (inverted) {
                g2.clipRect(0, 0, thumbPos, slider.getHeight());
            } else {
                g2.clipRect(thumbPos, 0, slider.getWidth() - thumbPos, slider.getHeight());
            }

        } else {
            int thumbPos = thumbRect.y + thumbRect.height / 2;
            if (inverted) {
                g2.clipRect(0, 0, slider.getHeight(), thumbPos);
            } else {
                g2.clipRect(0, thumbPos, slider.getWidth(), slider.getHeight() - thumbPos);
            }
        }
        g2.setColor(Color.ORANGE);
        g2.fill(trackShape);
        g2.setClip(clip);
    }

    @Override
    public void paintThumb(final Graphics g) {
        g.setColor(new Color(246, 146, 36));
        g.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
    }

    @Override
    public void paintFocus(final Graphics g) {}
}
}

