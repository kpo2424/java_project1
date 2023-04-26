package Practice3;

public class ForEachLoop {//배열이나 Iterable 인터페이스를 구현한 객체의 모든 요소를 차례로 접근할 수 있는 반복문

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"abe", "de", "fghi", "j", "kl"};
		for (String d : data) { //변수 타입명: 배열 또는  Iterable 객체
			System.out.println(d);
		}
	}

}
