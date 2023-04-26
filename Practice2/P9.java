package Practice2;
//import java.util.Scanner;
public class P9 {

//	static int a = 1;
//	static int b = 2;
//	static int n = 5;
//
//	
//	public void printInteger() { // 메소드 
//		//System.out.println(this.n);
//	}
//	
//	public void printAdd() {
//		staticint sum;
//		sum = this.a + this.b;
//		
//	}
	
	public static void main(String[] args) {
		
//		PrintClass printClass = new PrintClass(1, 2, 5); //PrintClass라는 객체를 생성 
//		printClass.printClassInteger();
//		printClass.printClassAdd();
		
		
//		InnerClass inner = new InnerClass();
//		System.out.println(inner.n);
//		inner.printAdd(); //inner변수에 저장된 printAdd()메소드 호출 
//		System.out.println(inner.sum);
		
		 PrintClass.a = 1;
		 PrintClass.b = 2;
		 PrintClass.n = 5;

		 PrintClass.printInteger(); // Output: n
		 PrintClass.printAdd(); // Output: sum
		
	}
}

class PrintClass { 
	static int a, b, n;
	
//	public PrintClass(int a, int b, int n) { //생성자 
//		
//		this.a = a;
//		this.b = b;
//		this. n = n;
//	}
	
	public static void printInteger() { // 메소드(함수)
		System.out.println(n);
	}
	
	public static void printAdd() {
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
}