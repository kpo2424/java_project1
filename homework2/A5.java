package homework2;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {

//조건 1.문자열의 길이가 5이상 2. 문자열의 길이가 15이하 3. o를 포함하지 않음 4.a를 포함 5. 소문자만 
		 Scanner scanner = new Scanner(System.in);
	     String input = scanner.nextLine();
	     int length = input.length();
	        
		if (length >= 5 && length <= 15) {
			if (input.contains("a") && !input.contains("o") && input.equals(input.toLowerCase())) {	
			System.out.println("PASS");	
			 } else {
			      System.out.println("FAIL");
			 }
		} else {
			 System.out.println("FAIL");
		}
		
	}
}
