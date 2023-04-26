package practice08;

public class blank {

	public static void main(String[] args) {

		//변수 k24_i를 선언하고 0부터 9까지 증가하는 동안 반복 
		for (int k24_i = 0; k24_i < 10; k24_i++) { 
			//변수 k24_j를 선언하고 0부터 k24_i까지 증가하는 동안 반복 
			for (int k24_j = 0; k24_j < k24_i; k24_j++) {
				System.out.printf(" "); //k24_j만큼 띄어쓰기 출력
			}
			System.out.printf("%d\n", k24_i); //숫자와 줄바꿈 출력
		}
	}

}
