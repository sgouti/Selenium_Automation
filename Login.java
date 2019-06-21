package version1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	 WebDriver driver;
	
	 Properties prop=new Properties();
	 
	
	public void OpenBrwsr(WebDriver driver) throws InterruptedException
	{
		
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
	
	}
	public void Login(String User,String pass) throws InterruptedException, IOException
	{
		 
		 FileInputStream ip= new FileInputStream("C:\\Users\\siddharth\\eclipse-workspace\\Automation\\src\\version1\\config.properties");
		 prop.load(ip);
		 
		driver.get("https://www15.v1host.com/Greenway/Account.mvc/LogIn");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("xpthusrnme"))).sendKeys(User);
		driver.findElement(By.xpath(prop.getProperty("xpthpssw"))).sendKeys(pass);
		driver.findElement(By.xpath(prop.getProperty("xpthlgnbtn"))).click();
		Thread.sleep(3000);
		
	}

	public void SearchfrDfct(String DfctId) throws InterruptedException, IOException
	{
		
		driver.findElement(By.xpath(prop.getProperty("xpthDfctSrchfld"))).sendKeys(DfctId);
		driver.findElement(By.xpath(prop.getProperty("xpthSrchsggesn"))).click();
		Thread.sleep(3000);
		
	}
}
