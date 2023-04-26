package Practice2;

public class Rotto {

	public static void main(String[] args) {
		
		getNumber();
	}	
	
	public static int 	getNumber() {

		int cnt = 0;
		int sum = 0;
			
		while(true) {
			int n2 = getNumber();
	
			System.out.println(n2);
			
			cnt++;
			sum = sum + n2;
			if (isValid(cnt, sum)) {
				break;
			}
		}
		return sum;	
		
			
			
	}

	//true면 종료 
	public static boolean isValid(int cnt, int sum) {
		boolean ret = false;
		int min = 48;
		int max = 238;
		
		if (cnt == 6) {
			if (sum >= min && sum <= max) {
				ret = true;
			} else {
				System.out.println("retry");
				cnt = 0;
				sum = 0;
			}
		}
		
		return ret;
	}	
	
//1~45 리턴해주는 함수 
//	public static int getNumber() {
//		double n = 0.0;
//		int n2 = 0;
//		while(true) {
//			n = Math.random();
//			n2 = (int)(n * 47);
//			if (n2 != 0) {
//				break;
//			}
//		}
//		return n2;
//	}
}





