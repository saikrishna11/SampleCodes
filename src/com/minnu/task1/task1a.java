package com.minnu.task1;

import java.util.Scanner;

public class task1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius(r): ");
		int n = sc.nextInt();
		//System.out.println(n);
		perimeterofCircle(n);		
	}

	private static void perimeterofCircle(int r) 
	{
		System.out.println("Perimeter of the circle is: "+2*Math.PI*r);		
	}

}
