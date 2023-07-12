package resources;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

/**
 * Created by Sandeep Arya
 */

public class CucHooks

{

    TestContext testContext;

    public CucHooks(TestContext Context)
    {
        testContext=Context;
    }

    @After(order=1)
    public void afterScenario(Scenario scenario)
    {

        if(scenario.isFailed())
        {
            String ssName=scenario.getName().replace("","");
            try
            {
                File src=((TakesScreenshot)testContext.getDriverContext().initDriver()).getScreenshotAs(OutputType.FILE);
                File dst=new File("target/cucumber-report/screenshots/"+ssName+".png");
                FileUtils.moveFile(src,dst);
                Reporter.addScreenCaptureFromPath(dst.toString(),ssName);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
