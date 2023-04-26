package Test1;

public class Main extends Random{
	// 1번 - int형 final 전역변수를 2개 선언함
    final static int EVENNUMBER = 0;
    final static int ODDNUMBER = 1;
    
	// 4번 - main() 함수에서는 getRandomNumber()를 호출 후, return 값을 출력함
		public static void main(String[] args) {
			
			
			
		    int oneTimeNum = Random.getRandomNumber(Random.ONETIME);
		    int randomNum = Random.getRandomNumber(Random.RANDOM);
		    System.out.println("One-time random number: " + oneTimeNum);
		    System.out.println("Random sum count: " + randomNum);
		    
		    // 8번 - main()에서 6번 함수의 인자를 7을 넣고 호출함
		    Random.isEvenNumber(7);
		}

}
