package Launch_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script1 
{

	public static void main(String[] args) 
	{
		String key = "webdriver.chrome.driver";
		String value = "./software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();	
	
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("meetmadhusudhanrao@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("MSrao31081997");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi note 8 pro");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		driver.findElement(By.className("s-image")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("enterAddressAddressLine1")).sendKeys("28,Sanjeeva building, L G Enclave");
		driver.findElement(By.name("enterAddressAddressLine2")).sendKeys("Nanjappa circle");
		driver.findElement(By.name("enterAddressCity")).sendKeys("bangalore");
		driver.findElement(By.name("enterAddressStateOrRegion")).sendKeys("Karnataka");
		driver.findElement(By.name("enterAddressPostalCode")).sendKeys("560097");
		WebElement ele = driver.findElement(By.className("enterAddressFormField"));
		Select s = new Select(ele);
		s.selectByValue("IN");
		
		
	}

}
