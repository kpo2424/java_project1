package homework;
import java.util.Scanner;
public class P13 { //힌트....
//I go to school by subway but it takes a very long time to go to school.
//cool
//2

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("문장을 입력하세요: ");
			String sentence1 = scanner.nextLine();
			System.out.print("단어를 입력하세요: ");
			String sentence2 = scanner.nextLine();
		    int min = 999;
		    
		    // 자기 자신의 중복 세기
		    for (int i = 0; i < sentence2.length(); i++) {
		    	  int count = 0;
		    	  int cntFinal = 0;
		    	  int redundant = 0;
		          for (int j = 0; j < sentence2.length(); j++) {
		               if (sentence2.charAt(i) == sentence2.charAt(j)) {
		               redundant++;
		            }
		         }
		         
		         // 나와 남을 세기
		         for (int k = 0; k < sentence1.length(); k++) { //문장 길이 만큼 
		             if (sentence2.charAt(i) == sentence1.charAt(k)) {
		                count++;
		            }
		         }
		         cntFinal = count / redundant; //중복값을 있는 값으로 나누면 1일때 딱 맞아 떨어짐 
		        //System.out.println(count);
		        //System.out.println();
		         
		         if (cntFinal < min) {
			    	min = cntFinal;  
			     }
		    }
		    System.out.println(min);
		      
		}
		
	   }
	} 