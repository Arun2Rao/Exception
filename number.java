package Exception;

public class number {
public static void main(String[]args) {
	String a = "doctor";
	
	
	
	try {
		int b = Integer.parseInt(a);
		System.out.println(b);
	}
	catch(NumberFormatException n) {
		System.out.println("john");
		n.printStackTrace();
	}
	finally {
		System.out.println("master the blaster");
	}
	System.out.println("end of the code");
}
}
