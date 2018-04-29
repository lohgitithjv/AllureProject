package testAllure2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class CreatingAccount 
{

/*	@Test (priority=0, description="creating the account")
	@Description("Test to create account")
	@Step("Simple Test step")*/
	
	@Test (priority=0, description="creating the account")
	public void createAcc()
	{
		//Steps to push the code
		//http://imtilab.blogspot.in/2016/10/how-to-pushupload-eclipse-project-to.html
		
		//https://github.com/lohithjvgit/AllureProject/tree/master/testAllure2
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.close();
	}
	
	
	@Test (priority=1, description="updating the account")
	public void modifyAcc()
	{
	
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.close();
	}
	
	
	@Test (priority=2, description="deleting the account")
	@Attachment
	public void deleteAcc()
	{
	
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		Assert.assertEquals("guru", driver.getTitle());
		driver.close();
	
	
	}
	
}
