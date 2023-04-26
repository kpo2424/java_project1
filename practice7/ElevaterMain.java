package practice7;

public class ElevaterMain {

	private static int inVal;
	public static void up() {
		inVal++;
		System.out.printf("난 그냥 메소드[%d]\n",inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inVal=0;
		Elevater elev;
		
		elev = new Elevater();
		
		up();
		for (int i = 0; i < 10;i++) {
			elev.up();
			System.out.printf("MSG[%s]\n", elev.help);
		}
		
		for(int i=0;i<10;i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.help);
		}
	}

}
