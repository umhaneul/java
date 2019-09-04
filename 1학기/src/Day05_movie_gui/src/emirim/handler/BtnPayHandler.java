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
				+"&nbsp;&nbsp;&nbsp;* �¼�: A�� 07��<br>"
				+"&nbsp;&nbsp;&nbsp;* �󿵽ð�: 1�� 14�� 17:35<br><br></html>";
		
		
		mainView.lblTicket.setText(text);

	}

}
