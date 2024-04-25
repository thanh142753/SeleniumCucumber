package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;


public class Hooks {

	 Properties p;
     BaseClass baseClass = BaseClass.getInstance();

	@Before
    public void setup() throws IOException
    {
        baseClass.initializeBrowser();
    	p=BaseClass.getProperties();
        System.out.println("Alo + " + p.getProperty("screenshot.dir"));
        System.out.println(System.getProperty("appURL"));
        baseClass.getDriver().get(p.getProperty("appURL"));
        baseClass.getDriver().manage().window().maximize();
	}


    @After
    public void tearDown() {

        baseClass.getDriver().quit();

    }


//    @AfterStep
//    public void addScreenshot(Scenario scenario) {
//
//    	// this is for cucumber junit report
//        if(scenario.isFailed()) {
//
//        	TakesScreenshot ts=(TakesScreenshot) baseClass.getDriver();
//        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//        	scenario.attach(screenshot, "image/png",scenario.getName());
//
//        }
//
//    }
   
}
