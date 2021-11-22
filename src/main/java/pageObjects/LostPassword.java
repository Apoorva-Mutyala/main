package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LostPassword {
	//Defining the webdriver
	public WebDriver driver;
	
	//linktext is used 
	By lostpassword=By.linkText("I lost my password");
	
	//xpath for mail
	By mail=By.xpath("//input[@id='lost_password_user']");
	
	//xpath for sendmessage
	By sendmessage=By.xpath("//button[@id='lost_password_submit']");
	
	//Creating constructor
	public LostPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;		
	}
	
	//Defining method getlostpassword
	public WebElement getlostpassword()
	{
		//return the element lostpassword
		return driver.findElement(lostpassword);
	}
	
	//Defining method getmail
	public WebElement getmail()
	{
		//return the element mail
		return driver.findElement(mail);
	}
	
	//Defining method getsendmessage
	public WebElement getsendmessage()
	{
		//return the element sendmessage
		return driver.findElement(sendmessage);
	}
}
