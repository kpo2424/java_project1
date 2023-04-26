package practice8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWrite {
	public static void FileWrite() throws IOException { //InputOutputException
		// 해당 파일 경로 지정하여 File 객체 생성
		File f_k24 = new File("C:\\Users\\이예진\\eclipse-workspace\\home10.txt");
		//출력할 데이터를 버퍼에 쌓아두었다가, 한번에 출력
		BufferedWriter bw_k24 = new BufferedWriter(new FileWriter(f_k24));
		bw_k24.write("안녕 파일\n"); // 문자열을 버퍼에 저장
		bw_k24.newLine(); //줄 바꿈
		bw_k24.write("hello 헬로\n"); // 문자열을 버퍼에 저장
		bw_k24.newLine(); //줄 바꿈

		bw_k24.close(); //파일 쓰기 종료
	}

	public static void FileRead() throws IOException { //파일 쓸 때 예외처리 필수 
		//해당 파일 경로 지정하여 File 객체 생성
		File f_k24 = new File("C:\\\\Users\\\\이예진\\\\eclipse-workspace\\\\home10.txt");
		BufferedReader br_k24 = new BufferedReader(new FileReader(f_k24)); //BufferedReader 객체 생성
		String readtxt_k24; //문자열 저장할 변수

		while ((readtxt_k24 = br_k24.readLine()) != null) {//파일 내용 읽을때 null이 아닐때까지 반복
			System.out.printf("%s\n", readtxt_k24);//출력
		}
		br_k24.close();//파일 읽기 닫기
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWrite();//파일 쓰기
		FileRead();//파일 읽기
	}
}
