package emirim.bmi.gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMIView extends JFrame {
	
	public BMIView() {
		getContentPane().setBackground(Color.BLUE);//�������� ���� ��ȯ
		JPanel panNOrth=new JPanel();
		panNOrth.setBackground(Color.LIGHT_GRAY);
		JPanel panNorth=new JPanel();
		JLabel lblName = new JLabel("* ����: ");
		JLabel lblWeight = new JLabel("* ü��: ");
		JLabel lblHeight = new JLabel("* ����: ");
		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");
		JLabel lblResult = new JLabel(icon);
		JTextField textName = new JTextField(10);
		JTextField textWeight = new JTextField(10);
		JTextField textHeight = new JTextField(10);
		JButton btnResult = new JButton("���");
		
		btnResult.addActionListener(new BtnHandler(textName,textWeight, textHeight, lblResult));
		panNorth.add(lblName);
		panNorth.add(textName);
		panNorth.add(lblWeight);
		panNorth.add(textWeight);
		panNorth.add(lblHeight);
		panNorth.add(textHeight);
		panNorth.add(btnResult);
		
		add(panNorth, "North");
		add(lblResult, "Center");
		
		setTitle("ü��������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BMIView();
		
	}
	
}
