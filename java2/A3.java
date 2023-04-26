import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number);
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) { // j가 i번 수행 
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		int i = 0;
//		while (i < number) {
//		    int j = 0;
//		    while (j <= i) {
//		        System.out.print("*");
//		        j++;
//		    }
//		    System.out.println();
//		    i++;
//		}

		
		
	}

}
