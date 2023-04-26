package practice5;

public class sds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int k24_sum = 0; //정수형 k24_sum 변수 선언 후 0으로 초기화
		
		//변수 k24_i 선언 후 0부터 9까지 증가하는 동안 반복
		for (int k24_i = 0; k24_i < 10; k24_i++) { 
			k24_sum = k24_sum + k24_i; //k24_i가 증가하는 동안 누적합 저장
		}
		System.out.printf("sum %d\n", k24_sum); //정수형 출력 

		System.out.printf("****************\n"); //출력
		
		//변수 k24_i 선언 후 1부터 9까지 증가하는 동안 반복
		for (int k24_i = 1; k24_i < 10; k24_i++) { 
			System.out.printf("  구구단 %d 단 \n", k24_i); // 변수 k24_i출력
			System.out.printf("****************\n"); // 출력
			// 변수 k24_j 선언 후 1부터 9까지 증가하는 동안 반복
			for (int k24_j = 1; k24_j < 10; k24_j++) { 
				System.out.printf("%d * %d = %d \n", k24_i, k24_j, k24_i * k24_j); //정수형 출력
			}
		}

		
	}

}
