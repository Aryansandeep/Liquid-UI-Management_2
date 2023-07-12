package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserHistoryPage {

    WebDriver driver;

    @FindBy(xpath = ("//*[@id='account_table']/tbody/tr[4]"))
    private WebElement extingAccount;

    @FindBy(xpath = ("//*[@id='purchasedLicense']/div/div"))
    private WebElement purchedLicense;

    @FindBy(xpath = ("//*[@id='userHistory']/div/div"))
    private WebElement usrHistory;

    @FindBy(xpath = ("//*[@id='usedLicense']/div/div"))
    private WebElement licenseInform;

    @FindBy(xpath = ("//*[@class='dt-button buttons-collection']"))
    private WebElement usrHistoyexport;

    @FindBy(xpath = ("//*[@id='validFromDate']"))
    private WebElement datePicker1;

    @FindBy(xpath = ("//*[@id='validTillDate']"))
    private WebElement datePicker2;

    @FindBy (xpath = ("(//*[@class='hasDatepicker'])[1]"))//guixt
    private WebElement dateTxt;

    @FindBy(xpath = ("(//*[@class='hasDatepicker'])[2]"))
    private WebElement dateTxt2;

    @FindBy (xpath=("//*[@class='ui-datepicker-year']"))
    private WebElement arrow;

    @FindBy(xpath=("//*[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]"))
    private WebElement selectDate;

    @FindBy(xpath = ("//*[@class='ui-datepicker-calendar']/tbody/tr[1]/td[3]"))
    private WebElement selectDate2;

    @FindBy(xpath=("//*[@class='btn btn-primary getUsers']"))
    private WebElement getUsrBtn;

    @FindBy(xpath = ("//*[@class='dt-button-background']"))
    private WebElement back;

    @FindBy(xpath = ("(//*[@id='location-select-all'])[1]"))
    private WebElement allCheck;








    public UserHistoryPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickExtingAccount()
    {
        extingAccount.click();
    }

    public void clicklicenseInform()
    {
        licenseInform.click();
    }

    public void clickUsrHistory()
    {
        usrHistory.click();
    }

    public void clickScroll()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void clickDateTxt()
    {
        dateTxt.click();
    }

    public void changeDate() throws InterruptedException
    {
        WebElement element= driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select select = new Select(element);
        select.selectByVisibleText("2018");
        Thread.sleep(1000);
        selectDate.click();

    }

    public void clickDateTxt2()
    {
        dateTxt2.click();
    }
    public void changeDate2() throws InterruptedException
    {
        WebElement element= driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select select = new Select(element);
        select.selectByVisibleText("2019");
        Thread.sleep(1000);
        selectDate2.click();

    }

    public void clickgetUsrBtn()
    {
        getUsrBtn.click();
    }

    public void clickallCheck()
    {
        allCheck.click();
    }

    public void clickback()
    {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE);
    }


}
