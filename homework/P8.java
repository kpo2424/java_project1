package homework;
import java.time.LocalDate;
import java.util.Calendar;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("input 8 numbers ");
        String input = scanner.nextLine();

        int year = Integer.parseInt(input.substring(0, 4)); // 스트링을 인트형으로 바꿔줄때 parseInt
        int month = Integer.parseInt(input.substring(4, 6));
        int day = Integer.parseInt(input.substring(6, 8));

        System.out.print("input add number: ");
        int daysToAdd = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // 월은 0부터 시작하므로 1을 빼줍니다.
        calendar.add(Calendar.DATE, daysToAdd);

        int resultYear = calendar.get(Calendar.YEAR);
        int resultMonth = calendar.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더해줍니다.
        int resultDay = calendar.get(Calendar.DAY_OF_MONTH);

        String result = String.format("%04d%02d%02d", resultYear, resultMonth, resultDay+1);
        System.out.println(result);
    }
}

		
	


