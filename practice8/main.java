package practice8;

import java.io.File;//파일 및 디렉토리 경로 나타냄
import java.io.FileReader;//파일에서 문자 단위로 데이터를 읽을 때 사용
import java.io.FileWriter;//파일에 문자 단위로 데이터를 쓸 때 사용

public class main {

	public static void main(String[] args) {

		try {
			File f_k24 = new File("C:\\Users\\이예진\\eclipse-workspace\\home9.txt"); //해당 파일 경로 지정

			FileWriter fw_k24 = new FileWriter(f_k24);//파일 쓰기 객체 생성
			
			fw_k24.write("안녕 파일\n"); //파일 안에 쓸 내용
			fw_k24.write("hello 헬로\n");
			
			fw_k24.close(); //파일 쓰기 종료
			
			FileReader fr_k24 = new FileReader(f_k24);//해당 파일 읽는 객체 생성
			
			int n_k24 = -1; //파일에서 읽은 문자 수 변수 선언
			char [] ch_k24; //문자 배열 선언
			
			while(true) { //파일 읽기 반복
				ch_k24 = new char[100]; //100바이트 이하면 한 번에 읽힘
				n_k24 = fr_k24.read(ch_k24);//파일에서 문자 읽기
				
				if(n_k24 == -1) break; //파일 끝까지 읽으면(-1) 반복문 종료
				
				for (int i_k24 = 0; i_k24 < n_k24; i_k24++) { //글자수만큼 증가하며 반복
					System.out.printf("%c", ch_k24[i_k24]); // 한글자씩 출력
				}
			}
			fr_k24.close();//파일 읽기 종료
			System.out.println("\n FILE READ END");//출력
		}catch (Exception e) { //예외 처리
			System.out.printf("나 에러[%s]\n", e);//에러시 출력 
		}
		
	}
}

