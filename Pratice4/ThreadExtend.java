package Pratice4;
import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ThreadExtend extends Thread{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		ThreadExtend thread = new ThreadExtend();
		thread.start(); //스레드 시작 
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);
		System.out.println(thread.isAlive()); //스레드는 죽지않고 멈추면 끝남 
		
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
		System.out.println(thread.isAlive());
		
	}
	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	public void run() { //무한히 돌아가는데 5가되면 break 스레드는 안죽음 
		int cnt = 0;
		while (true) {
			if (cnt == 5) { //500초동안
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
