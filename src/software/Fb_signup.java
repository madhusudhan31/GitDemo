package software;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_signup {

	@test
	public void    signup() throws IOException
	{
		
	
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Madhusudhan");
		driver.findElement(By.name("lastname")).sendKeys("Rao T C");
		driver.findElement(By.name("reg_email__")).sendKeys("7090823262");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcdef123");
		WebElement ele = driver.findElement(By.id("day"));
		Select s = new Select(ele);
		s.selectByValue("31");
		WebElement ele1 = driver.findElement(By.id("month"));
		Select s1 = new Select(ele1);
		s1.selectByValue("8");
		WebElement ele2 = driver.findElement(By.id("year"));
		Select s2 = new Select(ele2);
		s2.selectByValue("1997");
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("./screenshots/Fbsignup1.png"));
			
			
		}	
	}

	


