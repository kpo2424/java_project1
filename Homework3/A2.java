package Homework3;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
	    	String line = scanner.nextLine();
	        String word = scanner.nextLine();
	        int min = 999;
	        String lineArry1 = line.replaceAll(" ", "");
		    String wordArry1 = word.replaceAll(" ", "");
		    //문자열을 각각 배열에 할당 
		    char[] lineArry = lineArry1.toCharArray();
		    char[] wordArry = wordArry1.toCharArray();
		    
	        for (int i = 0; i < word.length(); i++) { // 단어 갯수만큼 반복 
	        	int count = 0;
	            int redundant = 0; //중복값 
	           
	           //단어 중에 각 단어가 몇개 들어가 있는지 확인(cool 중 ㅇ는 2개) 
	           for (int j = 0; j < word.length(); j++) {
	                if (word.charAt(i) == word.charAt(j)) {
	                   redundant++; 
	                }
	            }
	           
	           //문자에 단어가 몇 번 들어가는지 확인 
	           for (int h = 0; h < line.length(); h++) {
	              if (word.charAt(i) == line.charAt(h)) {
	                 count++;
	              }
	           }
	           
	           //들어가는 횟수/중복값 => 중복값 제거해줌 
	           count = count / redundant;
	           
	           //min은 단어 하나씩 확인할 때 마다 횟수 문장에 해당되는 단어 작은 갯수로 바뀜 
	           if (count < min) {
	              min = count;
	           }
	        } 
	        System.out.println(min);    
	
	    
      

	}
}
