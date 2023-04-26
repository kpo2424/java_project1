package practice9;

public class gugudan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i_k24를 단수로 선언하고 3개단 출력 후 다음줄로 넘어감
		for (int i_k24 = 1; i_k24 < 10; i_k24 = i_k24 + 3) {
			System.out.printf("***************\t***************\t***************\n"); // 출력
			System.out.printf("구구단 %d단  \t구구단 %d단  \t구구단 %d단  \n", i_k24, i_k24 + 1, i_k24 + 2); // 출력
			System.out.printf("***************\t***************\t***************\n"); // 출력
			// 1_9까지 곱하는 변수 j_k24 선언 후 1씩 증가하는 동안 반복
			for (int j_k24 = 1; j_k24 < 10; j_k24++) {
				System.out.printf("%d * %d = %d\t", i_k24, j_k24, i_k24 * j_k24); //1단
				System.out.printf("%d * %d = %d\t", i_k24 + 1, j_k24, (i_k24 + 1) * j_k24); //2단
				System.out.printf("%d * %d = %d\n", i_k24 + 2, j_k24, (i_k24 + 2) * j_k24); //3단
			}
		}

//		// i_k24를 단수 변수로 선언하고 3개단씩 증가시켜 3개단 출력 후 다음줄로 넘어감
//		for (int i_k24 = 1; i_k24 < 4; i_k24++) { // 3번 반복
//			System.out.printf("***************\t***************\t***************\n"); // 출력
//			System.out.printf("구구단 %d단  \t구구단 %d단  \t구구단 %d단  \n", i_k24, i_k24 + 3, i_k24 + 6); // 출력
//			System.out.printf("***************\t***************\t***************\n"); // 출력
//			// 1_9까지 곱하는 변수 j_k24 선언 후 1씩 증가하는 동안 반복
//			for (int j_k24 = 1; j_k24 < 10; j_k24++) {
//				System.out.printf("%d * %d = %d\t", i_k24, j_k24, i_k24 * j_k24);//1단
//				System.out.printf("%d * %d = %d\t", i_k24 + 3, j_k24, (i_k24 + 3) * j_k24);//4단
//				System.out.printf("%d * %d = %d\n", i_k24 + 6, j_k24, (i_k24 + 6) * j_k24);//7단
//			}
//		}

	}

}
