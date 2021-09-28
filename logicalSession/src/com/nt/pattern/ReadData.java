package com.nt.pattern;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadData {

public static void main(String args[])throws IOException {
	 FileOutputStream  fos=  new FileOutputStream("abc.txt");
	 FileInputStream fs=new FileInputStream("abc.txt");

      DataOutputStream dataOut = new DataOutputStream(fos);
      dataOut.writeInt(25);
      dataOut.writeBoolean(true);
      dataOut.writeChars("a");
      
      DataInputStream dataIn=new DataInputStream(fs);
     int i1= dataIn.readInt();
      boolean b1=dataIn.readBoolean();
      char c1=dataIn.readChar();
      System.out.println(i1);
      System.out.println(b1);
      System.out.println(c1);
      
    		  

      System.out.println("data write complited");
	
}
}

