package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotfound {
public static void main(String[]args)throws IOException,FileNotFoundException {
	
	try {
	File f = new File("C://sample.txt");
	FileReader fr = new FileReader(f);
	
	int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)(temp));
		}
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	System.out.println("rest of the code");
	
}
}
