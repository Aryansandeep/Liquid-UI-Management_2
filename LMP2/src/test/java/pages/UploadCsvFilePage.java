package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class UploadCsvFilePage
{

    WebDriver driver;

    @FindBy(xpath=("(//div[@class='title'])[5]"))
    private WebElement addUsr;

    @FindBy(xpath = ("//*[@id='uploadFile']"))//guixt
    private WebElement upLoadCvs;

    @FindBy(xpath = ("(//*[@class='btn btn-primary saveUsers'])[1]"))//guixt
    private WebElement savBtn;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement popBtn;

    @FindBy(xpath = ("//*[@id='existErrorMsg']"))//
    private WebElement errMesg;

    @FindBy (xpath = ("//*[@class='dataTables_empty']"))
    private WebElement errMsg;

    @FindBy(xpath = ("//*[@id='add_users']/tbody/tr/td"))
    private WebElement alreadyMsg;


    public UploadCsvFilePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickAddUsr()
    {
        addUsr.click();
    }

    public void clkUpLoadCvs() throws AWTException, InterruptedException
    {
        upLoadCvs.click();
        Thread.sleep(2000);
        StringSelection ss1 = new StringSelection("D:\\UploadFiles\\AddUser1");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
   public void clickSavBtn() throws InterruptedException
   {
       savBtn.click();

   }

   public void clickPopBtn()
   {
       popBtn.click();
   }

   public WebElement geterrMesg()
    {
      return errMesg;
    }

    public WebElement geterrMsg()
    {
        return errMsg;
    }

    public void clickUpLoad()
    {
        upLoadCvs.click();
    }

    public void uploadCVSFile() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        upLoadCvs.click();
        Thread.sleep(2000);
        StringSelection ss1 = new StringSelection("D:\\UploadFiles\\AddUser");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public WebElement getAlreadyMsg()
    {
        return alreadyMsg;
    }
    public void moveToLogOut() {
        Actions act = new Actions(driver);
        WebElement pro = driver.findElement(By.xpath("//span[@class='username']"));
        act.moveToElement(pro).build().perform();
        WebElement lg = driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
        act.moveToElement(lg).click().build().perform();

    }
}
