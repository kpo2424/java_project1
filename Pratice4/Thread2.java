package Pratice4;

public class Thread2 implements Runnable{ 

	public static void main(String[] args) throws InterruptedException {
		Thread2 main = new Thread2();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Thread");
	}
}
