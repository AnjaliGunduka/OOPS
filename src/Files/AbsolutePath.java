package Files;

import java.io.File;

public class AbsolutePath {
	public static void main(String[] args) { 
		File myObj = new File("D:\\abc.txt"); 
		if (myObj.exists()) { 
		System.out.println("File name: " + myObj.getName()); 
		//1System.out.println("Absolute path: " +                                                  myObj.getAbsolutePath()); 
		System.out.println("Writeable: " + myObj.canWrite()); 
		System.out.println("Readable " + myObj.canRead()); 
		System.out.println("File size in bytes " + myObj.length()); 
		} else { 
		System.out.println("The file does not exist."); 
		}
	}

}
