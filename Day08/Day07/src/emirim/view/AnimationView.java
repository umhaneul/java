package emirim.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimationView extends JFrame {
	
	private JButton btnFast = new JButton("Faster");
	private JButton btnSlow = new JButton("Slower");
	private JButton btnStop = new JButton("Stop");
	private JButton btnStart = new JButton("Start");
	private JLabel lblNeo = new JLabel();
	public AnimationView() {
		JPanel pan = new JPanel();
		JPanel panAni = new JPanel(null);//���̾ƿ�����
		add(pan, "North");
		add(panAni, "Center");
		panAni.setBackground(Color.WHITE);
		pan.setBackground(Color.WHITE);
		pan.add(btnFast);
		pan.add(btnSlow);
		pan.add(btnStop);
		pan.add(btnStart);
		String filename = "image/neo1.PNG";
		ImageIcon icon = new ImageIcon(filename);
		lblNeo.setIcon(icon);
		lblNeo.setBounds(0, 150,160,160);
		panAni.add(lblNeo);
		setTitle("���ƶ� �׿�~~~");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, 600, 500);
		setVisible(true);
	}

	public JButton getBtnFast() {
		return btnFast;
	}

	public JButton getBtnSlow() {
		return btnSlow;
	}

	public JButton getBtnStop() {
		return btnStop;
	}

	public JButton getBtnStart() {
		return btnStart;
	}
	public JLabel getLblNeo() {
		return lblNeo;
	}
	}
	
