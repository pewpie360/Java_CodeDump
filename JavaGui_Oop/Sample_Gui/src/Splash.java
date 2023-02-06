import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

//MUST RUN THIS CLASS NOT THE SAMPLE_GUI

public class Splash extends JFrame { //extends the java swing functions to class

	private JPanel contentPane;
	private static JProgressBar progbar;
	private static JLabel label_per;

	public static void main(String[] args) { //Main func for the splash screen
		int x;
				try {
					new Splash().setVisible(true);
					for(x = 0; x <= 100; x++) { //create for loop function for loading percentage
						Splash.progbar.setValue(x);
						Thread.sleep(50);
						Splash.label_per.setText(Integer.toString(x) + "%");
					}
					new sample_gui().setVisible(true); //pass the sample_guiclass ref to this class and set visible to true
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
	}
	
	public Splash() { //create blank constructor and pass inside the return void for components
		SplashMain();
		Toolkit tool = getToolkit(); //import java toolkit lib
		Dimension size = tool.getScreenSize(); 
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2); //set the Jframe to center
	}

	 //Create the frame for splash screen.
	 
	private void SplashMain() { //getter 
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51,204,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/iManage.gif")); //import GIF for splash screen using ImageIcon Lib
		label.setIcon(icon);
		label.setBounds(75, 25, 480, 291);
		contentPane.add(label);
		
		//create a progress bar
		progbar = new JProgressBar();
		progbar.setForeground(new Color(0, 128, 128));
		progbar.setBounds(100, 350, 450, 16);
		contentPane.add(progbar);
		
		//create label for percentage load
		label_per = new JLabel("");
		label_per.setForeground(new Color(255, 255, 255));
		label_per.setBounds(317, 325, 46, 14);
		contentPane.add(label_per);
		
	}

}
