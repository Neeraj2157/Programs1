package Txtfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("G:\\Java\\Testing File.txt");
		File f2 = new File("G:\\Java\\Testing File2.txt");
		
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2, true);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter Write = new BufferedWriter(fw);
		String a;
		while((a=br.readLine())!=null) 
		
		
		fw.write(a);
		
		Write.close();

	}
}
