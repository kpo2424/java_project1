package practice08;

public class sin {

	public static void main(String[] args) {
		//-1일때 부터 50까지 출력되게
		//-1일땐 빈캄 안찍힘
		
		double k24_fSin; //k24_fSin 실수형 변수로 선언
		for (int k24_i = 0; k24_i <360; k24_i++) { //변수 k24_i 0에서 359도까지 360번 반복 
			k24_fSin = Math.sin(k24_i * 3.141592/180);//각도에 대한 사인값 k24_fSin을 계산 
			System.out.printf("%d sin ==> %f\n", k24_i, k24_fSin); //포맷팅 후 출력
		}
		for (int k24_i = 0; k24_i < 360; k24_i++) { //변수 k24_i 0에서 359도까지 360번 반복 
			k24_fSin = Math.sin(k24_i * 3.141592/180);//각도에 대한 사인값 k24_fSin을 계산 
			
			//빈칸 출력하여 그래프 만들기 
			//사인값(-1~1) 계산//+1을 해서 0~2까지. *50배 확대하여 k24_iSpace에 저장
			int k24_iSpace = (int) ((1.0 + k24_fSin) * 50) ; 
			for (int k24_j = 0; k24_j < k24_iSpace; k24_j++) {//변수 k24_j 0에서 k24_iSpace까지 반복 
				System.out.printf(" "); //칸 띄우기
			}
			System.out.printf("*[%f][%d]\n", k24_fSin, k24_iSpace);//sin값과 빈칸 갯수 출력
		}
		
	}

}
