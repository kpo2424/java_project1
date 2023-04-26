package homework;

import java.util.Scanner;

public class P14 { //관사 판별

	public static void main(String[] args) {
		//문장 입력 받기
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		
		//단어 'a' 찾고 몇 번째 인덱스에 있는지 저장
		String[] words = sentence.split(" "); //공백을 기준으로 자르기
		
		int[] aWords = new int [words.length]; //a와 일치하면 인덱스를 저장할 배열 
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a")) {
				aWords[count] = i; //'a'와 일치하는 단어의 인덱스 기록
				count++;
			}
		}  //System.out.println(count);
		 
		//'a'인덱스+1의 단어중 첫번째 알파벳 찾기 
        for (int i = 0; i < count; i++) { //a의 인덱스 전까지 반복 
            int index = aWords[i]; //a 단어 인덱스
            String word = words[index + 1]; //a다음 인덱스의 단어 추출
            char firstLetter = word.charAt(0); //첫번쨰 단어
           // System.out.println(firstLetter);
	        //모음이면 a->an 바꾸기 
	        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
	        	 words[index] = "an"; //'a'를 'an'으로 변경
	        }
        } 
       
       
        
        
        //an 찾기 
        for (int i = 0; i < words.length; i++) {
			if (words[i].equals("an")) {
				aWords[count] = i; //'an'와 일치하는 단어의 인덱스 기록
				count++;
			}
		}  //System.out.println(count);
		 
        
		//'a'인덱스+1의 단어중 첫번째 알파벳 찾기 
        for (int i = 0; i < count; i++) { //a의 인덱스 전까지 반복 
            int index = aWords[i]; //a 단어 인덱스
            String word = words[index + 1]; //a다음 인덱스의 단어 추출
            char firstLetter = word.charAt(0); //첫번쨰 단어
            //System.out.println(firstLetter);
	        //자음이면 an->a 바꾸기 
	        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
	        	 words[index] = "an"; 
	        } else { 
	        	words[index] = "a";//'an'을 'a'로 변경
	        } break;
        }
        
        //추출 
        String newSentence = ""; //단어를 빈 문자열로 받기 
        for (int i = 0; i < words.length; i++) {
        	newSentence += words[i];
            if (i < words.length - 1) {
            	newSentence += " "; // 각 단어들 사이에 띄어쓰기 
            }
        }
        System.out.println(newSentence);

        
	}

}
