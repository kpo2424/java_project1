package Practice2;
import java.util.Scanner;
public class Recursive { //재귀함수 (내가 나를 부름) 반복문의 역할을 함 

	public static void main(String[] args) {
//
//		for (int i =1; i <= 10; i++) {
//			System.out.println(sumToOne(i));//1 1+2 1+2+3
//		}
//	}
//	
//	public static int sumToOne(int number) { //number를 입력 받고
//		if (number == 1) { // i가 1이면 1 반환 
//			return 1;
//		} else {
//			return number + sumToOne(--number); // 5면 5 + sumToOne(4)
//		}
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();

			System.out.println(sumToTen(6));//10 9+10 8+9+10
		
	}
	
	public static int sumToTen(int number) { //number를 입력 받고
		if (number > 10) { // i가 10이면 10 반환 
			return 0;
		} else {
			return number + sumToTen(++number); // 9면 9 + sumToOne(10)
		}
		
		
		
	}

}
