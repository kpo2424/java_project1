package P2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Game class 객체와 초기값 선언
		Game lee = new Game("lee", 200, (float)25.1, 30); 
		Game kim = new Game("kim", 123, (float)47.1, (float)18.9);
		Game park = new Game("park", 765, 21, 42);
		
	
		lee.showIntroduction();
		kim.showIntroduction();
		park.showIntroduction();
		
	}
}
