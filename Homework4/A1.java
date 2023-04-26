package Homework4;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
//queue
public class A1 { //숫자 배열 넣고 뽑을 숫자 입력하고 몇 번 째에 나노는지 번호 출력

	public static void main(String[] args) {

		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				String numbers = sc.nextLine(); // 숫자 입력 
				
				//공백 기준으로 배열 
				String[] n = numbers.split(" "); //n 배열{"1", "3", "2"}
				//queue 객체에 숫자 요소들을 추가
				Queue<Integer> queue = new LinkedList<Integer>();
				for (String number : n) {
					queue.offer(Integer.parseInt(number));//순서대로 큐에 추가 
				}
				
				//출력할 숫자 입력
				 System.out.print("어떤 숫자를 출력하겠습니까? ");
			     int target = sc.nextInt();
			     //숫자가 몇 번째로 나오는지 출력
			     int index = 0;
			     while (!queue.isEmpty()) {
			    	    Integer number = queue.poll();
			    	    index++;
			    	    if (number == target) {
			    	    	System.out.println(index);
			    	    	break;
			    	    }
			     }
			} catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				e.printStackTrace();
			}
		}
		
	}
}

