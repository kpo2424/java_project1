package homework2;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        
	     System.out.print("첫 번째 시간 정보 입력: ");
	     int time1 = sc.nextInt();
	        
	     System.out.print("두 번째 시간 정보 입력: ");
	     int time2 = sc.nextInt();
	        
	     int hour1 = (time1 % 1000000)/10000;
	     int min1 = (time1 % 10000)/100;
	     int sec1 = (time1 % 100);
	     int hour2 = (time2 % 1000000)/10000;
	     int min2 = (time2 % 10000)/100;
	     int sec2 = (time2 % 100);
		
	     int result1 = (hour1 * 60 * 60) + (min1 * 60) + sec1;
	     int result2 = (hour2 * 60 * 60) + (min2 * 60) + sec2;
	     
	     int interval = Math.abs(result1 - result2);
	     System.out.println(interval+"s");
	     
	}
}
