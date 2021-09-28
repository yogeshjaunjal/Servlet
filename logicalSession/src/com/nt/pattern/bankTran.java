package com.nt.pattern;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class bankTran {

	public static void main(String[] args) throws Exception {
		bank bk=new bank();
		 bk.setaccNum(101);
		 bk.setbalance(1000);
		
		 //transfer bank obj
		 FileOutputStream fos=new FileOutputStream("E:\\CJ\\LOGICAL SESSION\\logicalSession\\src\\abc.txt");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(bk);
		 oos.close();
		 
		 //read file
		 
		 

	}

}
