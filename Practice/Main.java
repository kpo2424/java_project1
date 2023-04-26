package Practice;


public class Main extends Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*showName(); implements InterfacePractice
		showName("did");//오버로드
		*/
		
//		showAge();
//		showAge(30);
//		
//		
//	}
	
//	public static void showAge() {
//		System.out.println("20살");
//	}
//	public static void showAge(int age) { //인자로 받아서 쓰기 
//		System.out.println(age + "살");*/
		
//	}
//	Main main = new Main(); // 스태틱 아니면 new 객체 만들어줘야 호출이 됨 
//	main.showName();
//	main.shownAge();
//	
//	@Override
//	public void showName() {
//		// TODO Auto-generated method stub
//		System.out.println("나");
//	}
//
//	@Override
//	public void shownAge() {
//		// TODO Auto-generated method stub
//		System.out.println("비밀");
		
		/*Main main = new Main(); // static 아니면 new 객체 만들어줘야 호출이 됨 
		main.showName();
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		super.showName(); //부모의 쇼네임을 불러서 쓴다 
		System.out.println("I am a child"); //알파로 내거 구현하고 싶을때
	}*/
		Parents p = new Parents(); //갹채 처음에 생성할때 (생성자)안에 나이 넣기 
		p.showAge();
		p.setAge(30);
		p.showAge();
		
		
	}
}
