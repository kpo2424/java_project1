package Practice2;

import java.util.Scanner;


public class Final {
	public static final int Father = 1; //변수를 상수로 선언 
	public static final int Mother = 2;
	public static final int Son = 3;
	public static final int Daugther = 4;
	public static final String FathersName = "Lee";
	public static final String MothersName = "Kim";
	public static final String SonsName = "Zoo";
	public static final String DaugthersName = "Hoo";
	
	
	public static void main(String[] args) { //메소드 
		
		while(true) {
			int num = showName(); // 이름함수 프린트 후 받은 숫자에 할당 
			showInformation(num); // 숫자에 따른 이름 출력 
			if (num == 5) {
				break;
			}
		}
	}	
	
	
	
	public static void showInformation(int num) {
		if (num == Father) {
			System.out.println(FathersName);
		} else if (num == Mother) {
			System.out.println(MothersName);
		} else if (num == Son) {
			System.out.println(SonsName);
		} else if (num == Daugther) {
			System.out.println(DaugthersName);
		}
	}
	
	public static int showName() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("#Printing a Name");
	      System.out.println("1.Father");
	      System.out.println("2.Mother");
	      System.out.println("3.Son");
	      System.out.println("4.Daugther");
	      int num =scanner.nextInt();
	      return num;
	}
	
	
	
}
