package useforjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	@Test
	public void login() throws InterruptedException
	
	{
		
		ChromeOptions options = new ChromeOptions();
	       options.addArguments("--disable-notifications");
	       
	   WebDriverManager.chromedriver().setup();	
	   WebDriver driver = new ChromeDriver(options);
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	  WebElement  ele1 = driver.findElement(By.xpath("//input[@type='text']"));
	   ele1.sendKeys("bentennysongwenkevin@gmail.com");
	   WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
	   ele2.sendKeys("sainathharmoni10");
	   WebElement ele3 = driver.findElement(By.xpath("//button[@type='submit']"));
	   ele3.click();
	   
	}

}
