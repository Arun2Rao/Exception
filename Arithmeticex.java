package Exception;

public class Arithmeticex {
public static void main(String[]args) {
	int a =100;
	int b =0;
//	int c = a/b;
//	System.out.println(c);
//	System.out.println("Divide has been completed");


	try {
		int d = a/b;
		System.out.println(d);
	}
	catch(ArithmeticException pc) {
		System.out.println(pc+"value is zero");
		pc.printStackTrace();
		
	}
	
	finally {
		System.out.println("end of the code");
		
	}
	System.out.println("rest");
	System.out.println("rest of the code");

}
}
	

