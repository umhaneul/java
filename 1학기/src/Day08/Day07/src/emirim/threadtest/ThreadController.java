package emirim.threadtest;

public class ThreadController {

	public static void main(String[] args) {
		//1�� ���(extends Thread)
		//New Born ����(���� �¾ ����)
		Thread1 t1=new Thread1();
		//Runnable ����(���� ������ ����)
		t1.start();
		
		//2�� ���(implements Runnable)
		//New Born ����(���� �¾ ����)
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		//Runnable ����(���� ������ ����)
		t.start();
		}

	}
