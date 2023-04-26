package practice08;

public class forr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int k24_i = 1; k24_i <= 5; k24_i++) { //변수 k24_i가 1부터 5까지 증가하는 동안 반복
			System.out.println(k24_i); //정수형 출력 
		}

		
		int k24_i = 1; //변수 k24_i를 선언하고 1로 초기화

		while (k24_i <= 5) { //k24_i가 5이하일때 까지 반복
			System.out.println(k24_i); //정수형 출
			k24_i++; //k24_i +1증가
		}

		
		k24_i = 0; //변수 k24_i를 선언하고 0으로 초기화

		do { //무조건 한 번 실행
			k24_i++; //k24_i +1증가
			System.out.println(k24_i); //정수형 출력
		} while (k24_i <= 5); // k24_i가 5이하일때 동안 반복 
	}

}
