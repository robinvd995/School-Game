package rendering;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {
	
	private JFrame frame;
	private JPanel panel;
	
	private int width;
	private int height;
	public String title;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	public void createDisplay(){
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width, height));
		panel.setMinimumSize(new Dimension(width, height));
		panel.setMinimumSize(new Dimension(width, height));
		panel.setFocusable(false);
		
		frame.add(panel);
		frame.pack();
		
	}
}
