package practice07;

public class PrintfEx1 {

	public static void main(String[] args) {

		  byte k24_b = 1; //정수형 변수 k24_b 선언 후 1로 초기화
	      short k24_s = 2; //정수형 변수 k24_s 선언 후 2로 초기화
	      char k24_c = 'A'; //문자형 변수 k24_c 선언 후 A로 초기화 
	      
	      int k24_finger = 10; //정수형 변수 k24_finger 선언 후 10으로 초기화
	      long k24_big = 100000000000L; //정수형 변수 10진수로 출력
	      long k24_hex = 0xFFFFFFFFFFFFFFFFL; //정수형 변수 16진수로 출력
	      
	      int k24_octNum = 010; //8진수 10을 저장하는 정수형 변수
	      int k24_hexNum = 0x10; //16진수 10을 저장하는 정수형 변수
	      int k24_binNum = 0b10; //2진수 10을 저장하는 정수형 변수
	      
	      System.out.printf("b=%d%n", k24_b); //%d는 10진수로 출력
	      System.out.printf("s=%d%n", k24_s); //%d는 10진수로 출력
	      //%c는 문자로 출력,(int)k24_c 정수형으로 바꾼후 출력
	      System.out.printf("c=%c, %d %n", k24_c, (int)k24_c);
	      //전체 5자리를 사용해 오른쪽 정렬로 출력
	      System.out.printf("finger=[%5d]%n", k24_finger);
	      //전체 5자리를 사용해 왼쪽 정렬로 출력
	      System.out.printf("finger=[%-5d]%n", k24_finger);
	      //전체 5자리를 사용해 0으로 채워 오른쪽 정렬로 출력
	      System.out.printf("finger=[%05d]%n", k24_finger);
	      System.out.printf("big=%d%n", k24_big);//%d는 10진수로 출력
	      //16진수로 출력, 앞에 0x(#)를 붙여 출력
	      System.out.printf("hex=%#x%n", k24_hex);
	      System.out.printf("octNum=%o, %d%n", k24_octNum, k24_octNum); //8진수로 출력
	      System.out.printf("hexNum=%x, %d%n", k24_hexNum, k24_hexNum); //16진수로 출력
	      //%s는 2진수로 출력.정수값을 2진수로 변환한 결과를 문자열로 반환 
	      System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(k24_binNum), k24_binNum);
	      
	}
}
