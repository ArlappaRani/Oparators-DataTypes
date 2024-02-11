package takeuserinputs;
import java.util.Scanner;
public class TakingInputsFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//taking the inputs using scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		byte a=scan.nextByte();//storing user input
		short b=scan.nextShort();
		int c=scan.nextInt();
		long d=scan.nextInt();
		System.out.println("The inputs are:"+a+" "+b+" "+c+" "+d+" ");
        System.out.println("enter the decimal values");
        float e=scan.nextFloat();
        double f=scan.nextDouble();
        System.out.println("The user inputs are:"+e+" "+f+" ");
        System.out.println("Enter the characters");
        char g=scan.next().charAt(0);
        System.out.println("The user input is:"+g);
        System.out.println("Enter the full name");
        String s2=scan.nextLine();
        System.out.println("The full name is"+s2);
        System.out.println("Enter the names");
        String s1=scan.next();
        System.out.println("The first name is"+s1);

	}

}
