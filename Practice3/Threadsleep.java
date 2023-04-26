package Practice3;

public class Threadsleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] checkDup = new boolean[45]; //배열의 크기 45
		for (int i = 0; i < checkDup.length; i++) {
			checkDup[i] = false;
		}
		
		for (int i = 0; i < 6; i++) {//6개 숫자 출력 
			while(true) {
				try {
					int n = getNumber();
					if (checkDup[n -1] == false) {
						//Thread.sleep(1000); // 1초 동안 스레드를 멈춤
						System.out.println(n);
						checkDup[n -1] = true;
						break;
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static int getNumber() {
		int ret = 0;
		int n = (int)(Math.random() * 46); //0나오면 예외처리 
		ret = n;
		return ret;
	}
	
}
