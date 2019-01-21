import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class Frame extends JFrame {
	
	private Data.WINDOW_STATE panelState = Data.WINDOW_STATE.EXTENDED;

	public Frame() {
		getContentPane().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			//	pack();
			//	validate();
			}
		});
		setTitle("Koubox");
		setPreferredSize(new Dimension(Data.FRAME_WIDTH, Data.FRAME_HEIGHT));
	//	setExtendedState(JFrame.MAXIMIZED_BOTH); 
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
	//	setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		JLabel lblSongName = new JLabel("SONG NAME");
		lblSongName.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 45));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(69);
		
		JButton btnPausePlay = new JButton("");
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
		getContentPane().setLayout(groupLayout);
		
		
	}
}
