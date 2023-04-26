package practice06;

public class MyTest {

	// netprice(세전가격) 함수에 소비자가는 정수형, 세율은 실수형으로 선언
	public static int netprice(int kopo24_price, double kopo24_rate) {
		// 소비자가=세전가격+세금 //세금=세전가격*세율
		return (int) (kopo24_price / (1 + kopo24_rate)); // 세전가격=소비자가/(1+세율) 반환
	}

	public static void main(String[] args) {

		int kopo24_price = 1234;// 소비자가를 정수형 변수 kopo24_price로 선언하고 초기값 1234 저장
		double kopo24_tax_rate = 0.1; // 세율을 실수형 변수 kopo24_tax_rate로 선언하고 초기값 0.1 저장

		// 함수 netprice를 호출하고 반환된 세전가격을 변수 kopo24_netprice에 저장
		int kopo24_netprice = netprice(kopo24_price, kopo24_tax_rate);
		// 소비자가에 세전가격을 뺀 값을 세금 변수 kopo24_tax에 저장
		int kopo24_tax = kopo24_price - kopo24_netprice; // 소비자가-세전가격=세금 변수 선언

		System.out.printf("********************************************\n");// 출력
		System.out.printf("*     소비자가, 세전가격, 세금 계산       *\n");// 출력
		// 정수형으로 출력
		System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금: %d\n", kopo24_price, kopo24_netprice, kopo24_tax);
		System.out.printf("********************************************\n");// 출력
	}
}
