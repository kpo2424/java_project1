package practice08;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k24_n, k24_m; //변수k24_n,k24_m 선언
		k24_m = 20; //20으로 초기화
		k24_n = 1; //1로 초기화

		while (true) { //참일때 반복 
			for (int k24_i = 0; k24_i < k24_m; k24_i++) {//i가 0부터 m-1까지 증가하는 동안 반복 
				System.out.printf(" "); //빈칸 출력
			}
			for (int k24_i = 0; k24_i < k24_n; k24_i++) {//i가 0부터 n-1까지 증가하는 동안 반복
				System.out.printf("*"); //*출력
			}
			System.out.printf("\n"); //줄바꿈
			
			k24_m = k24_m - 1; //빈칸 하나씩 감소
			k24_n = k24_n + 2; //*두개씩 증가

			if (k24_m < 0) //빈칸이 음수일때 탈출
				break;
		}
	}
}
