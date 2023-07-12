package resources;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DriverContext {

    public WebDriver driver;
    public WebDriverWait Wait;

    public WebDriver initDriver()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }
        return driver;
    }

    public WebDriverWait initWait()
    {
        if(Wait==null)
            Wait=new WebDriverWait(driver,40);
        return Wait;
    }


    public void closseDriver()
    {
        driver.close();
        driver.quit();
    }

    public void switchToParent()
    {
        driver.switchTo().parentFrame();
    }

    public void switchToalert()
    {
        driver.switchTo().alert().accept();
    }

    public boolean verifyElementNonPresence(WebElement element)
    {
        Boolean status=false;
        try
        {
            Assert.assertFalse(element.isDisplayed(),"Element is displayed - failed");
            status=true;
        }
        catch(NoSuchElementException e)
        {
            Assert.assertTrue(true);
            status=false;
        }
        return status;
    }

}
