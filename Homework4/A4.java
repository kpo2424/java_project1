package Homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A4 {
//South Korea has a earned a reputation as a leading global ICT center
//	s 
//	15
//	South Korea has a earned a reputation as a leading global ICT center
//	S
//	1
//입력한 문자열에서 입력한 알파벳이 몇번째에 있는지 찾기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("문장을 입력하세요: ");
				String sentence = scanner.nextLine();
				System.out.print("알파벳을 입력하세요: ");
				String character = scanner.nextLine();
				if (!Character.isLetter(character.charAt(0))) {
					throw new IllegalArgumentException("알파벳을 입력하세요.");
				}
					 
				for (int i = 0; i < sentence.length(); i++) {
					char ch1 = sentence.charAt(i);
					char ch2 = character.charAt(0);
					if (ch1 == ch2) {
						System.out.println(i+1);
					}
				}
			} catch(InputMismatchException e) {
				  e.printStackTrace();
				  System.out.println("알파벳을 입력하세요.");
			}
		}
		
		
	}

}
