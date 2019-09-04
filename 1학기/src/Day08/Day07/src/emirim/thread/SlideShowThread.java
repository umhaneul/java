package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.SlideShowView;

public class SlideShowThread extends Thread {
	private SlideShowView ssv;
	private JLabel lblImg;
	private int sleepTime;
	
	public SlideShowThread(SlideShowView ssv) {
		super();
		this.ssv = ssv;
		lblImg = ssv.getLblImg();
	}



	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}



	public void run() {
		int i=0;
	while(true) {
		i++;
		if(i==10) {
			i=1;
		}
		String filename = "image/exo"+ i +".jpg";
		ImageIcon image =new ImageIcon(filename);
		lblImg.setIcon(image);
		try {
			sleep(sleepTime);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		}
	}
}