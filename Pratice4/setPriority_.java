package Pratice4;

public class setPriority_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new MultiThreadTest("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest("[ Thread " + 2 + " ]");
		thread2.setPriority((int)2);
		thread2.start();
	}
}

class MultiThreadTest extends Thread {
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { //에러 시 수행 
			e.printStackTrace(); //오류 출력 
		}
		System.out.println(this.getName() + " Thread_Start");
	}
}