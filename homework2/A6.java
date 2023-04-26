package homework2;
import java.util.Scanner;
public class A6 { //자음과 모음의 갯수 출력 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine().toLowerCase(); //소문자로 저장 
		
		int countC = 0;
		int countV = 0;

		
		//문장의 알파벳 저장 
        for (int i = 0; i < sentence.length(); i++) { // 문자열 길이만큼 반복 
            char ch = sentence.charAt(i); //i번째 있는 문자를 ch로 저장 
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { //a가 0부터 시작.count[0]이 a의 배열/ 각 공간의 숫자에 카운트 ++
            	 countV++; //모음일때 
            } else if (ch >= 'a' && ch <= 'z'){ //자음일때 
            	countC++;
            }
        } 
		
		//출력 
		System.out.println("Num. of Consonant : " + countC); //자음
		System.out.println("Num. of Vowels : " + countV); //모음 
		
	}
}
