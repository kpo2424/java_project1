package ppt3;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length()); // 길이 출력 
		System.out.println(text.charAt(2)); // 2번째 문자 출력
		
		char[] c = text.toCharArray(); //  문자열 text를 문자 배열로 변환하여 char[] 변수 c에 할당합니
		System.out.println(c[0]);//c 배열의 첫 번째 요소 'H'를 출력
		
		System.out.println(text.replace("H", "h")); //text 변수에서 'H'를 'h'로 대체한 문자열 "hello,hi,"를 출력
		
		String[] t = text.split(",");//text 변수에서 ',' 구분자를 기준으로 분리한 문자열을 배열 t에 할당
		System.out.println(t[0]); //t 배열의 첫 번째 요소 "Hello"를 출력
		System.out.println(t[1]); // t 배열의 두 번째 요소 "hi"를 출력
		System.out.println(t[2]); //t 배열의 세 번째 요소 "" (빈 문자열) t의 길이가 2인데 3뽑으라고 해서 오류 
		
	}

}
