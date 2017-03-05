package CoreJava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter the string name you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		String stringName = sc.next();
		StringBuilder newName = new StringBuilder();
		newName.append(stringName);
		newName = newName.reverse();
		for(int i=0; i<stringName.length();i++)
		System.out.print(newName.charAt(i));
	}

}
