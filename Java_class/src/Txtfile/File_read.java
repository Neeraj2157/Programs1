package Txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_read 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("G:\\Java\\Testing File.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String a;
		while((a=br.readLine())!=null) 
		{
			System.out.println(a);
		}

	}
}
