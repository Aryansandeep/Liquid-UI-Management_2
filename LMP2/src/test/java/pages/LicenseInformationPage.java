package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class LicenseInformationPage {

    WebDriver driver;


    @FindBy(xpath = ("(//*[@class='sorting_1'])[4]"))//guixt
    private WebElement acount;

    @FindBy(xpath = ("(//*[@class='title'])[2]"))//guixt
    private WebElement licensetab;

    @FindBy(xpath=("//*[@class='panel-heading']"))//guixt
    private WebElement penalHandig;

    @FindBy(xpath = ("//*[@type='search']"))//guixt
    private WebElement serchTxt;

    @FindBy(xpath=("//*[@id='used_License']/tbody/tr[1]/td[1]"))//guixt
    private WebElement activeAccount;

    @FindBy(xpath = ("//*[@class='dt-button buttons-collection']"))
    private WebElement LicenseExport;

    @FindBy(xpath = ("//*[@class='dt-button buttons-copy buttons-html5']"))
    private WebElement copyBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-excel buttons-html5']"))
    private WebElement excelBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-csv buttons-html5']"))
    private WebElement cvsBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-pdf buttons-html5']"))
    private WebElement pdfBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-print']"))
    private WebElement printBtn;


    public LicenseInformationPage(WebDriver driver)  {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectAcct()
    {
        acount.click();
    }

    public void clickLicenseTab()
    {
        licensetab.click();
    }

    public WebElement vryPenalHand()
    {
        return penalHandig;
    }

    public void clickSerchTxt()
    {
        serchTxt.click();
    }

    public void enterText()
    {
        serchTxt.sendKeys("sandeeparyan11@gmail.com");
    }
    public void clearSerchTxt()
    {
        serchTxt.clear();
    }

    public void enterCompanyName()
    {
        serchTxt.sendKeys("synactive");
    }

    public void enterDeviceIdentifier()
    {
        serchTxt.sendKeys("496BEDDD-DA31-45E1-985B-EA866B1BDC14");
    }

    public void enterActiveStatus()
    {
        serchTxt.sendKeys("Active");
    }
    public void enterPendingStatus()
    {
        serchTxt.sendKeys("Pending");
    }
    public void enterInactiveStatus()
    {
        serchTxt.sendKeys("Inactive");

    }
    public void enterRevokedStatus()
    {
        serchTxt.sendKeys("Revoked");
    }

    public void clickActiveAccount()
    {
        activeAccount.click();
    }

    public void clickLicenseExport()
    {
        LicenseExport.click();
    }

    public void clickcopyBtn()
    {
        copyBtn.click();
    }

    public void openNotePad2() throws IOException, InterruptedException {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (IOException e) {

        }
    }

    public void saveDataNotePad2 () throws AWTException, InterruptedException
    {

        Robot robot = new Robot();
        robot.delay(150);
        //   press key for past the notepad
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(250);
        //  press key for save file with defalut location
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
    }

    public void downloadExcelFle ()
    {
        excelBtn.click();
    }

    public void downloadCvsFle ()
    {
        cvsBtn.click();
    }

    public void downloadPdfFle ()
    {
        pdfBtn.click();
    }

    public void downloadPrintFle ()
    {
        printBtn.click();
    }

    public void closePrintTabe ()
    {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }


}
