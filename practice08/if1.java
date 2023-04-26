package practice08;

import java.util.Scanner; //Scanner 사용하기 위한 import

public class if1 {

	public static void main(String[] args) {

		Scanner k24_scanner = new Scanner(System.in); //scanner 객체 생성 

		int k24_score = k24_scanner.nextInt(); // 사용자로부터 score 변수값 입력받기
		if (k24_score > 60) { //조건: score가 60초과일 때
			System.out.println("합격입니다"); //참이면 출력
		} else { //조건과 불일치하면
			System.out.println("불합격입니다"); //출력
		}

		int k24_num = k24_scanner.nextInt(); // 사용자로부터 num값 입력받기
		if (k24_num > 0) { // 조건: num이 0초과일 때
			System.out.println("양수입니다"); //출력
		} else if (k24_num < 0) { // 0미만일 때
			System.out.println("음수입니다"); //출력
		} else { //둘다 아니면
			System.out.println("0입니다");//출력
		}

		int k24_score2 = k24_scanner.nextInt(); // 사용자로부터 score2값 입력받기
		if (k24_score2 >= 90) { // 조건: score가 90 이상일 떄
			System.out.println("A등급"); // 출력
		} else if (k24_score2 >= 80 && k24_score2 < 90) { //80이상 90미만일때
			System.out.println("B등급"); //출력
		} else if (k24_score2 >= 70 && k24_score2 < 80) { //70이상 80미만일때
			System.out.println("C등급"); //출력
		} else { //모든 조건에 해당 안될때
			System.out.println("F등급"); //출력
		} 
	}

}
