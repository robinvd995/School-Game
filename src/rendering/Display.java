package rendering;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {
	
	private JFrame frame;
	private JPanel panel;
	
	private int width;
	private int height;
	private String title;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	public void createDisplay(){
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		int monitorWidth = gd.getDisplayMode().getWidth();
		int monitorHeight = gd.getDisplayMode().getHeight();

		frame.setBounds((monitorWidth - width) / 2, (monitorHeight - height) / 2, width, height);
		frame.setVisible(true);
				
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width, height));
		panel.setMinimumSize(new Dimension(width, height));
		panel.setMinimumSize(new Dimension(width, height));
		panel.setFocusable(false);
		
		frame.add(panel);
		frame.pack();
	}
	
	public void addKeyListener(KeyListener listener){
		frame.addKeyListener(listener);
	}
}
