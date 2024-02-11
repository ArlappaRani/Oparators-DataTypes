package operators;

public class OperatorProgrmming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b;
		b=++a + a-- + --a + a++ +a--;
		//we TAKING multiple incrementing and decrementing operators
        System.out.println(a);//9
        System.out.println(b);//50
	}

}
