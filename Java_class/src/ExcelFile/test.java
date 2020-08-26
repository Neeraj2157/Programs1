package ExcelFile;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class test
{
	
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
	File f= new File("../Java_class/Test.xls");
	File f1= new File("../Java_class/Write.xls");
	Workbook wk =Workbook.getWorkbook(f);
	WritableWorkbook wk1 =Workbook.createWorkbook(f1);
	WritableSheet Sh1 = wk1.createSheet("Testing",0);
	Sheet Sh = wk.getSheet(0);
	int rc = Sh.getRows();
	int cc = Sh.getColumns();
	for(int j=0;j<rc;j++)
		{
			for(int i=0;i<cc;i++)
				{
					Cell c1 = Sh.getCell(j,i);
					String  scrr = c1.getContents();
					Label l = new Label(j, i,scrr);
					Sh1.addCell(l);
				}
		
	wk1.write();
	wk1.close();
	System.out.println("Data saved successfully");
	}
	}
}
