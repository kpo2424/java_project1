package practice07;

public class StringEx {

	public static void main(String[] args) {

		String k24_name = "Ja" + "va"; //Java를 문자열로 선언 
		String k24_str = k24_name + "8.0"; //name변수에 8.0을 붙여서 선언
		
		System.out.println(k24_name); //name 문자형 출력
		System.out.println(k24_str); //""사용으로 문자 그대로 출력
		System.out.println(7 + " "); //7과 빈칸이 출력
		System.out.println(" " + 7); //7앞에 빈칸 출력
		System.out.println(7 + ""); //""사이에 공백이 없어서 빈칸 출력 안됨
		System.out.println("" + 7); //""사이에 공백이 없어서 빈칸 출력 안됨
		System.out.println("" + ""); //빈 문자열 출력 
		System.out.println(7 + 7 + ""); //""없이 숫자와 부호 입력시 계산됨 
		System.out.println("" + 7 + 7); //""이후 모두 문자열로 취급되어 77로 출력 
		
	}

}
