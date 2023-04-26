package practice07;

public class VarEx2 {

	public static void main(String[] args) { //값 교환시 빈 값에 담아 교환해줌

		int k24_x = 10; //k24_x라는 변수를 선언하고 10으로 초기화 
		int k24_y = 20; //k24_y라는 변수를 선언하고 20로 초기화 
		int k24_tmp = 0; //k24_tmp라는 변수를 선언하고 0으로 초기화 
		
		System.out.println("x:" + k24_x + " y:" + k24_y); //k24_x와 k24_y 출력
		
		k24_tmp = k24_x; //빈 변수에 x값을 잠시 담아둠
		k24_x = k24_y;//변수 y를 빈값이 된 x에 저장
		k24_y = k24_tmp; //변수 x를 담은 tmp를 y에 저장 
		
		System.out.println("x:" + k24_x + " y:" + k24_y); //교환된 x와 y출력
				
		
	}

}
