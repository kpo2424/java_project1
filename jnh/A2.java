package jnh;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  A2class a2class = new A2class(0); //A2class 객체 생성 . 초기값0
	      Scanner scanner = new Scanner(System.in);
	      int money = 0; 
//	      boolean play = true;
	      while (true) {
	         System.out.println("#Menu");
	         System.out.println("1.Deposit");
	         System.out.println("2.Withdrawal");
	         System.out.println("Balance :" + a2class.getBalance()); //a2class의 잔액 가겨옴 
	         int menu = scanner.nextInt(); //메뉴 입력 받기 

	         switch (menu) {
	         case 1:
	            money = scanner.nextInt(); //돈 입력 받기
	            a2class.deposit(money); //a2class의 deposit변수에 돈 저장 
	            a2class.nowmoney(money); //최종 잔액에 저장 
	            break;
	         case 2:
	            money = scanner.nextInt();
	            a2class.withdraw(money);//출금에 저장 
	            a2class.nowmoney(money);
	            break;
	         case 3:
	            break;

	         }

	      }

	}

}
