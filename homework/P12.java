package homework;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("#Temperature  Converter");
		System.out.println("1.Celsius -> Fahrenheit");
		System.out.println("2.Fahrenheit -> Celsius");
		
		int choice = scanner.nextInt();
		int number = scanner.nextInt();
		
		if (choice == 1) { //C -> F
			 float result = (float) ((number * 1.8) + 32);
			 System.out.printf("%.1f", result);
		} else if (choice == 2) {
			float result = (float) ((number - 32) / 1.8);
			System.out.printf("%.1f", result);
		}
		
	}
}
