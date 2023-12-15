package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.CommonUtility;
import genericlibrary.DataUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(genericlibrary.ListenersImplimentation.class)
public class Testcase01 extends BaseTest {
  
	@Test(groups="smoke")
	public  void testCase01() throws IOException, InterruptedException {
       

        String customerName="Hemalatha"+CommonUtility.randomNumber();
		
         //To create Customer
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Reporter.log("Clicking on Task option", true);
       driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();

		driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]")).sendKeys("customerName");
		Reporter.log("Entered customer Name as "+customerName, true);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("selenium.java");
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
        Reporter.log("Customer Created", true);
        //To fetch the Customer name
         String actualCustomerName = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
       // try {
        //	Assert.
       // }
        if(actualCustomerName.equals("customerName"))
        {
        	System.out.println("TestCase01 is Pass");
        }
        else
        	System.out.println("TestCase01 is Fail");
        	
       //To perform logout
        driver.findElement(By.id("logoutLink"));
		//To close the browser
        driver.close();

	}

}


