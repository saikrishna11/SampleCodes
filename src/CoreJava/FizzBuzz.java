package CoreJava;

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
