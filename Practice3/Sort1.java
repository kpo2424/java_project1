package Practice3;

import java.util.Arrays;
import java.util.Collections;

public class Sort1 { //Arrays.sort() 정렬 오름차순 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] temp = {"lee", "kim", "john", "bill", "mike"}; //주어진 요소로 배열 초기화 
		Arrays.sort(temp); // sort(오름차순 정렬 
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("=============");
		Arrays.sort(temp, Collections.reverseOrder()); // 내림차순 정렬 
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

	
	
	
	
	
}
