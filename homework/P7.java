package homework;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class P7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.nextLine(); //날짜1
        String date2 = scanner.nextLine(); //날짜2
       
        Date format1 = null;
      try {
         format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);
      } catch (ParseException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
        Date format2 = null;
      try {
         format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);
      } catch (ParseException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
        
        long diffSec = (format2.getTime() - format1.getTime()) / 1000; //초 차이
        long diffDays = (diffSec / (24*60*60))-1; //일자수 차이
        

        System.out.println(Math.abs(diffDays));
      // TODO Auto-generated method stub

   }

}
