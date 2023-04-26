package practice08;

public class calendarClean {

	public static void main(String[] args) {


//		for (int k24_i = 1; k24_i < 13; k24_i++) { //1부터 12월까지 12달 반복 
//			System.out.printf(" %d월 => ", k24_i); //달 출력
//			
//			for (int k24_j = 1; k24_j < 32; k24_j++) { //1부터 31일까지 반복
//				
//				System.out.printf("%d", k24_j); //일 출력 
//				
//				if (k24_i == 1 && k24_j == 31) break; //1월이고 31일이 되면 빠져나옴 
//				if (k24_i == 2 && k24_j == 28) break; //2월이고 28일이 되면 빠져나옴 
//				if (k24_i == 3 && k24_j == 31) break; //3월이고 31일이 되면 빠져나옴 
//				if (k24_i == 4 && k24_j == 30) break; //4월이고 30일이 되면 빠져나옴 
//				if (k24_i == 5 && k24_j == 31) break; //5월이고 31일이 되면 빠져나옴 
//				if (k24_i == 6 && k24_j == 30) break; //6월이고 30일이 되면 빠져나옴 
//				if (k24_i == 7 && k24_j == 31) break; //7월이고 31일이 되면 빠져나옴 
//				if (k24_i == 8 && k24_j == 31) break; //8월이고 31일이 되면 빠져나옴 
//				if (k24_i == 9 && k24_j == 30) break; //9월이고 30일이 되면 빠져나옴 
//				if (k24_i == 10 && k24_j == 31) break; //10월이고 31일이 되면 빠져나옴 
//				if (k24_i == 11 && k24_j == 30) break; //11월이고 30일이 되면 빠져나옴 
//				if (k24_i == 12 && k24_j == 31) break; //12월이고 31일이 되면 빠져나옴 
//				
//				System.out.print(","); //마지막 날 전까지 , 출력
//			}
//			System.out.printf(".\n"); //마지막 날 .과 개행문자 출력
//		}
		
		
//		for (int k24_i = 1; k24_i < 13; k24_i++) { //1부터 12월까지 12달 반복 
//			System.out.printf(" %d월 => ", k24_i); //달 출력
//			for (int k24_j = 1; k24_j < 32; k24_j++) { //1부터 31일까지 반복
//				
//				System.out.printf("%d,", k24_j); 
//				
//				//30일까지 있는 달
//				if (k24_i == 4 || k24_i == 6 || k24_i == 9 || k24_i == 7 || k24_i == 11) {
//					if (k24_j == 30) //30일 출력되면 탈출
//						break;
//				}
//				//28까지 있는 달
//				if (k24_i == 2) {
//					if (k24_j == 28) //28일 출력되면 탈출
//						break;
//				}
//			}
//			System.out.printf("\n"); //줄바꿈
//		}
		
		
//		for (int k24_i = 1; k24_i < 13; k24_i++) { //1부터 12월까지 12달 반복 
//			System.out.printf(" %d월 => ", k24_i); //달 출력
//			//LOOP:은 해당 for문을 식별하는데 사용
//			LOOP: for (int k24_j = 1; k24_j < 32; k24_j++) { //1부터 31일까지 반복
//				
//				System.out.printf("%d,", k24_j); //일 출력 
//				
//				switch(k24_i) { 
//					case 4: case 6: case 9: case 7: case 11: //4,6,9,7,11월이면
//						if (k24_j == 30) break LOOP; //30일이 되면 LOOP 탈출
//						break; 
//					case 2: //2월이면 
//						if (k24_j == 28) break LOOP; //28일이 되면 LOOP 탈출
//						break;
//				}
//			}
//			System.out.printf("\n"); //줄바꿈
//		}
	
		//일 수 k24_iLMD 배열에 저장
		int [] k24_iLMD = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};
		
		 
		for (int k24_i = 1; k24_i < 13; k24_i++) { //1~12월까지 반복 
			System.out.printf(" %d월 => ", k24_i); //월 출력
			for (int k24_j = 1; k24_j < 32; k24_j++) { //1부터 31일까지 반복
				System.out.printf("%d", k24_j); //일 출력
			
				if (k24_iLMD[k24_i-1] == k24_j) break; //마지막날 전까지 ,찍기위한 반복문
				System.out.printf(","); //,출력
		}
			System.out.printf(".\n"); //. 개행문자 출력 
		}
		
	}
}
