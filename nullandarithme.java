package Exception;

public class nullandarithme {
public static void main(String[]args) {
	String word = null;
	int num = 10;
	try {
		int len = word.length();
		int ans = num/len;
	}
	catch(NullPointerException n) {
		System.out.println("rest");
		n.printStackTrace();
	}
	catch(ArithmeticException a) {
		System.out.println(a+"end of the word");
		a.printStackTrace();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
