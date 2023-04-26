package Pratice5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {

	public static void main(String[] args) throws IOException {
		//파일을 쓰기 위한 FileWriter 객체 생성 
		FileWriter fw = new FileWriter("C:\\\\test\\\\out.txt", true);
		//true 기존 내용에 새로운 내용 추가 
		//false다시 처음부터 쓰는거 
		for (int i= 11; i < 16; i++) {
			String data = "Line #" + i +"\n";
			fw.write(data);
		}
		fw.close();//파일 닫기 
	}

}
