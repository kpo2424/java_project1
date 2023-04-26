package Pratice5;
import java.io.File;
import java.io.IOException;
public class Fliee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//파일이 존재하는지 확인 
		File file = new File("C:\\test\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) { //존재하면 
			file.delete(); //삭제 
		}
		System.out.println(file.exists()); //파일 삭재 휴 파일 존재하는지 확인 
	}

}
