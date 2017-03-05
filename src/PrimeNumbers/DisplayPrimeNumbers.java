package PrimeNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'N': ");
		int N = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of 'i': ");
		int i = sc1.nextInt();
				
		int a= (i-1);
		int b = (2*a)+1;
		
		int count = 0;

		
		int[] p = new int[i];
		
		for(int j=2;j<N;j++)
		{
			if (isPrime(j)) 
			{
                //System.out.print (j + " ");
				count++;                
            }
		}
		//System.out.println();
		//System.out.println("The prime numbers between 1 and "+N +" is : "+count);
		
		for(int k=i;k<=10;k--)
		{
			p[k]=b;
			
			//if(isPrime(p[k]))
			//{
				System.out.println(p.toString());
			//}
			//System.out.println(Arrays.toString(p));
			
			//System.out.println(b);
			//System.out.println(i);
			//System.out.println("P"+i +" = " +2* );
		}
		
	}

	private static boolean isPrime(int x) 
	{
		for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
            	//System.out.print(i);
                return false;
            }
        }
		return true;
	}

	
}
