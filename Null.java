package Exception;

public class Null {
public static void main(String[]args) {
	String word = null;
	
	try {
		System.out.println(word.toUpperCase());
		
	} catch (NullPointerException e) {
		System.out.println("value is null");
		e.printStackTrace();
	}
	finally {
		System.out.println("end of code");
	}
	System.out.println("name");
	
}
}
