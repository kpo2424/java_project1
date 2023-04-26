package Pratice5;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("C:\\test");
		File files[] = dir.listFiles(); //파일 목록을 File 배열로 반환 후 이를 []배열에 저장 
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]); 
		}

	}
}
