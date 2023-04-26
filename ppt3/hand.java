package ppt3;
import java.util.Scanner;

public class hand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//오답노트 
		int n = scanner.nextInt();
		double result = 1/7.0; // 변수 초기화 해줘야지 새로운 결과값 갱신 
		

		for (int i=1; i<n; i++) {
			result = result*(1/7.0);
		}
		System.out.println(result);
		
		
	}
}
