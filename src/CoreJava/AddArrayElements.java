package CoreJava;

import java.util.Scanner;

//Write a program to print the sum of all the array elements in the array

public class AddArrayElements {

	public static void main(String[] args) {
		System.out.println("Enter the size of input array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements of input array: ");
		int[] array = new int[size];
		int sum = 0;
		for(int i = 0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		System.out.println("The sum of all the elements in this array is : "+sum);
	}
}
