package Test2;
public class Settings {
	//1=1번 전역변수 선언 
	static String name = "";

	//3번 
	 public Settings() { // 파라미터 없는 생성자 
		//name = "NA"	
		 this("NA"); //생성자 NA대입 
		}
	 
	 public Settings(String name) { 
		this.name = name; 
		}


	 //1-2번 name변수에 대한 세터게터 생성 
	public static String getName() { // 받은 이름을 반환한다. (이름 외에 불필요한 정보까지 조회되지 않는다는 장점)
		return name;
	}

	public static void setName(String name) { //String형의 값을 할당받으면 객체의 필드값을 받은 값으로 초기화
		Settings.name = name;
	
	}
	
	
//	public static void showName() {
//		System.out.println("NA");
//	}
}
