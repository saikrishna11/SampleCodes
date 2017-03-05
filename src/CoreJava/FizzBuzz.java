package CoreJava;

//Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz

public class FizzBuzz {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++){
			if((i%3==0) && (i%5==0)){
				System.out.println("fizzbuzz");
				count++;
			}
			else if(i%5==0){
				System.out.println("buzz");
			}
			else if(i%3==0){
				System.out.println("fizz");
			}
			else System.out.println(i);
		}
		System.out.println(count);

	}

}
