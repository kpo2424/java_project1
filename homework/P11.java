package homework;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 원화->달러 2. 달러->원화 3.원화->유로
		//환율정보 3개 
		
		int won, dollar, eur;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("#Current Converter");
		System.out.println("1. South Korean won -> United States Dollar");//원/달러 
		System.out.println("2. United States Dollar -> South Korean won");//원*달러
		System.out.println("3. Europe eu -> South Korean won");//유로*원 
		
		int choice = scanner.nextInt();
		
		if (choice == 1 || choice == 2 || choice == 3) {
			int money = scanner.nextInt();
			if (choice == 1) {
				double result = money/1306.5;
				System.out.println((int)result);
			} else if (choice == 2) {
				double result = money*1306.5;
				System.out.println((int)result);
			} else if (choice == 3) {
				double result = money*1409.6;
				System.out.println((int)result);
			} else {
				System.out.println("다시 선택하세요.");
			}	
		} else {
			System.out.println("다시 선택하세요.");
		}
		
		
		
	}

}
