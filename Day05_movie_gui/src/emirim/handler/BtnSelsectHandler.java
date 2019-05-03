package emirim.handler;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.domain.MovieVO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class BtnSelsectHandler implements ActionListener {

	
		private MovieReservationView mainView;
		private MovieVO movie;
		private MovieInfoView info;
		
		public BtnSelsectHandler(MovieReservationView mainView, MovieVO movie, MovieInfoView info) {
			super();
			this.mainView = mainView;
			this.movie = movie;
			this.info = info;
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			Object eo = e.getSource();
			if(eo == info.getBtnSelsect()) {
				String text = "<html>"
						+"*��ȭ����: <font size = '5pt'>"+movie.getMovieTitle()+"</font><br>"
						+"*�帣: "+movie.getGenre()+"<br>"
						+"*���ѿ���:"+ movie.getOverAge()+"<br>"
						+"*����: "+movie.getPrice()+"<br>"				
						+ "</html>";
				mainView.lblInfo.setBackground(Color.WHITE);
				mainView.lblInfo.setForeground(Color.MAGENTA);
				mainView.lblInfo.setText(text);
			}else {
				info.setVisible(false);
			}
		}

}
