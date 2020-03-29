package Launch_url;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample
{
	public static void main(String[] args) throws Exception
	{
		String key = "webdriver.chrome.driver";
		String value = "./software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();	
	
		driver.get("file:///C:/Users/Madhusudhan/Desktop/Demo.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshots/facebook1.png");
		FileUtils.copyFile(src, dst);
		
	}	
}
