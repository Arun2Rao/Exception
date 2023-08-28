package Exception;

public class Loginvalidation {
	public static void main(String[]args)throws LoginException {
	
	String username = "arun";
	String password = "0123";
 try {
if(username.equals("arun")&&password.equals("123")) {
	System.out.println("login successful");
}
else {
	throw new LoginException("invalid credentials");
}
 }
 catch(LoginException l) {
	 System.out.println(l.getMessage());
	 l.printStackTrace();
 }
	}
}


