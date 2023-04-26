package homework2;
import java.util.Arrays;
import java.util.Scanner;
//abcdefg
//fgdceba
//Yes
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("단어를 입력하세요: ");
			String sentence1 = scanner.next();
			System.out.print("단어를 입력하세요: ");
			String sentence2 = scanner.next();
		    int countFinal = 0;
		    
		    // 자기 자신의 중복 세기
		    for (int i = 0; i < sentence1.length(); i++) {
		    	  int count = 0;
		    	  int redundant = 0;
		          for (int j = 0; j < sentence1.length(); j++) {
		               if (sentence1.charAt(i) == sentence1.charAt(j)) {
		               redundant++;
		            }
		         }
		         // 나와 남을 세기
		         for (int k = 0; k < sentence2.length(); k++) {
		            if (sentence1.charAt(i) == sentence2.charAt(k)) {
		               count++;
		            }
		         }
		         count = count / redundant;
		         countFinal += count;
		      }
		      if (countFinal == sentence1.length()) {
		         System.out.println("Yes");
		      } else {
		         System.out.println("No");
		      }
		}
		
	}
}
