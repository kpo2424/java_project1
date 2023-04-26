package Pratice4;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {5, 10, 12};
		System.out.println(1); //1
		try {
			System.out.println(numbers[3]); //2
		} catch (Exception e) { //3(nok) // 모든 exception을 포함함 
			System.out.println("exception");
			e.printStackTrace(); //오류 내용 캐치하기 위해 씀 
			System.out.println("finally");
		}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("dsfs");
//		}
		System.out.println(9);
		//System.out.println((numbers[3]));
	}
}
