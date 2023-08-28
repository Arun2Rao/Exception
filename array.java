package Exception;

public class array {
public static void main(String[]args) {
//	int [] a = {8,15,20,100};
//	System.out.println(a);
	
	
	int [] a = {15,20};
	int b =a[0];
	int c =a[1];
	
	try {
		int d = a[2];
	System.out.println(d);	
	}
	
	catch(ArrayIndexOutOfBoundsException i) {
		System.out.println(i+"code is run");
		i.printStackTrace();
	}
	finally {
		System.out.println("not run");
	}
	System.out.println("success");
}
}
