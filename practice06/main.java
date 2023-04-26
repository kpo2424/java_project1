package practice06;

public class main {

	public static void main(String[] args) {

		// #1. 연산 후 대입, 사칙연산의 순서
		int kopo24_ii; // 정수형 변수 kopo24_ii 선언
		kopo24_ii = 1 + 2; // 변수 kopo24_ii에 1+2의 결과 값 대입
		System.out.printf("#1-1 : %d\n", kopo24_ii); //계산된 변수값 kopo24_ii 정수형으로 출력. 
		// 곱셈과 나눗셈이 먼저 계산됨(사칙연산 순서로)
		kopo24_ii = 1 + 2 * 3; // kopo24_ii 변수에 1+2*3의 결과 값 대입
		System.out.printf("#1-2 : %d\n", kopo24_ii); //계산된 변수값 kopo24_ii 정수형으로 출력. 

		// #2. 누적하기, 합 구하기
		// c는 맨 앞에서만 선언해야 하지만, c++,java는 필요할 때 선언해도 됨
		int kopo24_sum; // 정수형 변수 kopo24_sum 선언
		kopo24_sum = 0; // 변수 kopo24_sum을 0으로 초기화 (누적, 루프는 꼭 초기화)

		// 1부터 100까지 더하기
		for (int kopo24_i = 1; kopo24_i < 101; kopo24_i++) { //kopo24_i가 1부터 100까지 증가하는 동안 반복문 100번 실행
			kopo24_sum = kopo24_sum + kopo24_i; //kopo24_sum에 kopo24_i를 더하여 누적한 값을 kopo24_sum에 대입 
		}
		System.out.printf("#2-1 : %d\n", kopo24_sum); //계산된 변수값 kopo24_sum 정수형으로 출력.
		System.out.printf("#2-2 : %d\n", kopo24_sum / 100); //더한 갯수만큼 나누어 평균 구하기. 정수형으로 출력.

		int[] kopo24_v = { 1, 2, 3, 4, 5 }; // 크기가 5인 정수형 배열 kopo24_v를 선언하고, 1부터 5까지의 값을 초기화
		int kopo24_vSum; // 정수형 변수 kopo24_vSum 선언

		kopo24_vSum = 0; //정수형 변수 kopo24_vSum 초기화

		for (int kopo24_i = 0; kopo24_i < 5; kopo24_i++) { //kopo24_i가 0부터 4까지 증가하는 동안 반복문 5번 실행
			kopo24_vSum = kopo24_vSum + kopo24_v[kopo24_i]; //kopo24_vSum에 kopo24_v[kopo24_i]를 더하여 누적한 값을 kopo24_vSum에 대입 
		} //kopo24_v[kopo24_i]는 kopo24_v 배열의 kopo24_i번째 요소

		System.out.printf("#2-3 : %d\n", kopo24_vSum); //계산된 변수값 kopo24_vSum 정수형으로 출력. 

		// #3. 정수형 변수의 나눗셈은 정수범위에서 버림처리
		kopo24_ii = 1000 / 3; // 변수 kopo24_ii에 1000 / 3 결과값 대입
		System.out.printf("#3-1 : %d\n", kopo24_ii); //계산된 변수값 kopo24_ii 정수형으로 출력.

		kopo24_ii = 1000 % 3; // 변수 kopo24_ii에 1000 % 3 결과값 대입 (%는 나머지 값을 의미)
		System.out.printf("#3-2 : %d\n", kopo24_ii); //계산된 변수값 kopo24_ii 정수형으로 출력. 
		// 나머지 연산자의 응용
		for (int kopo24_i = 0; kopo24_i < 20; kopo24_i++) { // kopo24_i가 0부터 19까지 증가하는 동안 반복문 20번 실행
			System.out.printf("#3-3 : %d\n", kopo24_i); //계산된 변수값 kopo24_i 정수형으로 출력.

			if (((kopo24_i + 1) % 5) == 0) { // 5번에 한번씩 줄바뀜을 해주시 위해 if문 작성. 0부터 시작이니깐 +1해줌
				System.out.printf("\n");
			}
		}

		// #4. 원하는 자릿수 반올림, 버림처리 (함수 쓰지 않고 처리하기)
		// 함수 쓰지 않고 버림 처리
		kopo24_ii = 12345; // 정수형 변수 kopo24_ii에 12345 대입
		// 변수 kopo24_j에 선언하고 변수 kopo24_ii의 일의 자리수를 0으로 만들어준 값으로 초기화
		int kopo24_j = (kopo24_ii / 10) * 10; 
		System.out.printf("#4-1 : %d\n", kopo24_j); // 계산된 변수값 kopo24_j 정수형으로 출력

		// 함수 쓰지 않고 반올림 처리
		kopo24_ii = 12345; // 정수형 변수 kopo24_ii에 12345 대입
		kopo24_j = ((kopo24_ii + 5) / 10) * 10; // 5를 더함으로 십의 자리가 바뀌면 올림
		System.out.printf("#4-2 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력

		kopo24_ii = 12344; // 정수형 변수 kopo24_ii에 12344 대입
		kopo24_j = ((kopo24_ii + 5) / 10) * 10; // 5를 더한 후 십의 자리가 바뀌지 않으면 버림됨
		System.out.printf("#4-2 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력

		// #4-1. 100원이하 버림/올림
		kopo24_ii = 12345; // 정수형 변수 kopo24_ii에 12345 대입
		kopo24_j = ((kopo24_ii + 50) / 100) * 100; // 50을 더함으로 백의 자리가 바뀌지 않으면 버림
		System.out.printf("#4-3 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력

		kopo24_ii = 12355; // 정수형 변수 kopo24_ii에 12355 대입
		kopo24_j = ((kopo24_ii + 50) / 100) * 100; // 50을 더한 후 십의 자리가 바뀌면 반올림
		System.out.printf("#4-3 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력
		
		// #4-2. 10000원이하 버림/반올림
		kopo24_ii = 12345; // 정수형 변수 kopo24_ii에 12345 대입
		kopo24_j = ((kopo24_ii + 500) / 1000) * 1000; // 500을 더함으로 천의 자리가 바뀌지 않으면 버림
		System.out.printf("#4-4 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력

		kopo24_ii = 12545; // 정수형 변수 kopo24_ii에 12545 대입
		kopo24_j = ((kopo24_ii + 500) / 1000) * 1000; // 500을 더한 후 십의 자리가 바뀌면 반올림
		System.out.printf("#4-4 : %d\n", kopo24_j); //  계산된 변수값 kopo24_j 정수형으로 출력
		
		
		// #5. 소수점 이하에서 원하는 자릿수 반올림, 버림처리 (함수 쓰지 않고 처리하기)
		int kopo24_MyVal = 14 / 5; // 변수 kopo24_MyVal 정수형 선언 후 14 / 5 대입
		System.out.printf("#5-1 : %d\n", kopo24_MyVal);// 계산된 변수값 kopo24_MyVal 정수형으로 출력

		double kopo24_MyValF; // 변수 kopo24_MyValF 실수형 선언

		kopo24_MyValF = 14 / 5;//변수 kopo24_MyValF에 14 / 5 대입
		System.out.printf("#5-2 : %f\n", kopo24_MyValF); // 계산된 변수값 kopo24_MyValF 실수형으로 출력

		kopo24_MyValF = 14.0 / 5; // .0 실수형 표시를 해야 실수형으로 나옴 
		System.out.printf("#5-3 : %f\n", kopo24_MyValF);//계산된 변수값 kopo24_MyValF 실수형으로 출력

		kopo24_MyValF = (14.0) / 5 + 0.5; // 변수 kopo24_MyValF에 14 / 5 계산 후 0.5 더한값 대입 
		System.out.printf("#5-4 : %f\n", kopo24_MyValF);//계산된 변수값 kopo24_MyValF 실수형으로 출력

		kopo24_MyVal = (int) ((14.0) / 5 + 0.5); // 정수형으로 반환하기(소수점 이하 버림)
		System.out.printf("#5-5 : %d\n", kopo24_MyVal);//계산된 변수값 kopo24_MyValF 실수형으로 출력
	}

}
