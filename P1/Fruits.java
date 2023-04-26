package P1;

public class Fruits {
	int price; //지역 변수 
	String name;
	
	public Fruits() { //초기값 
		this(0, "None");
	}
	
	public Fruits(int price, String name) { //생성자 
		this.price = price; //생성자의 가격을 객체 가격 속성에 할당함 
		this.name = name;
	}
	
//	public static void fruitsPrice() {
//		
//			
//	}
		
	
	public int getPrice() {//인스턴스(price) 변수의 값을 반환하는 메소드
		return price;
	}
	public void setPrice(int price) {//인스턴스 변수의 값을 변경하는 메소드
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}
