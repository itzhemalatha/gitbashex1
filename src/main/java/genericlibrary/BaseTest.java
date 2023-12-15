package genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	DataUtility du=new DataUtility();
	public WebDriver driver;
	public static WebDriver listenersDriver;
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome")String browser) throws IOException
	{
	if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else 
	{
		System.out.println("please enter valid browser name");
	}
	listenersDriver=driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(du.getDataFromProperties("url"));
    }

	@BeforeMethod
	public void login() throws IOException
	{
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("un"));
	    driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("pwd"));
	    driver.findElement(By.id("loginButton")).click();
	}    
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}	

}
