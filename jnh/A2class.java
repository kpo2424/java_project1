package jnh;

public class A2class {


	   int balance = 0;

	   public A2class(int balance) {

	      this.balance = balance;

	   }

	   public int deposit(int money) {
	      this.balance = this.balance + money;
	      return balance;
	   }

	   public int withdraw(int money) {
	      this.balance = this.balance - money; //출금시 
	      return balance;

	   }

	   public int nowmoney(int money) {
	      return balance;
	   }

	   
	   
	   public int getBalance() { //발란스만 바뀌는 값임
	      return balance;
	   }

	   public void setBalance(int balance) { // 거래 후 바뀌는 값 저장해줌 
	      this.balance = balance;
	   }

}
