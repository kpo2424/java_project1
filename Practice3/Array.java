package Practice3;

public class Array {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		String[] name = {"kim", "lee", "park"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//name의 index3번 출력
		try { // 
			
			System.out.println(name[2]); //정상 작동할때 여기서 출력. 캐치는 스킵 
		
		} catch(Exception e) {
			System.out.println("Error"); // 비정상일때 캐치 구문 출력 후 밑 코드 실행 
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
