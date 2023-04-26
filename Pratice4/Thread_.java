package Pratice4;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Thread_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("start");
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace(); //예외 처리 
			}
			time = new Date();
			dateAndTime = format.format(time);
			System.out.println(dateAndTime);
			System.out.println("end");
		}
		*/
		
		
		//0-45랜덤 함수 
		 Random random = new Random();
	        
	        while (true) {
	            try {
	                Thread.sleep(300);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            int randomNumber = (int)(Math.random() * 46);
	            System.out.println(randomNumber);
	        }
	        
		
		//1-100
		/*for(int i =1; i <= 100; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }*/
		
		
	}

}
