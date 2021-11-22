package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class signup {
	//Defining the webdriver
	public WebDriver driver;
	
	//xpath for signup button
	By signup=By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']");
	
	//xpath for check box which is displayed at first
	By check=By.xpath("//*[@value='5']");
	
	//xpath for firstname
	By firstname=By.xpath("//input[@id='registration_firstname']");
	
	//used name tag for lastname
	By lastname=By.name("lastname");
	
	//used id tag for mail
	By email=By.id("registration_email");
	
	//xpath for username
	By username=By.xpath("//input[@id='username']");
	
	//xapth for password
	By pass=By.xpath("//input[@id='pass1']");
	
	//xapth for confirm password
	By confirmpass=By.xpath("//input[@id='pass2']");
	
	//used id for phone
	By phone=By.id("registration_phone");
	
	//xpath for code
	By code=By.xpath("//input[@id='registration_official_code']");
	
	//xpath for skype
	By skype=By.xpath("//input[@id='extra_skype']");
	
	//xpath for linkedin
	By linkedin=By.xpath("//input[@id='extra_linkedin_url']");
	
	//used id tag for register
	By register=By.id("registration_submit");

	//creating constructor
	public signup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	//Defining the method getsignup
	public WebElement getsignup()
	{
		//return the element signup
		return driver.findElement(signup);
	}
	
	//Defining the method getcheck
	public WebElement getcheck()
	{
		//return the element check
		return driver.findElement(check);
	}
	
	//Defining the method getfirstname
	public WebElement getfirstname()
	{
		//return the element firstname
		return driver.findElement(firstname);
	}
	
	//Defining the method getlastname
	public WebElement getlastname()
	{
		//return the element lastname
		return driver.findElement(lastname);
	}
	
	//Defining the method getemail
	public WebElement getemail()
	{
		//return the element email
		return driver.findElement(email);
	}
	
	//Defining the method getusername
	public WebElement getusername()
	{
		//return the element username
		return driver.findElement(username);
	}
	
	//Defining the method getpass
	public WebElement getpass()
	{
		//return the element pass
		return driver.findElement(pass);
	}
	
	//Defining the method getconfirmpass
	public WebElement getconfirmpass()
	{
		//return the element confirmpass
		return driver.findElement(confirmpass);
	}
	
	//Defining the method getphone 
	public WebElement getphone()
	{
		//return the element phone
		return driver.findElement(phone);
	}
	
	//Defining the method getcode
	public WebElement getcode()
	{
		//return the element code
		return driver.findElement(code);
	}
	
	//Defining the method getskype
	public WebElement getskype()
	{
		//return the element skype
		return driver.findElement(skype);
	}
	
	//Defining the method getlinkedin
	public WebElement getlinkedin()
	{
		//return the element linkedin
		return driver.findElement(linkedin);
	}
	
	//Defining the method getregister
	public WebElement getregister()
	{
		//return the element register
		return driver.findElement(register);
	}
	
	
}

