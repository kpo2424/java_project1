package Java_04;
	
public class A2Class {

	int balance = 0;

	public A2Class() { //초기값 
		this(0);
	}
	
	public A2Class(int money) { //생성자 
		this.balance = balance; //생성자의 가격을 객체 가격 속성에 할당함 
	}

	
	public int deposit(int money) {
		this.balance = this.balance + money;
		return balance;
		
	} 
	
	public int withdrawal (int money) {
		this.balance = this.balance - money;
		return balance;
	} 
	

	
	
	public int getBalance() {//발란스만 바뀌는 값임
		return balance;
	}

	public void setBalance(int balance) {// 거래 후 바뀌는 값 저장해줌 
		this.balance = balance;
	}
	


	
	
	
}

