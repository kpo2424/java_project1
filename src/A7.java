import java.util.Scanner;

public class A7 { // 최소공배수 = a*b*최대 공약수 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int gcd = 1; //최대공약수 (a==b일때 1)
	
		//최대 공약수 구하기 
		if(a > b) { 
			for (int i = 2; i <= b; i++) { //작은 수까지 나누기 
				if (a % i == 0 && b % i == 0) { //둘 다 나누어 떨어지는 수 중 큰 수만 담기 
					gcd = i;
				}
			}
		}
		else if(a < b) {
			for (int i = 2; i <= a; i++) {
				if (a % i == 0 && b % i == 0) {
					gcd = i;
				}
			}	
		} //System.out.println(gcd);
		
		
		//최소 공배수 구하기 
		int lcm= a * b / gcd;
		System.out.println(lcm);
		
	}
}
