package Homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//<Split a String and Sort>
//User inputs a string
//Print the words after splitting it against by a black(“ “) 공백 기준으로 
//Sort them by in descending order and print them again 내림차순 정렬 
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] world = input.split(" ");
		Arrays.sort(world, Collections.reverseOrder());
		for (int i = 0; i < world.length; i++) {
			System.out.print(world[i] + " ");
		}
			
	}
}
