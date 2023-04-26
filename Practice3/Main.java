package Practice3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main implements aaa{ //implements 자식클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		
		while(true) {
			String input = sc.nextLine();
			if (input.contains("bye")) {
				break;
			}
			String answer = main.chat(input); //chat()의 인자로 입력값 넘기고 
//			input = "\"" + input + "\",";
//			main.writeFile(input);
//			answer = "\"" + answer + "\",";
			main.writeFile(answer);//반환값은 writeFile() 인자로 넘김 
			
		}
	}

	@Override
	public String chat(String text) {
		// TODO Auto-generated method stub
		String[] question = {"asn"}; //빈칸은 초기화
		String[] answer = {};
		String ret ="";
		for (int i = 0; i < question.length; i++) {
			if (text.contains(question[i])) { //text안에 질문 포함되어 있으면 
				ret = answer[i];
				break;
			}
		}
		return ret;
	}

	@Override
	public void writeFile(String text) {
		// TODO Auto-generated method stub
		//파일을 쓰기 위한 FileWriter 객체 생성 
		try {
			FileWriter fw = new FileWriter("C:\\test\\out.csv", true);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
