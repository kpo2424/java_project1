package practice08;

public class switchd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k24_jumin = "123456-1234567"; //변수 k24_jumin 선언 후 초기화
		
		switch(k24_jumin.charAt(7)) {//k24_i의 일곱번째 숫자 뽑아내기 (String표현은 불가능)
			case '1': //7번째 숫자가 1일때
				System.out.printf("20세기전 태어난 남자 사람\n"); //출력
				//break문 없어서 빠져 나오지 못하고 다음 case로 넘어감
				//(case에 만족해야 다음으로 넘어가는게 아니라 break안쓰면
				//무조건 다음 조건으로 넘어가서 출력됨-완전 이상한 값 나올 수 있음)
			case '2'://7번째 숫자가 2일때
				System.out.printf("20세기전 태어난 여자 사람\n");//출력
				break; //만족 시 탈출 
			case '3'://7번째 숫자가 3일때
				System.out.printf("20세기후 태어난 남자 사람\n");//출력
				break;//만족 시 탈출 
			case '4'://7번째 숫자가 4일때
				System.out.printf("20세기후 태어난 여자 사람\n");//출력
				break;//만족 시 탈출 
			default: //모든 case문과 일치하지 않을때
				System.out.printf("사람\n");//출력
				break;//만족 시 탈출 
		}
	}

}
