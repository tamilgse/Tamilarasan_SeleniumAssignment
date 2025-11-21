package week3.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreateFacebookAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tamilarasan");
		driver.findElement(By.name("lastname")).sendKeys("G");
		WebElement dropdownoptions = driver.findElement(By.id("day"));
		Select options1 =new Select (dropdownoptions);
		options1.selectByValue("20");
		WebElement dropdownoptions1 = driver.findElement(By.id("month"));
		Select options2 =new Select (dropdownoptions1);
		options2.selectByValue("4");
		WebElement dropdownoptions2 = driver.findElement(By.id("year"));
		Select options3 =new Select (dropdownoptions2);
		options3.selectByValue("1989");
		WebElement button=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		button.click();
		driver.findElement(By.name("reg_email__")).sendKeys("tamilg@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test123");
		driver.findElement(By.name("websubmit")).click();
		
	}

}
