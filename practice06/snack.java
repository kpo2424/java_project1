package practice06;

public class snack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] kopo24_item = { "맛동산", "웨하스", "오레오", "오땅", "사브레" };// 크기가 5인 문자열 kopo24_item을 선언하고, 값 저장
		int[] kopo24_price = { 1000, 2000, 3000, 2500, 1450 }; // 크기가 5인 정수형 배열 kopo24_price를 선언하고, 값 저장
		int[] kopo24_amount = { 10, 2, 1, 3, 5 }; // 크기가 5인 정수형 배열 kopo24_amount를 선언하고, 값 저장
		double kopo24_tax_rate = 0.1; // 실수형 변수 kopo24_tax_rate를 선언하고 값 저장
		int kopo24_total_sum = 0; // 정수형 변수 kopo24_total_sum을 선언하고 값 0으로 초기화

		System.out.printf("******************************************\n"); // 출력
		System.out.printf("             구매한 과자 목록         \n"); // 출력
		System.out.printf(" 항목       단가     수량      합계\n"); // 출력
		for (int kopo24_i = 0; kopo24_i < kopo24_item.length; kopo24_i++) { // kopo24_item가 0부터 배열 길이만큼 증가하는 동안 반복문 실행
			int kopo24_sum = kopo24_price[kopo24_i] * kopo24_amount[kopo24_i]; // 가격과 수량의 곱을 합계에 저장
			// kopo24_price[kopo24_i]는 kopo24_price 배열의 kopo24_i번째 요소
			kopo24_total_sum = kopo24_total_sum + kopo24_sum;// 총 합계에 합계를 더하여 누적 시킨 값을
																// 총 합계에 저장(지불 금액)
			System.out.printf("%.4s\t%7d\t\t%2d\t%9d\n", kopo24_item[kopo24_i], kopo24_price[kopo24_i],
					kopo24_amount[kopo24_i], kopo24_sum); // 정수형 출력
		}
		System.out.printf("******************************************\n"); // 출력
		System.out.printf("지불금액:      \t%20d\n", kopo24_total_sum); // 정수형 출력

		int kopo24_total_net_price = (int) (kopo24_total_sum / (1 + kopo24_tax_rate)); // 선언한 변수 비과세금액에 정수형으로 저장
		System.out.printf("비과세금액:     %20d\n", kopo24_total_net_price); // 정수형 출력
		int kopo24_tax = kopo24_total_sum - kopo24_total_net_price; // (총 합계-비과세액)을 선언된 변수 tax에 저장 
		System.out.printf("세  금:        \t%20d\n", kopo24_tax); // 정수형 출력
	}
}
