package practice07;

public class CastingEx1 {

	public static void main(String[] args) {

		//실수형 변수 k24_d 선언 후 값 저장
		double k24_d = 85.4; 
		//정수형 변수 k24_score 선언 후 실수형 변수 k24_d를 정수형으로 변환 후 저장
		int k24_score = (int)k24_d; 
		
		
		System.out.println("score=" + k24_score);//정수형 출력
		System.out.println("d=" + k24_d);//실수형 출력 
	}
}
