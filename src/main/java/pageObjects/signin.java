package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class signin {
	
	//Defining the webdriver
	public WebDriver driver;
	
	//xpath for username
	By username=By.xpath("//*[@id='login']");
	
	//css selector for password
	By password=By.cssSelector("[type='password']");
	
	//xpath for login
	By login=By.xpath("//*[@id='form-login_submitAuth']");
	
	//class name is used
	By adm=By.className("administrator-name");
	
	//Creating constructor
	public signin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	//Defining the method getusername
	public WebElement getusername()
	{
		//return the element username
		return driver.findElement(username);
	}
	
    //Defining the method getpassword
	public WebElement getPassword()
	{
		//return the element password
		return driver.findElement(password);
	}
	
	//Defining the method login
	public WebElement getLogin()
	{
		//return the element login
		return driver.findElement(login);
	}
	
	//Defining adm method
	public WebElement getadm()
	{
		//return the element adm
		return driver.findElement(adm);
	}

}
