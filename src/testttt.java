import java.util.Scanner;

public class testttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n> 0) {
			System.out.println(n*n);
		} else if (n == 0) {
			System.out.println(n);
		} else{
			System.out.println(-n);
			System.out.println(n*n*n);
		}	
	}

}
