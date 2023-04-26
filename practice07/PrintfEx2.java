package practice07;

public class PrintfEx2 {

	public static void main(String[] args) {

			  String k24_url = "www.codechobo.com"; //문자열로 웹주소 선언 후 저장
	    	      
	    	  float k24_f1 =  .10f; //실수형 변수 선언, 0.01 저장
	    	  float k24_f2 = 1e1f; //지수형태 변수 선언, 1 x 10^1 = 10.0 저장
	    	  float k24_f3 = 3.14e3f; //지수형태 변수 선언, 3.14 x 10^3 = 3140.0 저장
	    	  double k24_d = 1.23456789; // 실수형 변수 선언, 값 저장
	    	   
	    	  //%f는 실수형때 출력, %e는 지수형태 출력, %g는 %f와 %e 중 적절한 형식 출력 
	    	  System.out.printf("f1=%f, %e, %g%n", k24_f1, k24_f1, k24_f1);
	    	  //%f는 실수형때 출력, %e는 지수형태 출력, %g는 %f와 %e 중 적절한 형식 출력 
	    	  System.out.printf("f2=%f, %e, %g%n", k24_f2, k24_f2, k24_f2);
	    	  //%f는 실수형때 출력, %e는 지수형태 출력, %g는 %f와 %e 중 적절한 형식 출력 
	    	  System.out.printf("f3=%f, %e, %g%n", k24_f3, k24_f3, k24_f3);
	    	      
	    	  System.out.printf("d=%f%n", k24_d); //실수형 출력
	    	  System.out.printf("d=%14.10f%n", k24_d);//총 14자리 중 소주점 아래 10자리 출력
	    	      
	    	  
	    	  System.out.printf("[12345678901234567890]%n"); //출력
	    	  System.out.printf("[%s]%n", k24_url); //문자열 출력
	    	  System.out.printf("[%20s]%n", k24_url); //왼쪽 정렬로 20자리 출력
	    	  System.out.printf("[%-20s]%n", k24_url); //오른쪽 정렬로 20자리 출력
	    	  System.out.printf("[%8s]%n", k24_url); //8자리 출력이지만 초과시 문자열 길이만큼 모두 출력
	    	      
	}
}


