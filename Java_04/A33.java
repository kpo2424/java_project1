package Java_04;
import java.util.Scanner;
public class A33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // N 입력 받기
		int m = scanner.nextInt();
		int time = m / n;
		int sum = 0;
		String multiples = "";

		for (int i = 1; i <= time; i++) {
		    if (i < time) {
		        int multiple = n * i; // 배수 구하기 
		        multiples += multiple + ",";
		    } else if (i == time) {
		        int multiple = n * i;
		        multiples += multiple + ")";
		    }
		}

		//총 합 구하기 
		System.out.print("SUM : ");
		for (int i = 1; i <= time; i++) {
		       int multiple = n * i;
		        sum += multiple;
		}
		System.out.println(sum);

		//배수 출력하기
		System.out.print(multiples);
	}

}
