import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number + "\n");
		
//		for (int i = 2; i <= number; i++) { // 5 2 1 거꾸로 출력 
//			int result = number % i;
//				if (result == 0) {
//					if (i >1) {
//					System.out.println(number/i);
//					}
//				}
//		}
		
		
		for (int i = number; i > 0; i--) {
			int result = number % i; //나머지 값 구하기 
				if (result == 0) { //나머지가 0일때 (나누어 떨어질때) 인수가 됨 
					if (i >1) { // number 제외한 약수 출력 
						int factors = number/i;
						System.out.println(factors);
					}
				}
		}
		
		
	}

}
