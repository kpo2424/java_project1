import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number);
		
		int i = 0;
		while(i < number) {
			for (int j = 0; j < i; j++) { // * 앞 공백 출력 
				System.out.print(" ");
			} for (int k = (number*2-1); k >= (i*2)+1; k--) {
				System.out.print("*");
				}
			 System.out.println();
			 i++;
		} 
					
	}	
}


