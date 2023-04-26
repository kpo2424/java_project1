import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("#Menu");
		System.out.println("1. Coke - 340");
		System.out.println("2. Orange Juice – 500");
		System.out.println("3. Milk – 650");
		System.out.println("4. Water – 290");
		System.out.println("5. Coffee – 170");
		int number = scanner.nextInt();
		System.out.println("-> " + number);
		
		int money = 1000;
		int change = 0;
		
		if (number == 1) {
			change = money - 340;
		} else if (number == 2) {
			change = money - 500;
		} else if (number == 3) {
			change = money - 650;
		} else if (number == 4) {
			change = money - 290;
		} else if (number == 5) {
			change = money - 170;
		} 
		System.out.println("The change is " + change);

		//거스름돈 갯수  
	    int fivehundred = ((int)change % 1000) / 500;
	    int hundred = ((int)change % 500) / 100;
	    int fifteen = ((int)change % 100) / 50;
	    int ten = ((int)change % 50) / 10;

	    System.out.println("500 X " + fivehundred + " 100 X " + hundred + " 50 X " + fifteen + " 10 X " + ten);
		
		
	}

}
