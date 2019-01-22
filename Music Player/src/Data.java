import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Data {
	
	public static final int FRAME_WIDTH = 1100;
	public static final int FRAME_HEIGHT = 1000;
	
	public static final String SOUND_FOLDER_ADDRESS = "C:\\Users\\Public\\Documents\\Koubox";
	public static final File SOUND_FOLDER = new File(SOUND_FOLDER_ADDRESS);
	public static ArrayList<File> SOUND_FILES = new ArrayList<File>();
	
	public enum WINDOW_STATE{
		EXTENDED,
		MINIMIZED
	}
	
	public static class Util {
		
		public static void setButtonBackgroundImage(JButton button, String fileAddress) {
			button.setIcon(new ImageIcon(new ImageIcon(Data.class.getResource(fileAddress)).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		}
		
		public static void removeButtonBackground(JButton button) {
			button.setContentAreaFilled(false);
			button.setFocusPainted(false);
			button.setBorderPainted(false);
		}
		
	}

}
