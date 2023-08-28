package Exception;

public class words {
public static void main(String[]args) {
	String word  = "Arun";
	
	
	try {
		System.out.println(word.charAt(8));
	}
	catch(StringIndexOutOfBoundsException s) {
		System.out.println(s+"correction");
		s.printStackTrace();
		
	}
	finally {
		System.out.println("games");
	}
	System.out.println("void");
}
}
