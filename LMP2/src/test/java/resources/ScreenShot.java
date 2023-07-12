package resources;
import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ntp.TimeStamp;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by Sandeep Arya
 */

public class ScreenShot {

    public static void takeSS(WebDriver driver,String testName)
    {
        TakesScreenshot ss=(TakesScreenshot)driver;
        File src=ss.getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.moveFile(src,new File("./Screenshots/"+testName+ TimeStamp.getCurrentTime()+".png"));
        }
        catch(Exception e)
        {
            System.out.println("Screen Capture error "+e.getMessage());
        }
    }

}
