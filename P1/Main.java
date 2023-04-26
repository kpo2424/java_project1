package P1;
import java.util.Scanner;

public class Main extends Fruits{ //Fruits class 가져옴 부모 메소드 그래로 사용. 오버라이딩X)
	public static Fruits apple; //Fruits 클래스의 객체로서 정적으로 선언
	public static Fruits strawberry;
	public static Fruits grape;
	public static Fruits watermelon;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메뉴 무한 출력
		//2. 메뉴값 입력 받으면 해당 과일의 종류와 가격을 출력
		//*Fruits 클래스 활용
//		Main main = new Main(); //객체 처음에 생성할때 (생성자)안에 나이 넣기 
//		main.FruitsPrice();
		
		initialization();//프로그램 실행 초기에 필요한 변수, 객체 또는 자원을 초기화하는 메소드
		//1-4맞으면 계속 진행 
		while(true) {
			int num = showMenu(); // 메뉴함수 프린트 후 받은 숫자에 할당 
			showInformation(num); // 숫자에 따른 가격 출력 
			if (num == 5) {
				break;
			}
		}
		
	}
	
	//가격 초기값 설정 
	public static void initialization() { //static은 객체 생성없이 호출 가능  (초기값 설정 함수)
		apple = new Fruits(1000, "apple"); //new로 호출 
		strawberry = new Fruits(2000, "strawberry");
		grape = new Fruits(3000, "grape");
		watermelon = new Fruits(5000, "watermelon");
	}
	
	public static void showInformation(int num) {
		if (num == 1) {
			System.out.println(apple.getName()+","+apple.getPrice()); //맨 처음에서 정적 선언 해줘서 접근(호출)가능 
		} else if (num == 2) {
			System.out.println(strawberry.getName()+","+strawberry.getPrice());
		}else if (num == 3) {
			System.out.println(grape.getName()+","+grape.getPrice());
		}else if (num == 4) {
			System.out.println(watermelon.getName()+","+watermelon.getPrice());
		}else if (num == 5) {
			System.out.println("Bye bye!");
		}else {
			System.out.println("Error");
		}
		
	}

	public static int showMenu() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Price");
	      System.out.println("1.apple");
	      System.out.println("2.strawberry");
	      System.out.println("3.grape");
	      System.out.println("4.watermelon");
	      int num =scanner.nextInt();
	      return num;
	}
	
	
	
		
	}
