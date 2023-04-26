package Java_04;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	      int m = scanner.nextInt();
	      int n = scanner.nextInt();
	      int sum = 0;
	      StringBuilder multiples = new StringBuilder(); //배수 

	      /*for (int i = 1; i <= m; i++) {
	         if (i % n == 0) { //n의 배수 구하기 
	            multiples.append(i + ","); //기존 문자열에 새로운 문자열 추가 
	            sum += i;
	         }
	      }*/
	      
	      int i = 1;
	      while (true) {
	    	  if (i % n == 0) {
		    	  if (i <= m) {
		    		  multiples.append(i + ","); //기존 문자열에 새로운 문자열 추가 
		    		  sum += i;
		    	  } else {
		    		  break;
		    	  }
	    	  }
	    	  i++;
	      }

	      multiples.deleteCharAt(multiples.length() - 1); //마지막 , 삭제 
	      System.out.println("SUM : " + sum + "(" + multiples.toString() + ")");
	  
	}
}