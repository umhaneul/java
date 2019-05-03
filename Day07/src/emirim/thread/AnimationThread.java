package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.AnimationView;

public class AnimationThread extends Thread {
	
	private AnimationView av;
	private JLabel lblNeo;
	private boolean rightFlag=true;
	private int sleepTime=600;
	private boolean stopFlag =false;
	
	public AnimationThread(AnimationView av) {
		super();
		this.av = av;
		this.lblNeo = av.getLblNeo();
	}
	
	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}

	public void run() {
		String filename = null;
		ImageIcon icon = null;
		while(true) {
			synchronized (this) {
			if(stopFlag) { //stopFlag=true면 쓰레드가 쉬고 있게 한다.
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} //쓰레드 클래스 안에서 사용해야됨 
			}
			else {
			if(lblNeo.getX()==520) {
				
				rightFlag=false;
			}else if(lblNeo.getX()==0)
				rightFlag=true;
			
			if(rightFlag) {//오른쪽방향
				lblNeo.setLocation(lblNeo.getX()+10, lblNeo.getY());
				filename = "image/neo1.PNG";
				icon = new ImageIcon(filename);
				lblNeo.setIcon(icon);
			}else {//왼쪽방향
				lblNeo.setLocation(lblNeo.getX()-10, lblNeo.getY());
				filename = "image/neo2.PNG";
				icon = new ImageIcon(filename);
				lblNeo.setIcon(icon);
			}
			try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//end catch
			}//end else
			}//end sychronized
	}
}//end while
}
