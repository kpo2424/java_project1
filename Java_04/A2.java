package Java_04;
import java.util.Scanner;

public class A2 {
    // Banking 클래스의 객체로서 정적으로 선언
    static A2Class banking = new A2Class(0); // 초기값 지정 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = showMenu(); // 메뉴함수 프린트 후 받은 숫자에 할당 
            bankingSystem(num); // 숫자에 따른 가격 출력 
        }
    }

    public static void bankingSystem(int num) { // 입출금 계산 후 최종 잔액 출력 
        Scanner scanner = new Scanner(System.in);
        if (num == 1) {
            int money = scanner.nextInt(); // 돈 입력 받기
            banking.deposit(money); // 입금함수에 돈 저장해서 계산 
        } else if (num == 2) {
            int money = scanner.nextInt();
            banking.withdrawal(money);
        }
        //System.out.println("Balance: " + banking.getBalance());
    }

    public static int showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("#Menu");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("Balance: " + banking.getBalance()); //balance=잔액(balance+money)
        int num = scanner.nextInt();
        return num;
    }
}
