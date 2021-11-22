package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class base {
	  public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSRIAPOO\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	//execute in chrome driver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
}