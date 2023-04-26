package Practice;

public class Parents {
	int age;
	
	//getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Parents() { //인자가 없을때 이 함수랑 매칭됨 
		this(20); // () 생성자임 
	}
	
	
	public Parents(int age) {
		//age = age;
		this.age = age; //전역변수의 age . this는 내꺼 부르는거
	}
	
	public void showName() {
		System.out.println("I am a parent");
	}
	
	public void showAge() {
		System.out.println("I am "+ age + "years old.");
	}
}
