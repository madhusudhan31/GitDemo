package Launch_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScript 
{
	@FindBy(xpath="(//input[@class='inputtext login_form_input_box'])[1]")
	private WebElement uname;
	
	@FindBy(xpath="(//input[@class='inputtext login_form_input_box'])[2]")
	private WebElement pword;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	
	public LoginScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void setUsername(String username)
	{
		uname.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login.click();
	}

}
