package CoreJava;

import java.util.Scanner;

//Write a program to reverse a string without using reverse keyword

public class StringReversewithoutKeyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String input = sc.next();
	    char[] temparray= input.toCharArray();
	    int left,right=0;
	    right=temparray.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temparray[left];
	     temparray[left] = temparray[right];
	     temparray[right]=temp;
	    }
	    System.out.println("Reversed String is : ");
	    for (char c : temparray)
	     System.out.print(c);    
	}

}
