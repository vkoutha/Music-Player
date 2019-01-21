import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main{
	
	public static Frame frame;
	
	public Main() {
		frame = new Frame();
		frame.setVisible(true);
	}
	
	private void initializeFiles() {
		if(!Data.SOUND_FOLDER.exists())
			Data.SOUND_FOLDER.mkdir();
		
	}

}
