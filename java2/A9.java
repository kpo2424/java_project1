import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		
//		for (int i = 2; i <= N; i++) { //N번 반복
//			boolean prime = true;
//			for (int j = 2; j <= i; j++) {  
//				if (i % j == 0) { //나누어 떨어지면 소수 아님 
//					prime = false;
//					break;
//				}
//			}
//			if (prime) {
//				System.out.println(i);	
//			}
//		}
		
		for (int i = 1; i <= N; i++) {
			count = 0;
				for (int j =1; j <= i; j++) {
					if ((i % j) == 0) {
						count++;
					}
				}
		
				if (count == 2) {
					System.out.println(i);
				}	
		}
	
		
		
	}

}
