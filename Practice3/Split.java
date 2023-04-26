package Practice3;

public class Split { //자르기 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "kim  lee  park";
		String[] names = words.split("  "); //문자열 자르는 토큰을 뭘로 할 건지 설정 
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
