package version1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 Properties prop=new Properties();
		 FileInputStream ip= new FileInputStream("C:\\Users\\siddharth\\eclipse-workspace\\Automation\\src\\version1\\config.properties");
		prop.load(ip);
		
		Login L=new Login();
		L.OpenBrwsr(driver);
		L.Login(prop.getProperty("username"), prop.getProperty("Password"));
		L.SearchfrDfct(prop.getProperty("DefectId"));
		driver.quit();
		
	}

}
