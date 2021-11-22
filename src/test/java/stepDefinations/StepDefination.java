//install tidy gherkin plugin in chrome
//Run feature file- Ru as feature file
//configure convert to cucumber project
//cucumbr option and stepdefanition should have same parent

package stepDefinations;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.Dropdown;
import pageObjects.PopularCourses;
import pageObjects.LostPassword;
import pageObjects.Progress;
import pageObjects.signin;
import pageObjects.signup;
import resources.base;
public class StepDefination extends base {
 
       //1st scenario SIGNUP
	
		   //Intialize the browser
		    @Given("^Initialize the browser with chrome$")
		    public void initialize_the_browser_with_chrome() throws Throwable 
		    {
		    	//Intialize the driver
		    	 driver =initializeDriver();	       
		    }
	
		    //Navigate to the url of elearning
		    @Given("^Navigate to \"([^\"]*)\" Site$")
		    public void navigate_to_something_site(String arg1) throws Throwable 
		    {
		    	//arg1 contains the url
		    	driver.get(arg1);
		    	//maximize the window
		    	driver.manage().window().maximize();
		    }
		  //Signup button
		    @Given("^Click on signup button$")
		    public void click_on_signup_button() throws Throwable 
		    {
		    	//Create instance for signup page
		    	signup s1=new signup(driver);
		    	//click
		    	s1.getsignup().click();
		        
		    }
		    
		    //give the credentials
		    @When("^user registered by using (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+)$")
		    public void user_registered_by_using(String firstname, String lastname, String email, String username, String pass, String confirmpass, String phone, String code, String skype, String linkedinprofileurl) throws Throwable {
		    	//Create instance for signup
		    	signup s1=new signup(driver);
		    	//click on check box
		    	s1.getcheck().click();
		    	//give firstname
		    	s1.getfirstname().sendKeys(firstname);
		    	//give lastname
				s1.getlastname().sendKeys(lastname);
				//give email
				s1.getemail().sendKeys(email);
				//give username
				s1.getusername().sendKeys(username);
				//give password
				s1.getpass().sendKeys(pass);
				//confirm the password
				s1.getconfirmpass().sendKeys(confirmpass);
				//give phone number
				s1.getphone().sendKeys(phone);
				//give code
		    	s1.getcode().sendKeys(code);
		    	//give skype
		    	s1.getskype().sendKeys(skype);
		    	//give linkedin profile url
		    	s1.getlinkedin().sendKeys(linkedinprofileurl);
		    	//click
		    	s1.getregister().click();
		    	
		    }
		    
		    //User successfully registered
		    @And("^print user registers successfully$")
		    public void print_user_registers_successfully() throws Throwable
		    {
		    	//Contains given text or not
		    	if(driver.getPageSource().contains("alert alert-warning"))
		    	{
		    		//print
		    		System.out.println("User already registered");
		    	}
		    	else
		    	{
		    		//print
		    		System.out.println("Open the webpage");	       
		        }
		    	//wait
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    	//close
		    	driver.close();
		    }    
	    
	    
	    
	    //2nd Scenario SIGNIN
	    
		  //Login to the home page
		    @Given("^Click on Login link in home page to land on Secure sign in Page$")
		    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable 
		    {
		    	 //create instance for signin 
		    	 signin s1=new signin(driver);
		    	 //used assertion to check administrator is displayed or not
		    	 Assert.assertTrue(s1.getadm().isDisplayed());
		    	 //print
		    	 System.out.println("Elearning page is opened and Window is Maximised");  
		    }
		    
		    //enter credentials
		    @When("^User enters (.+) and (.+) and logs in$")
		    public void user_enters_and_and_logs_in1(String username, String password) throws Throwable 
		    {
		    	//create instance for signin page
		    	signin s1=new signin(driver);
		    	//Give username and password 
				s1.getusername().sendKeys(username);
				s1.getPassword().sendKeys(password);
				//click on login button
		        s1.getLogin().click();
		    }	    
		    
		    //Verify whether the current url is same as the expected url
		    @Then("^Verify that user is succesfully logged in$")
		    public void user_enters_and_and_logs_in() throws Throwable 
		    {
		    	//creating the actual url
		    	String actualUrl="http://elearningm1.upskills.in/user_portal.php";
		    	//creating the expected url
		    	String expectedUrl= driver.getCurrentUrl();
		    	//used assertion to check current url is same as the expected url
		    	Assert.assertEquals(expectedUrl,actualUrl);
		    }
		    
