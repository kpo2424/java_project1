package main;

import java.util.Scanner;

public class A4_Variable {

	public static void main(String[] args) {
		// 원주 구하기 
		
		Scanner scanner = new Scanner(System.in);
		
		final double PI = 3.14159265358979323846; //변수에 final 적용하면 상수 값이 됨 
		final int count = 2;
		int radius;
		
		System.out.print("반지름을 입력하세요:");
		radius = scanner.nextInt(); // 반지를 입력 받기 
		
		double result = PI * count * radius; 
		
		System.out.println("원의 길이는 " + result + "입니다.");
		
	}

}
