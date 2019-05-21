package CoreoHome;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class Exceldata {
	public Sheet getexcelsheet(String fileName,String sheetname)
	{
		Workbook Wb = null;
		Sheet sheet1 = null;
	try 	
		{
		System.out.println("enter");
		Wb=Workbook.getWorkbook(new File("sid.xls"));
		 sheet1=Wb.getSheet("Sheet2"); String s=sheet1.getName();
		System.out.println(s);
		} 
	catch (BiffException | IOException e)
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("file missing");
		}
	
	return sheet1;
	}

	public int[] GetRowColumn(String FileName)
{
		Sheet sheetemp=getexcelsheet(FileName,"");
		int Rowcnt=sheetemp.getRows();
		int Colcnt=sheetemp.getColumns();
		int temp[]=new int[2];
	temp[0]=Rowcnt;temp[1]=Colcnt;
System.out.println(temp[0]+" and" +temp[1]);
	return temp ;	
}
	public String[] GetRowsvalue(String filename)
	{
		
		Sheet sheetemp=getexcelsheet(filename,"");
		int[] temp=GetRowColumn(filename);
		int row=temp[0];int clmn=temp[1];
		Cell clmnhdr=sheetemp.findCell("ts1");
		
		String[] Rowvlue=new String[row];
		int[] temp1 = new int[row];
		int cl =clmnhdr.getColumn(); int j=0;
		for(int i=1;i<row;i++)
		{
			boolean a;
			if( a=sheetemp.getCell(cl,i).getContents().equals("ts1"))
		 {
				Rowvlue[i]=sheetemp.getCell(cl,i).getContents();
				temp1[i]=sheetemp.getCell(cl,i).getRow();
			System.out.println(Rowvlue[i]+ " " + temp1[i]);
			
			if( a=sheetemp.getCell(cl,i).getContents().equals("ts1"))
			System.out.println("row values " + Rowvlue[i]);
			}
		}
		return Rowvlue;
	}
	
	public String Exceldata1(String FileName)
{
	String Cellm=null;
	Sheet sheetname=getexcelsheet(FileName,"");
	int[] Rowclm=GetRowColumn(FileName);
	int Rownct=Rowclm[0]; int Colcnt=Rowclm[1];
	for(int i=0;i<Colcnt;i++)
	{
	for(int j=0;j<Rownct;j++)
	{
		Cell cell1=sheetname.getCell(i,j);
	   Cellm=cell1.getContents();
	   System.out.println(Cellm);
	}
	}
	return Cellm;
	}
}
