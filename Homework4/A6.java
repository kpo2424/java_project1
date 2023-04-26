package Homework4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class A6 {
//	User inputs the numbers N and M
//	Print all the cases made by the combination of 1 to N and 1 to M
//	Add exception statements
//	2
//	3
//	1,1
//	1,2
//	1,3
//	2,1
//	2,2
//	2,3
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 0;
		int M = 0;
		while(true) {
			try {
				System.out.println("첫번째 숫자를 입력하세요.");
				N = sc.nextInt();
				break; //참이면 반복문 빠져나옴 
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("숫자형으로 입력하세요.");
				sc.nextLine();
			}
		}
		
		while(true) {
			try {
				System.out.println("두번째 숫자를 입력하세요.");
				M = sc.nextInt();
				break;//참이면 반복문 빠져나옴 
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("숫자형으로 입력하세요.");
				sc.nextLine();
			}
		}
		
		for(int i = 1; i <= N; i++) {
			  for(int j = 1; j <= M; j++) {
				  System.out.println(i + "," + j);
			  }
		 }
		 
		
	}
}

