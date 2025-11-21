package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Teatleafaccountcreation {

	public static void main(String[] args) {
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		//Launch browser
		ChromeDriver driver=new ChromeDriver(options);
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maxime the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the "CRM/SFA" link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the "Accounts" tab.
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester1");
				WebElement dp1 = driver.findElement(By.name("industryEnumId"));
				Select Options1 = new Select(dp1);
				Options1.selectByValue("IND_SOFTWARE");
				//Thread.sleep(1500);
				WebElement dp2 = driver.findElement(By.name("ownershipEnumId"));
				Select Options2 = new Select(dp2);
				Options2.selectByVisibleText("S-Corporation");
				
				WebElement dp3 = driver.findElement(By.name("dataSourceId"));
				Select Options3 = new Select(dp3);
				Options3.selectByValue("LEAD_EMPLOYEE");

				WebElement dp4 = driver.findElement(By.name("marketingCampaignId"));
				Select Options4 = new Select(dp4);
				Options4.selectByIndex(5);
				
				WebElement dp5 = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select Options5 = new Select(dp5);
				Options5.selectByValue("TX");
				driver.findElement(By.className("smallSubmit")).click();
				driver.close();

			

	}

}
