import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JTree;

public class Frame extends JFrame {
	
	private boolean musicPaused = false;
	private Clip musicAudio;
	
	public Frame() {
		getContentPane().setForeground(Color.BLACK);
		
		
		setTitle("Koubox");
		setPreferredSize(new Dimension(Data.FRAME_WIDTH, Data.FRAME_HEIGHT));
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		JLabel lblSongName = new JLabel("SONG NAME");
		lblSongName.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 45));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(69);
		
		JButton btnPausePlay = new JButton("");
		btnPausePlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(musicPaused == false) {
					Data.Util.setButtonBackgroundImage(btnPausePlay, "pauseBtn.png");
					musicPaused = true;
				}else{
					Data.Util.setButtonBackgroundImage(btnPausePlay, "playBtn.png");
					musicPaused = false;
				}
			}
		});
		Data.Util.setButtonBackgroundImage(btnPausePlay, "playBtn.png");
		Data.Util.removeButtonBackground(btnPausePlay);
		
		JButton btnLoop = new JButton("");
		Data.Util.setButtonBackgroundImage(btnLoop, "loopBtn.png");
		Data.Util.removeButtonBackground(btnLoop);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblSongName, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
									.addGap(190))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(310)
							.addComponent(btnPausePlay, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnLoop, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(394)
					.addComponent(lblSongName, GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
					.addGap(31)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLoop, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
						.addComponent(btnPausePlay, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
					.addGap(398))
		);
		
		JTree tree = new JTree();
		tree.setBackground(Color.WHITE);
		tree.setShowsRootHandles(true);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
	
	private void startMusic() {
		try {
			//InputStream pieceAudioStream = this.getClass().getResourceAsStream("ChessPieceSoundEffect.wav");
			InputStream audioStream = this.getClass().getResourceAsStream("Chess/soviet-anthem.wav");
		 	AudioInputStream audio = AudioSystem.getAudioInputStream(audioStream);
		 	musicAudio = AudioSystem.getClip();  
	        musicAudio.open(audio);
	        musicAudio.start();
		}catch(Exception e) {e.printStackTrace();}	
	}
}
