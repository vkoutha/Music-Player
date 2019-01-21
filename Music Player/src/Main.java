import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main implements KeyListener{
	
	public static Frame frame;
	
	public Main() {
		frame = new Frame();
		frame.setVisible(true);
	}
	
	private void initializeFiles() {
		if(!Data.SOUND_FOLDER.exists())
			Data.SOUND_FOLDER.mkdir();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
