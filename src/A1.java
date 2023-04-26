import java.util.Scanner;


public class A1 {

	public static void main(String[] args) {


		for(int dan = 2; dan < 100; dan++) {
			for(int i = 2; i < 10; i++) {
			System.out.println(dan + "X" + i + "=" + (i * dan));
			}
			if(dan > 8) { // 단 수 0~7까지 8번 반복 
				break;
			}
			System.out.println();
		}
		
	
	}
}
