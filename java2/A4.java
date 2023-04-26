import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number);
		
		
		for (int i = 0; i < number; i++) { // 5번 라인 출력
			for (int j = i; j < (number-1); j++) { // 출력할 갯수가 점점 줄어즐어야 됨 > j=i부터 시작해서 4번 출력 
				System.out.print(" ");
			} for (int k = 0; k <= i; k++) {
					System.out.print("*");
				} for (int y = 0; y < i; y++) {
					System.out.print("*");
					} System.out.println();
		}
		
	}
		

}
