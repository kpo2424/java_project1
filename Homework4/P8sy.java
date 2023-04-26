package Homework4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P8sy {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	      while (true) {

	         System.out.println("Enter size of an array: ");
	         int size = scan.nextInt();

	         int[] num = new int[size];

	         int n = 0;
	         int temp = 0;
	         int error = 0;

	         System.out.println("Enter input numbers of an array(if exit, enter -1000): ");

	         while (true) {
	            try {
	               temp = scan.nextInt();
	               if (temp == -1000) {
	                  if (n == size) {
	                     break;
	                  } else {
	                     System.out.println("Not enough Input.");
	                     continue;
	                  }
	               } else {
	                  num[n] = temp;
	                  n++;
	               }
	            } catch (Exception e) {
	               System.out.println("Error");
	               error = 1;
	               break;
	            }
	         }

	         if (error == 1) {
	            continue;
	         }
	         Arrays.sort(num); //내림차순 정렬 

	         for (int i = 0; i < num.length; i++) {
	            System.out.print(num[i] + " ");
	         }
	         break;
	      }

	}

}
