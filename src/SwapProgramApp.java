import java.util.Scanner;
public class SwapProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taking two user inputs and storing in a variables a,b
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=scan.nextInt();
		System.out.println("Enter the second Number");
		int b=scan.nextInt();
		//Taking this variable as template there is no value inside this
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b); 

	}

}
