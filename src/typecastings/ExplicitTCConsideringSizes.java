package typecastings;

public class ExplicitTCConsideringSizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;//4bytes
		byte b;//1 byte
       b=(byte)a;//forcefully converting
       System.out.println(a);
       System.out.println(b);
	}

}
