package java1;

import java.util.Scanner;

public class A4_ifSwitch {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요(일의 자리수): ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) { 
            switch (num) {
                case 2:
                    System.out.println("입력한 숫자는 짝수입니다.");
                    break;
                case 4:
                    System.out.println("입력한 숫자는 짝수입니다.");
                    break;
                case 6:
                    System.out.println("입력한 숫자는 짝수입니다.");
                    break;
                case 8:
                    System.out.println("입력한 숫자는 짝수입니다.");
                    break;
                    
                default:
                    System.out.println("다시 입력하세요.");
            }
        } else {
            switch (num) {
            case 1:
                System.out.println("입력한 숫자는 홀수입니다.");
                break;
            case 3:
                System.out.println("입력한 숫자는 홀수입니다.");
                break;
            case 5:
                System.out.println("입력한 숫자는 홀수입니다.");
                break;
            case 7:
                System.out.println("입력한 숫자는 홀수입니다.");
                break;
            case 9:
                System.out.println("입력한 숫자는 홀수입니다.");
                break; 
                
            default:
                System.out.println("다시 입력하세요.");
            }
        }

	}
}
