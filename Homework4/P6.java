package Homework4;
import java.time.LocalTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		//현재 시간 
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss"); //원하는 포맷으로 날짜 및 시간 출력 
		Date time = new Date();
		String currentTime = format.format(time); 
		System.out.println(currentTime);
		//더할 초
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//초를 더함
		time.setTime(time.getTime()+ n * 1000); //밀리초 단위 
		//스톱워치
		try {
			Thread.sleep(n * 1000);//n초 만큼 중지 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//결과 포맷팅
		currentTime = format.format(time);
		System.out.println("time is over" + "(" + currentTime + ")");
	
	}

}
