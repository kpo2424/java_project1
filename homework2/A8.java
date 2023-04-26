package homework2;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("#Menu");
			System.out.println("1.Encoder(number)");
			System.out.println("2.Decoder(text:a-j)");
			System.out.println("3.Exit");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
		
			if (choice == 1) {
				String number = sc.next(); //숫자 입력
				for (int i = 0; i < number.length(); i++) {
					char ch = number.charAt(i);
					if (ch >= '0' && ch <= '9') {
						int num = ch - '0'; // 0=0 구하기 
						char alpha = (char) ('a' + num);
						System.out.print(alpha);
					} 
				} System.out.println();			
			} else if (choice == 2) {
				//a~j에 숫자 담기 
				String word = sc.next(); //문자 입력 
				for (int i = 0; i < word.length(); i++) { //문자길이만큼 반복 
					char ch = word.charAt(i); //단어 하나로 저장
					if (ch >= 'a' && ch <= 'j') {
						int num = ch - 'a'; //a=0 번호 구하기
						System.out.print(num);
					}
				} System.out.println();
			} if (choice == 3) {
				System.out.println("종료합니다");
				break;
				}
		}
			
	}

}
