package ppt3;

import java.math.BigDecimal;

public class numericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "-31.51231212312312123123153425157";
		System.out.println(text);
		System.out.println(Float.parseFloat(text)); //문자열을 Float형으로 변환하는 메소드
		System.out.println(Double.parseDouble(text)); //문자열을 double형으로 변환하는 메소드 
		Double d = Double.parseDouble(text);
		System.out.println(d);
		
		System.out.println(d.intValue()); // int형으로 반환 
		BigDecimal bd = new BigDecimal(text); //long보다 큰 big함수 불러와서 더 길게 저장 
		System.out.println(bd);
		System.out.println(Math.round(d)); //반올림 반환타입이 long이라서 .0이 출력 안됨 
		System.out.println(Math.floor(d)); //올림
		System.out.println(Math.ceil(d)); // 내림
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);
		
		
		
	}

}
 