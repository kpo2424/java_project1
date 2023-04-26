package Homework4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이름과 점수 받기(10회 이상)
		System.out.println("Inputs more than 10 sets of names and scores(if exit, enter -1):");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			String input = sc.next();			
			if (Integer.parseInt(input) == -1) {
				String[] token = input.split(" "); //이름과 점수 구분
				for (String score : token) {
		             list.add(Integer.parseInt(score));
				}
				 Collections.sort(list);
	             System.out.println(list);
	             break;
			}
			
			
		}

		
	}

}

