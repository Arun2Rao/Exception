package Exception;

public class NameFoundvalidation {
public  static void main(String[]args)throws NameNotFoundException {
	String name = "";

	try {
	if(name==null||name=="") {
		throw new NameNotFoundException("invalid") ;

	}
	else {
		System.out.println("successful");
	
		}
	
	}
	catch(NameNotFoundException n) {
		n.printStackTrace();
		System.out.println(n.getMessage());
	}
}
}
