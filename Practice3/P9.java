package Practice3;
import java.util.*;
import java.util.Scanner;
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Map<String, Integer> scores = new HashMap<>();

        // 사용자로부터 이름과 점수를 입력받아 Map에 저장
        for (int i = 0; i < 10; i++) {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();
            System.out.print("점수를 입력하세요: ");
            int score = Integer.parseInt(scanner.nextLine());
            scores.put(name, score);
        }

        // 이름을 기준으로 정렬
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        // 정렬된 결과 출력
        System.out.println("이름\t점수");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
       
        
        
  /*      // 문자열을 입력받아 배열에 저장
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");

        // 단어를 입력받아 배열에 저장
        System.out.print("단어를 입력하세요: ");
        String word = scanner.nextLine();
        String[] wordArray = {word};

        // 배열 출력
        System.out.println("문자열 배열: " + Arrays.toString(strArray));
        System.out.println("단어 배열: " + Arrays.toString(wordArray));
    */    
        
        // 문자열을 입력받아 단어 리스트에 저장
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(str.split(" ")));

        // 단어를 입력받아 개수 세기
        System.out.print("단어를 입력하세요: ");
        String word = scanner.nextLine();
        int count = 0;
        for (String w : wordList) {
            if (w.equals(word)) {
                count++;
            }
        }

        // 개수 출력
        System.out.println("입력한 단어의 개수: " + count);
	}

}
