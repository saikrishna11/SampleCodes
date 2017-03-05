package CoreJava;

import java.util.Scanner;

//This class is able to print the sum of the array elements in the array

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
