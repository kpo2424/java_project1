package Java_04;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("#Menu");
			System.out.println("1.Encryption");
			System.out.println("2.Decryption");
	
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice == 1) {
				char alpha = 'a'; // 알파벳 a
				String words = sc.next();
				System.out.print("Result : ");
				for (int i = 0; i < words.length(); i++) {
					char ch = words.charAt(i); //단어 하나로 저장 scool
					if (ch >= 'a' && ch <= 'z') {
						ch++; //a->b
						char newWords = ch;
						System.out.print(newWords);
					}
				}System.out.println();
			} else if (choice == 2) {
				char alpha = 'a'; // 알파벳 a
				String words = sc.next();
				System.out.print("Result : ");
				for (int i = 0; i < words.length(); i++) {
					char ch = words.charAt(i); //단어 하나로 저장 scool
					if (ch >= 'a' && ch <= 'z') {
						ch--; //b->a
						char newWords = ch;
						System.out.print(newWords);
					}
				}System.out.println();
			}
		}
	}
}
