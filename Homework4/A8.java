package Homework4;

import java.util.Scanner;

// 1. Size of the first word
// 2. Size of the second word
// 3. Number of the same characters
//scholar
//school
//1 : 6
//2 : 7
//3 : 5
public class A8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		 
		while(true) {
			System.out.print("단어를 입력하세요: ");
			String sentence1 = scanner.next();
			System.out.print("단어를 입력하세요: ");
			String sentence2 = scanner.next();
			System.out.println("1. " + sentence1.length());
			System.out.println("2. " + sentence2.length());
			
			// 입력한 두 단어가 중복되는 알파벳의 갯수 계산
			int overlapCount = 0;
			 
			for (int i = 0; i < sentence2.length(); i++) {
                char c = sentence2.charAt(i); // 두 번째 단어의 문자 하나씩 담기
                boolean found = false; // 중복되는 문자를 찾았는지 여부

                for (int j = 0; j < sentence1.length(); j++) {
                    if (c == sentence1.charAt(j)) { // 첫 번째 단어와 같은 문자인 경우
                        overlapCount++;
                        found = true;
                        break;
                    }
                }

                if (found) {
                    // 중복되는 문자가 발견된 경우, 중복된 문자의 수로 나눠서 중복 카운트 갱신
                    for (int j = i + 1; j < sentence2.length(); j++) {
                        if (c == sentence2.charAt(j)) {
                            overlapCount--;
                            break;
                        }
                    }
                }
            }

            System.out.println("3. : " + overlapCount);
		} 
   
		
	}
}
