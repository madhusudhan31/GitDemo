package software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enterprise_bot {

	public static void main(String[] args) throws InterruptedException 
	{
	
		String key = "webdriver.gecko.driver";
		String value = "./software/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://demo-chatbot2go.enterprisebot.co/intents");
		driver.findElement(By.xpath("//input[@id='initialEmailId']")).sendKeys("suraj+tester@enterprisebot.org");
		driver.findElement(By.xpath("//button[.='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("E13_Tester");
		

	}

}
