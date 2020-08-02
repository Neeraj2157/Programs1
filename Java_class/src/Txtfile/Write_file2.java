package Txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_file2 {
	public void write_data(int Start_line, int end_line) throws IOException
	{
		File f = new File("G:\\Java\\Testing File3.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0; i<Start_line; i++)                    
		{
			bw.newLine();
		}
		for(int i=Start_line; i<=end_line; i++)             
		{
			System.out.println("Enter the data for line");
			Scanner s = new Scanner(System.in);
			String a = s.nextLine();
			bw.write(a);
			bw.newLine();
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strat Line Number = ");
        int a = sc.nextInt();
        System.out.println("Enter end line Number = ");
        int b = sc.nextInt();
        
        Write_file2 obj = new Write_file2();
        obj.write_data(a,b);

	}

}
