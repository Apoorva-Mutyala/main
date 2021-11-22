package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Progress {
	
	//Defining the webdriver
	public WebDriver driver;
	
	//xpath for username
	By username=By.xpath("//*[@id='login']");
	
	//css selector for password
	By password=By.cssSelector("[type='password']");
	
	//xpath for login
	By login=By.xpath("//*[@id='form-login_submitAuth']");
	
	//linkText used for progress link
	By progress=By.linkText("Progress");
	
	//Creating constructor
	public Progress(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	//Defining method getusername
	public WebElement getusername()
	{
		//return the element username
		return driver.findElement(username);
	}
	
	//Defining method getpassword
	public WebElement getPassword()
	{
		//return the element password
		return driver.findElement(password);
	}
	
	//Defining method getlogin
	public WebElement getLogin()
	{
		//return the element login
		return driver.findElement(login);
	}
	
	//Defining method getprogress
	public WebElement getprogress()
	{
		//return the element progress
		return driver.findElement(progress);
	}


}
