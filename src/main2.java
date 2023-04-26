import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int i = 0;
//		for (i = 2; i < 10; i++) {
//			System.out.println(3 + "X" + i + "=" + (3 * i));
//		}
		
//		int i = 0;
//		while (i < 10) { // 0~9까지 10번 수행 
//			System.out.println(i);
//			i++;
//		}
		
		
//		for(int i = 0; i < 11; i++) { // 0~10까지 11번 수행
//			System.out.println(i);
//		}
//		
		
//		int i = 0;
//		while (i < 11) {
//			System.out.println(i);
//			++i;
//		}
		
		

//		int i = 0;
//		while (true) {
//			System.out.println(i);
//			i++;
//			if (i > 3) {
//				break;
//			}
//		}
		
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i); //3까지 찍고 나가게 
//		}
		
		
//		int i = 0;
//		do {
//			System.out.println(i); // 조건이 틀리더라도 무조건 한번 실행(출력) 
//			i++;
//		} while (i >= 2); //조건 
		
		String text = "hello?";
		if(text.equals("hello")==true) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
		
		if(text.contains("hello")) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
		
		
		
		
	}
}