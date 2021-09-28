package com.nt.pattern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataIntoFile {

	public static void main(String[] args) throws FileNotFoundException ,IOException {
FileReader fr=new FileReader("abc.txt");
fr.read();
			
}
}
