//Run as Junit test

package cucumberOptions;
import java.io.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/Features", //for all tests which are there in feature
	    glue="stepDefinations",tags="@Signup")
public class TestRunner {


}
