package practice9;

public class calendar1 {

	public static void main(String[] args) {

		// 2023년 윤달(2/29)으로 설정
		// 일요일:0 토요일:6 6이 되면 줄바꿈
		// 1일 시작시 자기 요일만큼 빈칸.한요일에 세칸

		boolean yd_flag_k24 = true; //flag가 true이면 2월 29일(윤달) 인쇄 
		int iWeekDay_k24 = 5; // 1월1일을 금요일(5)로 시작으로 선언 

		// 달의 마지막 날 변수 iEnd_k24 선언 후 배열에 저장
		int[] iEnd_k24 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };

		// 1~12월까지 반복
		for (int month_k24 = 0; month_k24 < 12; month_k24++) {
			System.out.printf("\t%d월\t\n", month_k24 + 1); // 변수 0부터 시작하니까 +1해줌
			System.out.printf("=====================\n"); // 출력
			System.out.printf(" 일 월 화 수 목 금 토\n"); // 출력
			
			// 윤달 flag설정
			if (yd_flag_k24) { // 기본값(true)이면 2월 29일 인쇄
				iEnd_k24[1] = 29; // 1번째 배열 2월 마지막 날에 29일 저장
			} else { //false면 28일
				iEnd_k24[1] = 28; // 1번째 배열 2월 마지막 날에 28일 저장
			}

			// 새로운 달 1일 출력 전 칸 띄기
			for (int j_k24 = 0; j_k24 < iWeekDay_k24; j_k24++) {
				System.out.print("   "); // 숫자3칸
			}

			// 1~12월 반복하여 iEnd배열에서 마지막날 출력
			for (int i_k24 = 1; i_k24 <= iEnd_k24[month_k24]; i_k24++) {
				System.out.printf("%3.3s", i_k24); // 날짜 출력
				iWeekDay_k24++; // 날짜 늘어날 때마다 요일 증가
				if (iWeekDay_k24 % 7 == 0) { // 토요일이 되면
					System.out.println(); // 줄바꿈
				}
			}
			iWeekDay_k24 %= 7; // 마지막 날의 요일 계산하여 초기화
			System.out.println("\n"); // 월의 마지막 날짜 출력되면 줄바꿈

		}

	}
}
