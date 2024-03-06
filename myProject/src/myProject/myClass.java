
package myProject;
public class myClass {
	static int count=0;
	static void p() {
	count++;
	if(count<=5){
	System.out.println("hello "+ count);
	p();
	}
	}
	public static void main(String[] args) {
	p();
	}
	}

//package myProject;
//import java.util.*;
//import java.io.*;
//public class myClass {
//	public static void main (String args[]) throws IOException{
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		
//		try {
//			in = new FileInputStream("input.txt);");
//			out = new FileOutputStream("output.txt");
//			
//			int c;
//			while ((c = in.read()) != -1){
//				out.write(c);
//			}
//		}
//		finally {
//			if (in != null) {
//				in.close();
//			}
//			if (out != null) {
//				out.close();
//			}
//		}
//	}
//}
