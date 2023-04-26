package practice08;

public class iff {

	public static void main(String[] args) {

		int k24_il; //정수형 변수 k24_il 선언
		double k24_iD; //실수형 변수 k24_iD 선언 
		
		k24_il = 10/3; //3.3333을 정수형으로 저장 3
		k24_iD = 10/3.0; //16째자리까지 실수형으로 저장 3.333333 (.0을 찍어줘야 실수형으로 출력)
		
		if (k24_il == k24_iD) { //int k24_il와 double k24_iD가 같으면
			System.out.printf("equal\n"); //출력
		} else { //다르면
			System.out.printf("No equal[%f][%f]\n", (double)k24_il, k24_iD); //실수형 출력
		}
		
		// 10/3.0은 3.3333333... 이라서 No equal
		if (k24_iD == 3.333333) { //k24_iD가 3.333333와 같으면
			System.out.printf("equal\n"); //출력
		} else { //다르면
			System.out.printf("No equal[3.333333][%f]\n", k24_iD);//실수형 출력
		}
		
		k24_iD = (int)k24_iD; //실수형 변수를 정수형으로 저장
		if(k24_il == k24_iD) { //형 변환된 k24_iD랑 정수형 k24_il이 같으면 
			System.out.printf("equal\n"); //출력
		} else { //다르면
			System.out.printf("No equal[%f][%f]\n", (double)k24_il, k24_iD); //실수형 출력
		}
		
		System.out.printf("int로 인쇄 [%d][%f]\n", k24_il, k24_iD); //%f쓰면 정수형을 실수형 출력
		System.out.printf("double로 인쇄 [%f][%f]\n", (double)k24_il, k24_iD);//실수형 출력
		
		char k24_a = 'c'; //문자형 변수 k24_a 선언 후 c 저장 
		
		if (k24_a == 'b') System.out.printf("a는 b이다\n"); //만족하면 출력
		if (k24_a == 'c') System.out.printf("a는 c이다\n"); //만족하면 출력
		if (k24_a == 'd') System.out.printf("a는 d이다\n"); //만족하면 출력
		
		String k24_aa = "abcd"; //문자열 변수 k24_aa 선언 후 abcd저장
		
		if (k24_aa.equals("abcd")) { //문자열은 .equals()로 같은 값 찾기
			System.out.printf("aa는 abcd이다\n"); //맞으면 출력
		} else { //다르면 출력 
			System.out.printf("aa는 abcd가 아니다\n");
		}
		
		boolean k24_bb = true; //논리 연산자 변수 k24_bb에 참 저장 
		
		if (!!k24_bb) { //!! 두번은 k24_bb 그대로 나옴 
			System.out.printf("bb가 아니고 아니면 참이다\n"); //출력
		} else { //다르면 출력 
			System.out.printf("bb가 아니고 아니면 거짓이다\n");
		}
		
	}
}
