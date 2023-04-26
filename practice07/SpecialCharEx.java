package practice07;

public class SpecialCharEx {

	public static void main(String[] args) {
		
		System.out.println('\''); // \' -> ' 출력 
		System.out.println("abc\t123\b456"); // \t 칸 띄기 \b 앞에 문자가 지워짐
		System.out.println('\n'); //개행문자 출력 후 개행
		System.out.println("\"Hello\""); // \" -> " 출력 
		System.out.println("c:\\"); // \뒤에 기호\가 문자로 인식됨

	}
}
