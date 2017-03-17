package rendering;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Display {
	
	
	public void centerFrame(JFrame frame, int width, int height){
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		int monitorWidth = gd.getDisplayMode().getWidth();
		int monitorHeight = gd.getDisplayMode().getHeight();

		frame.setBounds((monitorWidth - width) / 2, (monitorHeight - height) / 2, width, height);
	}
}
