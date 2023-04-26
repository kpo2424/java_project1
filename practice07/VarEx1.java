package practice07;

public class VarEx1 {

	public static void main(String[] args) {

		int k24_year = 0; //k24_year라는 변수를 선언하고 0으로 초기화 
		int k24_age = 14; //k24_age라는 변수를 선언하고 14로 초기화 
		
		System.out.println("결과1 : " + k24_year); //k24_year 변수 출력
		System.out.println("결과2 : " + k24_age); //k24_age 변수 출력
		
		k24_year = k24_age + 2000; //변수 k24_age에 2000 더한 값 k24_year에 저장
		k24_age = k24_age + 1;//변수 k24_age에 1 더한 값 k24_age에 저장
		
		System.out.println("결과3 : " + k24_year); //계산한 k24_year 값 출력
		System.out.println("결과4 : " + k24_age);//계산한 k24_age 값 출력
	}

}
