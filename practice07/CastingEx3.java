package practice07;

public class CastingEx3 {

	public static void main(String[] args) {

		float k24_f = 9.234567f; //실수형 변수 k24_f에 9.234567f 값 저장 
		double k24_d = 9.1234567; //실수형 변수 k24_f에 9.1234567 값 저장 
		double k24_d2 = (double)k24_f; //float형을 double형으로 변환해 k24_d2에 저장
		
		//소수점 이하 18자리까지 실수형 출력, 총 자리수 20자리
		System.out.printf("f = %20.18f\n", k24_f);
		//소수점 이하 18자리까지 실수형 출력, 총 자리수 20자리
		System.out.printf("d = %20.18f\n", k24_d);
		//소수점 이하 18자리까지 실수형 출력, 총 자리수 20자리
		System.out.printf("d2 = %20.18f\n", k24_d2);
		
		
	}

}
