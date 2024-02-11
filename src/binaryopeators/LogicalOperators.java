package binaryopeators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logical operators takes boolean inputs and returns boolean output
        //these are &&,||
		//in logical and both the inputs true it return true else false
		//in logical or either of the input is true it return true else false
		boolean a=true;
		boolean b=false;
		System.out.println(a&&a);//true
		System.out.println(a&&b);//false
		System.out.println(b&&a);//false
		System.out.println(b&&b);//false
		System.out.println(a||a);//true
		System.out.println(a||b);//true
		System.out.println(b||a);//true
		System.out.println(b||b);//false
	}

}
