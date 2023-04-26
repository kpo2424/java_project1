package homework2;
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        
	     System.out.print("첫 번째 정보 입력 (m/s): ");
	     double num1 = sc.nextDouble();
	     System.out.print("두 번째 정보 입력 (km/h): ");
	     double num2 = sc.nextDouble();
	     System.out.print("세 번째 정보 입력 (m/ms): ");
	     double num3 = sc.nextDouble();

	     double num1ms = num1; //190
	     double num2ms = num2 * 10 / 36; // 216
	     double num3ms = num3 * 1000; // 190
	  
	     double max = num1;
	     if (num2ms > max && num2ms > num3ms) {
	    	 num2ms = num2;
	    	 max = num2;
	     } else if (num3ms > max && num3ms > num2ms) {
	    	 num3ms = num3;
	    	 max = num3;
	     } 
	     System.out.print(max);
		
	}

}
