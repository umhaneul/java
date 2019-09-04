package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.thread.AnimationThread;
import emirim.view.AnimationView;

public class BtnAinmationHandler implements ActionListener{
	private AnimationView av;
	private AnimationThread at;
	
		public BtnAinmationHandler(AnimationView av, AnimationThread at) {
		super();
		this.av = av;
		this.at = at;
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eo = e.getSource();
			if(eo==av.getBtnFast()) {
				at.setSleepTime(100);
			}else if(eo==av.getBtnSlow()) {
				at.setSleepTime(1000);
			}else if(eo==av.getBtnStop()) {
				at.setStopFlag(true);
			}else if(eo==av.getBtnStart()) {
				at.setStopFlag(false);
				synchronized (at) {
					at.notifyAll();
				}
				
			}
			
		}
}
