package Pratice5;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.FileWriter;
public class Main {

	public static void main(String[] args) throws IOException {

		//파일 만들기
		FileOutputStream output = new FileOutputStream("C:\\test\\out.txt");
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}


