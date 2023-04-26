package Java_03;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int countP = 0;
        int countN = 0;
        int countO = 0;
        int countE = 0;
		
        while(true) { 
			int num = scanner.nextInt();
			
			if (num > 0) {
				countP++;
				if (num % 2 == 1) {
					countO++;
				} else if (num % 2 == 0) {
					countE++;
				}
			} else if (num < 0) {
				countN++;
				if (Math.abs(num) % 2 == 1) {
					countO++;
				} else if (Math.abs(num) % 2 == 0) {
					countE++;
				}
			} 
			
			System.out.println("P-" + countP + ", N-" + countN + ", O-" 
			+ countO + ", E-" + countE);
        }
	}

}
