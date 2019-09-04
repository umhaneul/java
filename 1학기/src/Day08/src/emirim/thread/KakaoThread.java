package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import views.KakaoView;

public class KakaoThread extends Thread {
	private KakaoView view;
	private JLabel lblBG;
	
	public KakaoThread(KakaoView view) {
		super();
		this.view = view;
		lblBG =view.getLblBG();
	}//KakaoThread
	@Override
	public void run() {
		int i=1;
		while(true) {
			i++;
			if(i==4)
				i=1;
			try {
				sleep(1000);
				ImageIcon icon = new ImageIcon("imgs/home"+ i+ ".png");
				lblBG.setIcon(icon);	
			}catch(InterruptedException e) {
				e.printStackTrace();
			}//catch
		}
	}//run
	
}//class
