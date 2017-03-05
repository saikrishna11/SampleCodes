package com.minnu.task1;

import java.util.Scanner;

public class task2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle(l): ");
		int l = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter breadth of rectangle(b): ");
		int b = sc1.nextInt();
		//System.out.println(n);
		perimeterofRectangle(l,b);	
		sc.close();
		sc1.close();
		
	}

	private static void perimeterofRectangle(int a, int b) 
	{
		System.out.println("Perimeter of the Rectangle is: "+2*(a+b));		
	}

}
