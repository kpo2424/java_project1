package Homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		
		int count = 0;
        int mean = 0;
        int max = Integer.MIN_VALUE; //int 자료형이 표현할 수 있는 최솟값을 나타내는 상수
        int min = Integer.MAX_VALUE;
        int[] nums = new int[100];
		ArrayList<Integer> list  = new ArrayList<>(); //빈 리스트 생성 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			 try {
				System.out.print("숫자를 입력하세요: ");
				int num = sc.nextInt();
				nums[count] = num; // 입력받은 숫자를 배열에 추가
	            count++; // 숫자 개수 증가
		        
	             // 배열에서 최대값, 최소값 찾기
                for (int i = 0; i < count; i++) {
                    max = Math.max(max, nums[i]);
                    min = Math.min(min, nums[i]);
                }
                
                // 배열에서 평균값 구하기
                int sum = 0;
                for (int i = 0; i < count; i++) {
                    sum += nums[i];
                }
                mean = sum / count;

			    System.out.println("Result: " + count + " - Mean " +  mean + ", Max " + max + ", Min " + min);
			 } catch(InputMismatchException e) {
				 System.out.println("숫자를 입력하세요.");
			 }
	    }
		
	}
}
