package practice08;

public class whilee {

	public static void main(String[] args) {

		int k24_iA, k24_iB; // 정수형 변수 k24_iA, k24_iB 선언

		k24_iA = 0; //*을 찍을 변수를 초기화. 반복문 밖에서 해줘야 A++별의 갯수가 누적됨 

		while (true) { //실행문이 참인 동안 반복 
			k24_iB = 0; //별 찍을 갯수 줄바꿈 후 초기화(A와 같을때까지 *찍어주는 로직) 
			
			while (true) { //실행문이 참인 동안 반복 
				System.out.printf("*"); //*출력

				if (k24_iA == k24_iB) //A와 B같으면 if문 빠져나옴 (별의 갯수 정해줌)
					break;
				k24_iB++; //같지 않으면 *이 1씩 증가하면서 출력 
			}
			//*찍는 반복문이 끝나면 줄바꿈 출력
			System.out.printf("\n");
			
			k24_iA++; //찍을 *갯수 1씩 증가
			if (k24_iA == 30) //*이 30개가 되면 while문 빠져나옴 
				break;
		}

	}
}
