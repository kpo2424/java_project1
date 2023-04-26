import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main2 implements Operation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Main2 main = new Main2();
		
		while(true) {
			String input = sc.nextLine();
			if (input.contains("bye")) { //포함 
				break;
			}
			String answer = main.chat(input);
			input = "\"" + input + "\",";//" ",
			main.writeFile(input);
			answer = "\"" + answer + "\",";
			main.writeFile(answer);
		}
	}

	
	
	@Override
	public String chat(String text) {
		// TODO Auto-generated method stub
		
		String[] question = {"happy", "hello", "old", "name", "bye"};
		String[] answer = {"it's dope, man", "hey ya", "take a guess", "it's confidential", "see ya"};
		String ret ="lol";
	
		for ( int i = 0; i < question.length; i++) { //같은 인덱스 매칭 
			if (text.contains(question[i])) {
				ret = answer[i];
				break;
			}
		}
		return ret;
	}

	@Override
	public void writeFile(String text) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C:\\test\\out.csv", true); //파일 생성 
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
