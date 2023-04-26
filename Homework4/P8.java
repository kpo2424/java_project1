package Homework4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	      while (true) {
	         try {
	            int count = Integer.parseInt(scanner.nextLine());
	            int[] array = new int[count];

	            ArrayList<Integer> list = new ArrayList<>();
	            String[] input = scanner.nextLine().split(" ");
	            for (String str : input) {
	               list.add(Integer.parseInt(str));
	            }
	            if (list.size() == count) {
	               Collections.sort(list);
	               System.out.println(list);
	            } else {
	               throw new ArrayIndexOutOfBoundsException();//Exception으로 날린다 
	            }

	         } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("error");

	         }

	     }
	      
	      

	   }

	}