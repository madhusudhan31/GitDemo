package Launch_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass 
{
	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		LoginScript ls = new LoginScript(driver);
		ls.setUsername("7090823262");
		ls.setPassword("Madhuaug@31");
		ls.clickLogin();
		
		
	
}
}