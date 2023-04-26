package homework;
import java.util.Scanner;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("방정식을 입력하세요: ");
	    String equation = sc.nextLine();
	    
	    if (equation.contains("+")) {
	    	int pos = equation.indexOf("+"); //"+"가 몇 번째 위치에 있는지
	    	int num1 = Integer.parseInt(equation.substring(0, pos)); //0~+전까지 int로 추출 
	    	int num2 = Integer.parseInt(equation.substring(pos + 1)); // +다음 단어 
	    	int result = num1 + num2;
	    	System.out.println("결과: " + result);
	    } else if (equation.contains("-")) {
	    	int pos = equation.indexOf("-");
	    	int num1 = Integer.parseInt(equation.substring(0, pos));
	    	int num2 = Integer.parseInt(equation.substring(pos + 1));
	    	int result = num1 - num2;
	    	System.out.println("결과: " + result);
	    }  else if (equation.contains("*")) {
	    	int pos = equation.indexOf("*");
	    	int num1 = Integer.parseInt(equation.substring(0, pos));
	    	int num2 = Integer.parseInt(equation.substring(pos + 1));
	    	int result = num1 * num2;
	    	System.out.println("결과: " + result);
	    } else if (equation.contains("/")) {
	    	int pos = equation.indexOf("/");
	    	int num1 = Integer.parseInt(equation.substring(0, pos));
	    	int num2 = Integer.parseInt(equation.substring(pos + 1));
	    	int result = num1 / num2;
	    	System.out.println("결과: " + result);
	    } else {
	    	System.out.println("다시 입력하세요.");
	    }
	    
	    
	}

}
