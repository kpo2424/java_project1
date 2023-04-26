package Homework3;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A6 {
//Fibonacci Numbers 재귀함수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				for (int i = num; i >= 1; i--) { //5 F0부터 시작이니까 
					int numF = num - i; // 0,1,2,3,4
					System.out.print(Fibonacci(numF) + " ");
				}System.out.println();
		}
	}
	
	public static int Fibonacci(int num) { //Fn = Fn-1 + Fn-2
 
		List<Integer> fibList = new ArrayList<>(Arrays.asList(0, 1));//첫 두 개의 값 F0=0, F1=1로 지정  
	
		for (int i = 2; i <= num; i++) { //F2부터 찾으려는 숫자까지 
	        fibList.add(fibList.get(i-1) + fibList.get(i-2)); //더한 값을 리스트에 추가 
	        
	    }
	    return fibList.get(num);
	}   
}

/*if (num == 0) {
return 0;
} else if (num == 1) {
return 1;
} else {
return Fibonacci(num -1) + Fibonacci(num -2);
}*/
