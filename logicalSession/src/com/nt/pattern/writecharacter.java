package com.nt.pattern;


import java.io.FileOutputStream;
import java.io.IOException;

public class writecharacter {

public static void main(String args[])throws IOException {
	 FileOutputStream  fos=  new FileOutputStream("abc.txt");  
     String s1="Hello World";
     byte[] a=s1.getBytes();
     fos.write(a);
  
      
      System.out.println("data write complited");
	
}
}
