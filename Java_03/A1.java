package Java_03;

import java.util.Scanner;

public class A1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE; //int 자료형이 표현할 수 있는 최솟값을 나타내는 상수
        int min = Integer.MAX_VALUE;

        while (true) { //3번 미만이면 반복 수행 
        	
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt(); // 숫자 입력 받기 

            sum += num; //입력받은 숫자에 기존 합 더하기(누적 시킨 값)
            max = Math.max(max, num); //두개의 숫자 중에서 큰 값 반환하는 메소드 
            min = Math.min(min, num);
            count++;

            System.out.println("Result: " + count + " - Mean " +  sum / count + ", Max " + max + ", Min " + min);
        }
    }
}

		
	
	

