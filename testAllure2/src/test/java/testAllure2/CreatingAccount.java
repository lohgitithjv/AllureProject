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
	
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.close();
	}
	
	
	@Test (priority=0, description="updating the account")
	public void modifyAcc()
	{
	
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.close();
	}
	
	
	@Test (priority=0, description="deleting the account")
	@Attachment
	public void deleteAcc()
	{
	
		//allure serve //path of the Allure report
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Hey how are you");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		Assert.assertEquals("guru", driver.getTitle());
		driver.close();
	
	
	}
	
}
