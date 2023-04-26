package practice07;

public class CastingEx2 {

	public static void main(String[] args) {

		int k24_i = 10; //정수형 변수 k24_i 선언 후 10으로 초기화
		byte k24_b = (byte)k24_i; //int을 byte로 형변환하여 k24_b에 저장
		System.out.printf("[int -> byte] i = %d -> b = %d\n", k24_i, k24_b); //정수형 출력
		
		//byte : -128 ~ 127 값 나타냄 
		k24_i = 300; //정수형(int) 변수 k24_i에 300 저장 
		k24_b = (byte)k24_i; //k24_i는 300으로 byte로 형변환시 오버플로우됨
		System.out.printf("[int -> byte] i = %d -> b = %d\n", k24_i, k24_b);//정수형 출력
		
		k24_b = 10; //정수형(byte) 변수 k24_b에 10 저장 
		k24_i = (int)k24_b; //int로 형변환한 값을 k24_i에 저장 (오버플로우 안됨)
		System.out.printf("[byte -> int] b = %d -> i = %d\n", k24_b, k24_i);//정수형 출력
		
		k24_b = -2; //정수형(byte) 변수 k24_b에 -2 저장 
		k24_i = (int)k24_b; //int로 형변환한 값을 k24_i에 저장 (오버플로우 안됨)
		System.out.printf("[byte -> int] b = %d -> i = %d\n", k24_b, k24_i);//정수형 출력
		
		//정수형 값을 이진수 문자열로 변환
		System.out.println("i="+Integer.toBinaryString(k24_i));
		
	}
}
