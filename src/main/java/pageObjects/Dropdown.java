package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Dropdown {
	//Defining the webdriver
	public WebDriver driver;
	
	//xpath for dropdown button
	By dropdown1=By.xpath("//button[@class='btn btn-default dropdown-toggle']");
	
	//xpath for language need to be selected
	By dropdown=By.xpath("//a[@href ='/index.php?language=galician']");
	
	//creating constructor
	public Dropdown(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;		
	}
	
	//Defining the method getdropdown1
	public WebElement getdropdown1()
	{
		//return the element dropdown1
		return driver.findElement(dropdown1);
	}
	
	//Defining the method getdropdown
	public WebElement getdropdown()
	{
		//return the element dropdown
		return driver.findElement(dropdown);
	}
}
