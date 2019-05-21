package CoreoHome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Driver {
	public void Excutebrowser(String Browser)
	{
		WebDriver driver;
		if(Browser=="Chrome")
			driver=new ChromeDriver();
		else if(Browser=="firefox")
		driver=new FirefoxDriver();
	}
	public void excel()
	{
		File file;
		Workbook wb=null;
		try {
			wb=Workbook.getWorkbook(new File("sid.xls"));
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file error");
		}
		Sheet sht=wb.getSheet(0);
		Cell cell=sht.getCell(0, 0);
		String celv=cell.getContents();
		System.out.println(celv);
		
	}
	
}
