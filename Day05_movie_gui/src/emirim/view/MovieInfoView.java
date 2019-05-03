package emirim.view;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnSelsectHandler;
import emirim.persistence.MovieDAO;

public class MovieInfoView extends JFrame {
	private MovieDAO dao;
	private int selectedIndex;
	private JButton btnSelsect = new JButton("선택");
	private JButton btnCancel = new JButton("취소");
	private MovieReservationView mainView;
	
	public MovieInfoView(MovieReservationView mainView, MovieDAO dao, int selectedIndex){
		super();
		this.dao = dao;
		this.selectedIndex = selectedIndex;
		this.mainView = mainView;
		setLayout(new GridLayout(1, 3));
		displayInfo();
		setTitle("선택한 영화 정보");
		setBounds(170, 70, 500, 300);
		setVisible(true);
	}
	
	public JButton getBtnSelsect() {
		return btnSelsect;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void displayInfo() {
		ArrayList<MovieVO> mList = dao.getMovieList();
		MovieVO movie = mList.get(selectedIndex);
		ImageIcon image = new ImageIcon("posters/"+ movie.getPosterName() + ".jpg");
		String infoStr = "<html>"
						+"*영화제목: <font size = '15pt' color='red'>"+movie.getMovieTitle()+"</font><br>"
						+movie.getGenre()+"<br>"
						+movie.getOverAge()+"<br>"
						+movie.getPrice()+"<br>"				
						+ "</html>";
		JLabel lblPoseter = new JLabel(image);
		JLabel lblInfo = new JLabel(infoStr);
		JPanel pan = new JPanel();
		
		btnSelsect.addActionListener(new BtnSelsectHandler(mainView, movie, this));
		btnCancel.addActionListener(new BtnSelsectHandler(mainView, movie, this));
		add(lblPoseter);
		add(lblInfo);
		pan.add(btnSelsect);
		pan.add(btnCancel);
		add(pan);
	}
	
}
