package Test3;
import java.util.Scanner;


public class Main implements Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		Main main = new Main();
		while (true) {
			int n = main.getRandom();
			boolean check = main.isValid(n);
			if (check == true) {
				System.out.println(n);
				cnt++;
			}
			if (cnt == 6) {
				break;
			}
			
		}
	}	
	
	//Random함수의 인터페이스 함수들(getRandom,isValid)을 오버라이드 
	@Override
	public int getRandom() {//1이상의 양의 정수값 리턴 
		int ret = 0;
		
		while(true) {
			int n = (int)(Math.random()*100); //0.0~1.0미만의 난수 생성 *100=0~99까지 정수 저장 
			if(n>0) {
				ret = n;
				break;
			}
		}
		return 0;
	}


	@Override
	public boolean isValid(int num) {//1~45숫자일때 true 리턴 
		// TODO Auto-generated method stub

			boolean ret = false;
			if (num >= 1 && num <= 45) {
			return false;
			}
			return ret;
	}
}

