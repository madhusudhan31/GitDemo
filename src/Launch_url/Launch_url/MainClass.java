package Launch_url.Launch_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClass 
{
	@Test
	public void Login()
	{
		

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		LoginScript ls = new LoginScript(driver);
		ls.setUsername("7090823262");
		ls.setPassword("Madhuaug@31");
		ls.clickLogin();
	String atitle = driver.getTitle();
	Assert.assertEquals(atitle, "Facebook");
		
		
	
}
}