		    //Check login is successful
		    @And("^print success$")
		    public void print_success() throws Throwable 
		    {
		    	//expectedtext
		    	String expectedtext="Apoorva Mutyala";
		    	//gettext method used to retrieve the text
		    	String s = driver.findElement(By.xpath("//strong[text()=\"Apoorva Mutyala\"]")).getText();
		    	//equalsIgnoreCase is used
		    	if(expectedtext.equalsIgnoreCase(s))
		    	{
		    		//print
		    		System.out.println("User logged sucessfully");
		    	}
		    	//wait
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    	//close
		    	driver.close();
		 
		    }
	    
	    
	    
	    
	    //3rd scenario DROPDOWN
	    
		  //click on language dropdown
		    @Then("^Click on language you preferred$")
		    public void click_on_language_you_preferred() throws Throwable 
		    {
		    	//create instance for dropdown
		    	Dropdown d1=new Dropdown(driver);
		    	//wait
		    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	//click on icon
		    	d1.getdropdown1().click();
		    	//click on the language
		    	d1.getdropdown().click();
		    }
	
		    //language is selected
		    @Then("^print language is selected$")
		    public void print_language_is_selected() throws Throwable 
		    {   
		    	//print
		    	System.out.println("Language is changed according to the requirement");
		    	//wait
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    	//close
		        driver.close();
		    }
		    
	   
	    
	    //4th scenario LOST MY PASSWORD
	    
		    //lost my password link
		    @Then("^Click on I my lost password link and give (.+)$")
		    public void click_on_i_my_lost_password_link_and_give(String mail) throws Throwable 
		    {
		    	//create instance for lostpassword
		    	LostPassword l1=new LostPassword(driver);
		    	//click 
		    	l1.getlostpassword().click();
		    	//send mail
		    	l1.getmail().sendKeys(mail);
		        //click on sendmessage button
		    	l1.getsendmessage().click();
		        
		    }
	
		    //link sent to the user
		    @Then("^the link had send to the user$")
		    public void the_link_had_send_to_the_user() throws Throwable 
		    {
		    	//given text is there in webpage or not
		    	if(driver.getPageSource().contains("There is no account with this user and/or e-mail address"))
		    	{
		    		System.out.println("No account is there");
		    	}
		    	else
		    	{
		    		System.out.print("Link has Sent to the given mail");	 
		    	}
		    	//wait
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    	driver.close();
		    }
	    
	    
	    
	    //5th scenario PROGRESS 
	    
	    
		    //Verify user is logged in or not
		    @When("^Verify that user is succesfully logged in to the site$")
		    public void verify_that_user_is_succesfully_logged_in_to_the_site() throws Throwable 
		    {
		    	//Assertion used
		    	Assert.assertTrue(driver.findElement(By.xpath("//*[@class='btn btn-primary btn-large']")).isDisplayed());
		        //print
		    	System.out.println("user logged in successfully");
		    }
		    
		    //Go to the progress link
		    @And("^go to the progress$")
		    public void go_to_the_progress() throws Throwable 
		    {
		    	//print
		        System.out.println("Go the progress link");
		    }
		    
		    //click on progress link
		    @Given("^click progress link$")
		    public void click_progress_link() throws Throwable 
		    {
		    	//Create instance for progress
		    	Progress p1=new Progress(driver);
		    	//click
				p1.getprogress().click();
		    }
		    
		    //check the progress link is opened or not
		    @And("^check the data$")
		    public void check_the_data() throws Throwable 
		    {
		    	Assert.assertTrue(driver.findElement(By.xpath("//*[text()='No data available']")).isDisplayed());
		        System.out.println("progress link opened");
		        driver.close();
		    }
		    
	    
	    //6th scenario POPULAR COURSES
		    
		    @Then("^check the links$")
		    public void check_the_links() throws Throwable {
		    	
		    	//create instance for link
		    	PopularCourses l=new PopularCourses(driver);
		    	
		    	//click
		    	l.getlink().click();
		    	//click
		    	l.getlinkedin().click();
		    	
		    	//window handle
		    	 Set<String> windows = driver.getWindowHandles();
		 		
		 		//create Iterator
		 		Iterator<String>it = windows.iterator();
		 		
		 		//Create parent and child window id
		 		String parentId = it.next();
		 		String childId = it.next();
		 		
		 		//switch to child window
		 		driver.switchTo().window(childId);
		 		//To wait
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 		//To close the driver
		 		driver.close();
		 		//switch to parent window
		 		driver.switchTo().window(parentId);
		    
		    	//back
		 		driver.navigate().back(); 
		    }
		   
		    @And("^close the browser$")
		    public void close_the_browser() throws Throwable {
		    	//Close
		    	driver.close();
		    	
		    }
		  
	}
