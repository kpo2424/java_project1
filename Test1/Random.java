package Test1;

public class Random {
	// 1번 - int형 final 전역변수를 2개 선언함
    final static int ONETIME = 0;
    final static int RANDOM = 1;
    

	// 2번 - 다른 클래스에서는 접근 불가능한 getRandomNumber() 함수를 선언하고, 파라미터로 1번의 변수를 받고, return data type은 int형임
	protected static int getRandomNumber(int type) {
	    // 3번 - 2번에서 만든 함수의 내용
	    if (type == ONETIME) {
	        return (int) (Math.random() * 100);
	    } else if (type == RANDOM) {
	        int sum = 0;
	        int count = 0;
	        while (sum < 100) {
	            int num = (int) (Math.random() * 100);
	            sum += num;
	            count++;
	        }
	        return count;
	    } else {
	        return -1;
	    }
	}
	

	
	
	
	// 6번 - 객체 생성없이도 접근 가능한 isEvenNumber() 함수를 선언하고 파라미터는 int형, return value는 없음
	public static void isEvenNumber(int num) {
	    // 7번 - 6번에서 만든 함수의 내용
	    if (num % 2 == 0) {
	        System.out.println(num + " is even number");
	    } else {
	        System.out.println(num + " is odd number");
	    }
	}
	
	
}