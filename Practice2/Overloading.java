package Practice2;

public class Overloading { //함수명은 같으나 구조를 다르게 하는 것 

	public static void main(String[] args) {
		print("hello?");
		print(1, 3);
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static void print(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
}
