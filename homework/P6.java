package homework;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//int yearNum = scanner.nextInt();
		//int monthNum = scanner.nextInt();
		int yearNum = 2023;
		int monthNum = 3;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, yearNum);
		calendar.set(Calendar.MONTH, monthNum-1);
        calendar.set(Calendar.DATE, 1); //해당 월의 1일로 날짜 설정 
		
		System.out.println(yearNum);
		System.out.println(monthNum);
	
		// 해당 월의 첫 날의 요일
		int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1: 일요일, 2: 월요일, ..., 7: 토요일
        // 해당 월의 마지막 날짜
        int lastDate = calendar.getActualMaximum(Calendar.DATE);
        
		System.out.println("Sunday Monday Tuseday Wednseday Thursday Friday Saturday");
		
		
		 // 첫째 주 시작일까지 공백 출력
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("        ");
        }
        
        //날짜 출력 
        for (int date = 1; date <= lastDate; date++) {
        	System.out.printf("%4d", date); //2자리 수로 맞춰서 일의 자리일때 공백으로 
        	System.out.print("    ");
        	// 토요일이면 줄바꿈
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }
         // 다음 날짜로 이동
            calendar.add(Calendar.DATE, 1);
        	
        }
		
	}

}
