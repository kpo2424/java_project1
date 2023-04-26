package practice7;

public class MethodTest { //자기 클래스 안에 함수를 정의하면 함수명으로만 불러올 수 있음

	public static void iamMethod_k24() { //iamMethod 매소드(함수)
		System.out.printf("메소드라 불러줘요~~\n");
	}
	public static void main(String[] args) {

		//iamMethod함수 불러옴
		MethodTest.iamMethod_k24(); //클래스명.메소드명이 원칙이지만, 
		//iamMethod함수 불러옴
		iamMethod_k24(); //클래스명 생략
		
	}

}
 