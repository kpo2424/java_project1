package Practice3;
import java.util.Scanner;
import java.util.HashSet;

public class Hashet {//중복 미허용 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);*/
		
		HashSet<Integer> num = new HashSet<Integer>();//HashSet 클래스를 사용하여 Integer 타입의 객체를 저장하는 num 변수
		Scanner scanner = new Scanner(System.in);
		while (true) {
		num.add(scanner.nextInt());
		System.out.println(num);
		}
//		num.add(3);
//		System.out.println(num);
//		num.add(2);
//		System.out.println(num);
//		num.add(3);
//		System.out.println(num); //중복 허용하지 않아서 1,2만 남음 
		
		
	}

}
