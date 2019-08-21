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
			if(stopFlag) { //stopFlag=true�� �����尡 ���� �ְ� �Ѵ�.
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} //������ Ŭ���� �ȿ��� ����ؾߵ� 
			}
			else {
			if(lblNeo.getX()==520) {
				
				rightFlag=false;
			}else if(lblNeo.getX()==0)
				rightFlag=true;
			
			if(rightFlag) {//�����ʹ���
				lblNeo.setLocation(lblNeo.getX()+10, lblNeo.getY());
				filename = "image/neo1.PNG";
				icon = new ImageIcon(filename);
				lblNeo.setIcon(icon);
			}else {//���ʹ���
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
