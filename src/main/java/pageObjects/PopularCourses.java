package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PopularCourses {
	//Defining the webdriver
	public WebDriver driver;
	
	//xpath for the 123testing
	By link=By.xpath("//a[@alt='123testing']");
	
	//xpath for linkedin button
	By linkedin=By.xpath("//a[@class='btn btn-linkedin btn-inverse btn-xs']");
	
	
	//Creating the Constructor
	public PopularCourses(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Defining the method getlink
	public WebElement getlink()
	{
		//return the element link
		return driver.findElement(link);
	}
	
	
	
	//Defining the method getlinkedin
	public WebElement getlinkedin()
	{
		//return the element linkedin
		return driver.findElement(linkedin);
	}
	
}


