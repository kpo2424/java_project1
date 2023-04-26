package Homework4;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 
import java.util.Scanner;

public class A2 {
//stack
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				String numbers = sc.nextLine(); // 숫자 여러개 입력 
				
				//공백 기준으로 배열 
				String[] n = numbers.split(" "); //n 배열{"1", "3", "2"}
				//Stack 객체에 숫자 요소들을 추가
				Stack<Integer> stack = new Stack<Integer>();
				for (String number : n) {
					stack.add(Integer.parseInt(number));//순서대로 큐에 추가 
				}
				
				//출력할 숫자 입력
				 System.out.print("어떤 숫자를 출력하겠습니까? ");
			     int target = sc.nextInt();
			     //숫자가 몇 번째로 나오는지 출력
			     int index = 0;
			     while (!stack.isEmpty()) {
			    	    Integer number = stack.pop(); //나중 입력한 숫자부터 나옴 
			    	    index++; //나온 숫자의 순서 
			    	    if (number == target) {
			    	    	System.out.println(index);
			    	    	break;
			    	    }
			     }
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("숫자를 입력하세요.");
			}
		}
		
	}

}
