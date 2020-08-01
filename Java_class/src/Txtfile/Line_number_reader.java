package Txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Line_number_reader 
{

	int line_number;
	String a;
	public void Read_Data( int start_number, int end_number ) throws IOException
		{
			File f = new File("G:\\Java\\Testing File.txt");
			FileReader fr= new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			int line= 0;
			String a;
			while((a=bf.readLine())!=null) 
				{
				line++;
					if((line>=start_number)&&(line<=end_number))
						{   
							System.out.println(a);
						}		
				}	
			
		}
	public static void main(String[] args) throws IOException
	 
		{
		Line_number_reader obj= new Line_number_reader();
		 	Scanner s = new Scanner(System.in);
		 	System.out.println("Enter the Start number");
		 	System.out.println("Note:- Start number should be less then end number");
		 	int a= s.nextInt();
		 	System.out.println("Enter the End number");
		 	int b= s.nextInt();
		 	
			obj.Read_Data(a,b);
		 	
		}
	
}
