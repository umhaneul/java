package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import constant.KakaoConstant;

public class KakaoView extends JFrame {
	private JLabel lbl, lblScore;
	private int[] obstacleX= {30, 600, 300};//장애물의 X 좌표
	private int[] obstacleY= {160, 50, 500};//장애물의 Y 좌표
	private int[] treasureX= {350, 80, 500};//장애물의 X 좌표
	private int[] treasureY= {250, 400, 300};//장애물의 Y 좌표
	private JLabel[] lblObstacle, lblTreasure;
	private int score;
	private JLabel lblBG=new JLabel(new ImageIcon("imgs/home1.png"));
	
	public KakaoView() {
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		lblScore=new JLabel("점수: "+score);
		lblScore.setBounds(KakaoConstant.JFRAME_WIDTH-KakaoConstant.SCORE_JLABEL_WIDTH-10, 30, KakaoConstant.SCORE_JLABEL_WIDTH,KakaoConstant.SCORE_JLABEL_HIGTH);
		add(lblScore);
		lbl = new JLabel(new ImageIcon("Imgs/gu4.png"));
		lbl.setBounds(0, 0, KakaoConstant.RYAN_JLABEL_WIDTH, KakaoConstant.RYAN_JLABEL_HEIGTH);
		add(lbl);
		lblObstacle=new JLabel[obstacleX.length];
		lblTreasure=new JLabel[treasureX.length];
		//장애물 JLabel
		for(int i=0; i<lblObstacle.length; i++) {
			lblObstacle[i]=new JLabel(new ImageIcon("imgs/pi"+(i+1)+".jpg"));
			lblObstacle[i].setBounds(obstacleX[i], obstacleY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HIGTH);
			add(lblObstacle[i]);
		}
		for(int i=0; i<lblTreasure.length; i++) {
			lblTreasure[i]=new JLabel(new ImageIcon("imgs/cho.gif"));
			lblTreasure[i].setBounds(treasureX[i], treasureY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HIGTH);
			add(lblTreasure[i]);
		}

		lblBG.setBounds(0, 0, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGTH);
		add(lblBG);
		
		setFocusable(true);
		setTitle("kakao");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGTH);
		setResizable(false);//프레임의 크기 변경이 안되게 설정
		setVisible(true);
		
	}

	public JLabel getLbl() {
		return lbl;
	}

	public JLabel getLblScore() {
		return lblScore;
	}

	public int[] getObstacleX() {
		return obstacleX;
	}

	public int[] getObstacleY() {
		return obstacleY;
	}

	public int[] getTreasureX() {
		return treasureX;
	}

	public int[] getTreasureY() {
		return treasureY;
	}

	public JLabel[] getLblObstacle() {
		return lblObstacle;
	}

	public JLabel[] getLblTreasure() {
		return lblTreasure;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public JLabel getLblBG() {
		return lblBG;
	}
	
}
