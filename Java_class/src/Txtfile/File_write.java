package Txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("G:\\Java\\Testing File.txt");
		FileWriter fr = new FileWriter(f, true);
		BufferedWriter Write = new BufferedWriter(fr);
		Write.write("Hello Java");
		
		Write.close();
	
	}
}
