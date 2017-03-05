package CoreJava;

import java.util.Scanner;

public class AddArrayElements {

	public static void main(String[] args) {
		System.out.println("Enter the input array: ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		for(int i = 0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		System.out.println("Total: "+sum);
	}

}
