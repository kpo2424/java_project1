package practice5;

public class gugudan1 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("****************\n"); //출력
			System.out.printf("****** 구구단 %d단****\n", i); //출력
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.printf("****************\n"); //출력
		}
	}

}
