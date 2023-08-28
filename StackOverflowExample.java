package Exception;

public class StackOverflowExample {
public void callA() {
	this.callB();
		
	}
public void callB() {
	this.callA();
	
}
public static void main(String[]args) {
	StackOverflowExample s = new StackOverflowExample();
	s.callA();
}
}
