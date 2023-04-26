package calender;
import java.util.Calendar;

public class mainCalendar {

		public static void main(String[] args) {
			
			Calendar calendar = Calendar.getInstance();
			System.out.println(calendar.getTime());
			System.out.println(calendar.get(Calendar.YEAR));
			System.out.println(calendar.get(Calendar.MONTH));
			System.out.println(calendar.get(Calendar.DATE));
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));// 일요일1
			System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
			System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  // 연중 80번째 날
			System.out.println(calendar.get(Calendar.HOUR));
			System.out.println(calendar.get(Calendar.HOUR_OF_DAY));// 24시간제로 나타낸 현재 시간
			
		}

}
