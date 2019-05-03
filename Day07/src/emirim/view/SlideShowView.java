package emirim.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowView extends JFrame{
	private JLabel lblImg = new JLabel("",JLabel.CENTER);
	private JButton btnFast = new JButton("������");
	private JButton btnMiddle = new JButton("�߰� ������");
	private JButton btnSlow = new JButton("������");
	
	public SlideShowView() {
		JPanel panBtn = new JPanel();
		panBtn.setBackground(Color.WHITE);
		add(lblImg, "Center");
		panBtn.add(btnFast);
		panBtn.add(btnMiddle);
		panBtn.add(btnSlow);
		add(lblImg,"Center");
		add(panBtn, "South");
		setTitle("Image Slide Show");
		getContentPane().setBackground(new Color(255, 217, 236));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 120, 320, 350);
		setVisible(true);
	}
	
	public JLabel getLblImg() {
		return lblImg;
	}

	public JButton getBtnFast() {
		return btnFast;
	}

	public JButton getBtnMiddle() {
		return btnMiddle;
	}

	public JButton getBtnSlow() {
		return btnSlow;
	}
	
	
}
