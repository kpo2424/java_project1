package main;

import java.util.Scanner;

public class P12 { //class의 이름: P12  

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int age;
			
			System.out.println("Input the 1st number!");
			int n1 = scanner.nextInt();//입력 받기 
			System.out.println("Input the 2st number!");
			int n2 = scanner.nextInt();
			int result = (n1 + n2);
			System.out.println("Result : " + n1 + "+" + n2 + "=" + result);

	}

}
