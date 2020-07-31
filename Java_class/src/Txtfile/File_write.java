package Txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write
{
	public void readData(int a) throws IOException
	{
		
		File f = new File("G:\\Java\\Testing File.txt");
		FileWriter fr = new FileWriter(f, true);
		BufferedWriter Write = new BufferedWriter(fr);
		
		Write.write("Hello Java");
		
		Write.close();
	}

	public static void main(String[] args) throws IOException
	{
		
		File_write obj = new File_write();
		obj.readData(4);
		
		

	}
}
