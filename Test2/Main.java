package Test2;

import Test1.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Settings settings = new Settings(); // settings객체 생성함 
		System.out.println(settings.getName());

		Settings.setName("KOPO");
		System.out.println(settings.getName()); 
	}
	
}
