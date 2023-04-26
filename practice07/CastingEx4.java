package practice07;

public class CastingEx4 {

	public static void main(String[] args) {

		//float 7자리의 유효 숫자 가짐 
		int k24_i = 91234567; //8자리 10진수를 정수형으로 저장
		float k24_f = (float) k24_i; //정수형 k24_i를 실수형으로 변환 (오버플로우)
		int k24_i2 = (int) k24_f; //float을 int형으로 변환

		//double 15-16자리의 유효 숫자 가짐 
		double k24_d = (double) k24_i; //int형을 double형으로 변환 91234567.0 
		int k24_i3 = (int) k24_d; //double형을 int형으로 변환 91234567

		float k24_f2 = 1.666f; //실수형 변수 k24_f2에 1.666f 저장 1.6660000085830688
		int k24_i4 = (int) k24_f2; //float를 int형으로 변환 후 저장 1

		System.out.printf("i=%d\n", k24_i);//int형 출력 
		System.out.printf("f=%f i2=%d\n", k24_f, k24_i2); //float k24_f, int k24_i2 출력 
		System.out.printf("d=%f i3=%d\n", k24_d, k24_i3); //double k24_d , int k24_i3
		System.out.printf("(int)%f=%d\n", k24_f2, k24_i4); //float k24_f2, int k24_i4 
	}

}
