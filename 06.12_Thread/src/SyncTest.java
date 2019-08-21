
public class SyncTest {
	private int sum = 0;
	private int num = 0;
	public synchronized void IncreaseNumber() {
		num++;	//num = num + 1
		sum = sum+num;
	}//IncreaseNumber
	
	public void IncreaseNumbern2() {
		synchronized (this) {
			num++;
		}
		sum = sum + num;
	}//IncreaseNumbern2
	
	
	public static void main(String[] args) {
		

	}//main

}//class
