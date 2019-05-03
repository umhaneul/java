package emirim.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnPayHandler;
import emirim.handler.LblHandler;
import emirim.persistence.MovieDAO;

public class MovieReservationView extends JFrame{
		public JLabel lblInfo = new JLabel("���õ� ���� ����");
		public JLabel lblTicket = new JLabel("",JLabel.CENTER);
		public MovieReservationView(MovieDAO dao) {
			displayMovies(dao);
			displayInfo();
			displayTicket();
			getContentPane().setBackground(Color.WHITE);
			setTitle("��ȭ ���� ���� �ý���");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setBounds(150, 120, 800, 800);
			setVisible(true);
	}
		public void displayMovies(MovieDAO dao) {		
			int[] movieIds = {10, 11, 12, 13, 14, 15};
			String[] movieTitles = {"����Ű��","������", "������ �׳�", "����", "�״� �̸��� ���"};
			int[] overAges = {12, 12, 15, 15, 15};
			String[] genres = {"Comedy", "Drama", "Comedy", "Comedy", "Drama"};
			int[] prices = {9000, 10000, 8000, 9000, 10000};
			String[] posterNames = {"movie1","movie2","movie3", "movie4", "movie5"};
		    for(int i=0; i<prices.length; i++) {
            	dao.addMovie(new MovieVO(movieIds[i], movieTitles[i], overAges[i],  genres[i],prices[i],posterNames[i]));
		    }
			ArrayList<MovieVO> mList = dao.getMovieList();
			JPanel panN = new JPanel(new GridLayout(1, 5));
			//������ ��ġ�ϴ� ���� ���� ���� �� ����ϴ� �ݺ���(��ȭ ������ŭ ���� ����)
			JPanel[] panPosters = new JPanel[5];
			JLabel[] lblIcons = new JLabel[5];
			for(int i=0; i < panPosters.length; i++) {
				panPosters[i] = new JPanel();
				lblIcons[i] = new JLabel();
				MovieVO movie=mList.get(i);
				ImageIcon icon = new ImageIcon("posters/"+movie.getPosterName()+".jpg");
				lblIcons[i] = new JLabel(icon);
				lblIcons[i].addMouseListener(new LblHandler(this, dao, lblIcons));
				panPosters[i].add(lblIcons[i]);
				panN.add(panPosters[i]);
				panPosters[i].setBackground(Color.WHITE);
				
			}
			add(panN, "North");
		}
		
		public void displayInfo() {
			JPanel pan=new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 120));
			pan.setBackground(Color.WHITE);
			JButton btnPay = new JButton("����");
			btnPay.addActionListener(new BtnPayHandler(this));
			pan.add(lblInfo);
			pan.add(btnPay);
			lblInfo.setOpaque(true);
			lblInfo.setBackground(Color.WHITE);
			add(pan, "Center");
		}
		
		public void displayTicket() {
			lblTicket.setOpaque(true);
			lblTicket.setBackground(new Color(214,199,237));
			lblTicket.setForeground(new Color(0,0,135));
			Font font = new Font("210 �ǹ���û��",Font.BOLD, 15);
			add(lblTicket, "South");
		}
		
		public static void main(String[] args){
			MovieDAO dao = new MovieDAO();
			MovieReservationView view = new MovieReservationView(dao);
		    }
	
		}
