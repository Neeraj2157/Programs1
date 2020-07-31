package Txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_linereader
{
 
		int line_number;
		String a;
		public void ReadData( int number) throws IOException
			{
				File f = new File("G:\\Java\\Testing File.txt");
				FileReader fr= new FileReader(f);
				BufferedReader bf = new BufferedReader(fr);
				line_number = 0;
				while((a=bf.readLine())!=null) 
					{
						line_number++;
						if(line_number==number) 
							{   
								System.out.println(a);
							}		
					}	
				
			}
		public static void main(String[] args) throws IOException
		 
			{
			 	File_linereader obj= new File_linereader();
			 	Scanner s = new Scanner(System.in);
			 	System.out.println("Enter the number");
			 	int a= s.nextInt();
			 	
				obj.ReadData(a);
			}
		

}
