package main;

import java.util.Scanner;

public class A4_Constant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		String name = "yejin";
		String  gender = "woman";
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		System.out.print("나이를 입력하세요:");
		
		age = scanner.nextInt();
		System.out.println("나이: " + age + "\n");

	}

}
