package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.view.MovieReservationView;

public class BtnPayHandler implements ActionListener {
	private MovieReservationView mainView;
	
	
	
	public BtnPayHandler(MovieReservationView mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "<html>==========  Ticket  ==========<br><br>"
				+ mainView.lblInfo.getText()
				+"&nbsp;&nbsp;&nbsp;* 좌석: A열 07번<br>"
				+"&nbsp;&nbsp;&nbsp;* 상영시간: 1월 14일 17:35<br><br></html>";
		
		
		mainView.lblTicket.setText(text);

	}

}
