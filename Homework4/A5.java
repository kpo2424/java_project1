package Homework4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A5 {
//int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
//5
//356 53
//배열 하나씩 , 기준으로 나눠서 5들어 있는지 확인 
	public static void main(String[] args) {

		//예외처리 어떻게 했느냐
		//5가 들어가지 않으면 예외처리 
		//각각의 숫자의 자리수가 5랑 같은지 확인 
		//InputMismatchException
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			//공백 기준으로 배열 
			ArrayList<Integer> list = new ArrayList<>();
		    String[] numbers = sc.nextLine().split(" ");
		    for (String str : numbers) {
		         list.add(Integer.parseInt(str));
		     }
		     //System.out.println(list); //n 배열[123 32 356]
		    try {       
			    System.out.println("찾을 한자리 숫자를 입력하세요.");
			    int n = sc.nextInt();
			    
			    
				if (n >= 0 && n < 9) {
					for (int i = 0; i < list.size(); i++) {
					     int number = list.get(i);
					     //n이 number에 포함되면 출력  
					     if (String.valueOf(number).contains(String.valueOf(n))) {
					         System.out.print(number + " ");
					      }
					 }
				 } else {
				      throw new InputMismatchException();
				 }
			 } catch(InputMismatchException e) {
				    e.printStackTrace();
					System.out.println("한자리 숫자를 입력하세요.");
			 }
		 }
		
     }
}
