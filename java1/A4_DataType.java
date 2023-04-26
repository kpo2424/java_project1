package java1;

import java.util.Scanner;

public class A4_DataType {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		byte a = 127;
		short b = 32000;
		boolean result;
		
		System.out.println(a + "는 " + b + "보다 큰가요?");
		result = (a > b);
		System.out.println(result);
		
	}
}