package practice08;

public class and {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k24_iVal; // 변수 k24_iVal 선언

		// k24_i가 0부터 299까지 증가하는 동안 반복
		for (int k24_i = 0; k24_i < 300; k24_i++) {
			k24_iVal = 5 * k24_i; // 5의 배수로 k24_iVal값에 저장
			if (k24_iVal >= 0 && k24_iVal < 10) { //k24_iVal가 0~9이면
				System.out.printf("일 %d\n", k24_iVal); //일의 자리 출력
			} else if (k24_iVal >= 10 && k24_iVal < 100) { // 10~99 이면
				System.out.printf("십 %d\n", k24_iVal); //십의 자리 출력
			} else if (k24_iVal >= 100 && k24_iVal < 1000) { //100~999 이면
				System.out.printf("백 %d\n", k24_iVal); //백의 자리 출력
			} else { //모두 만족하지 않으면 
				System.out.printf("천 %d\n", k24_iVal); //천의 자리 출력
			}
		}
		
		
	}

}
