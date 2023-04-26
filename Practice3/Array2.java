package Practice3;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [][] numbers = new int[3][5];
//		int cnt;
//		cnt = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//			numbers[i][j] = cnt;
//			cnt++;
//			}
//		}
//		
//		System.out.println(numbers[i]);
		//int [][] numbers = new int[2][3];
		int [][] numbers = {{1,2,3}, {4,5}};
		for (int i = 0; i < numbers.length; i++) { //행의 갯수 2. (행 0,1)
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
	}

}
