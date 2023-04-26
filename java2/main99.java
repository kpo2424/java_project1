import java.util.Scanner;

public class main99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int i = 0;
//		int dan = 0;
//		for(dan = 2; dan < 10; dan++) {
//			for(i = 2; i < 10; i++) {
//			System.out.println(dan + "X" + i + "=" + (i * dan));
//			}
//			System.out.println();
//		}
		
		
		int i = 0;
		int dan = 0;
		for(dan = 2; dan < 10; dan++) {
			
			for(i = 2; i < 10; i++) {
					System.out.print(dan + " X " + i + " = " + (i * dan) + "\t");
					System.out.println((dan+1) + " X " + i + " = " + (i * (dan+1)));
			}
			dan++; // 2 4 6 8
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
