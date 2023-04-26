package practice07;

import java.util.Scanner; //Scanner를 사용하기 위해 추가 

public class ScannerEx {

   public static void main(String[] args) {

	  Scanner k24_scanner = new Scanner(System.in); //Scanner 클래스 사용, 객체 생성

      System.out.println("두자리 정수를 하나 입력해주세요."); //출력

      //문자열 변수 k24_input 선언, 사용자에게 입력값 받기
      String k24_input = k24_scanner.nextLine(); 
      //정수형 변수 k24_num 선언, 문자열 변수 k24_input을 정수형으로 변환하여 k24_num에 저장
      int k24_num = Integer.parseInt(k24_input); 

      System.out.println("입력내용:" + k24_input); //문자형 출력
      System.out.printf("num=%d%n", k24_num); //정수형 출력 
   }
}


