package practice07;

public class OverflowEx { //데이터 타입

	public static void main(String[] args) {

		short k24_sMin = -32768; //정수형 변수 short의 최소값 -32768 저장
		short k24_sMax = 32767; //정수형 변수 short의 최대값 32767 저장
		char k24_cMin = 0; //문자형 변수 char의 최소값 0 저장
		char k24_cMax = 65535; //문자형 정수 char의 최대값 65535 저장
		
		System.out.println("sMin = " + k24_sMin); //정수형 출력
		System.out.println("sMin-1 = " + (short)(k24_sMin-1)); //short의 크기를 초과하여 오버플로우됨
		System.out.println("sMix = " + k24_sMax); //정수형 출력
		System.out.println("sMax-1 = " + (short)(k24_sMax+1));//short의 크기를 초과하여 오버플로우됨
		System.out.println("cMin = " + (int)k24_cMin); //문자열을 정수형으로 반환하여 출력
		System.out.println("cMin-1 = " + (int)--k24_cMin); //char의 크기를 초과하여 오버플로우됨
		System.out.println("cMax = " + (int)k24_cMax); //문자열을 정수형으로 반환하여 출력
		System.out.println("cMax-1 = " + (int)++k24_cMax); //char의 크기를 초과하여 오버플로우됨
		
	}
}
