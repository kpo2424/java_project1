package Java_03;

public class A3 {

	public static void main(String[] args) {
		String str = "I go to school";
		String n = str.toUpperCase(); //대문자로 저장 
        int[] count = new int[26]; //알파벳 갯수 26칸 저장 

        for (int i = 0; i < str.length(); i++) { // 문자열 길이만큼 반복 
            char ch = n.charAt(i); //i번째 있는 문자를 ch로 저장 
             if (ch >= 'A' && ch <= 'Z') { //A가 0부터 시작.count[0]이 A의 배열/ 각 공간의 숫자에 카운트 ++
                count[ch - 'A']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) { //카운트 된 것만 실행 
                System.out.println((char) (i + 'A') + " : " + count[i]); //알파벳 char로 출력 
            }
        }

	}

}
