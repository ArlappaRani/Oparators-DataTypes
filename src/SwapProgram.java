import java.util.Scanner;
public class SwapProgram {
	public static void main(String[]args)
	{
		//Taking the two inputs from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		//Swap Without taking the another variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
	}

}
