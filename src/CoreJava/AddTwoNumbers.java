package CoreJava;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		int sum =a+b;
		System.out.println("The sum of a = " +a +" and b = " +b +" is: "+sum);
	}
}
