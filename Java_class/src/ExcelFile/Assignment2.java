package ExcelFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 
{
	public void Read_Data(int row) throws BiffException, IOException
		{
			File f= new File("../Java_class/Test.xls");
			Workbook wk =Workbook.getWorkbook(f);
			Sheet Sh = wk.getSheet(0);
			int r= Sh.getRows();
			int c= Sh.getColumns();
			for(int i=0;i<5;i++)
				{
					Cell c1 = Sh.getCell(i,row);
					System.out.print(c1.getContents()+" ");
				}
}

public static void main(String[] args) throws BiffException, IOException
	{
		Assignment2 obj =new Assignment2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row number =");
		int a = sc.nextInt();	
		obj.Read_Data(a);
	}

}
