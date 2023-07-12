package pages;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasedLicensePage {
    WebDriver driver;

    @FindBy(xpath = ("(//*[@class='sorting_1'])[3]"))
    private WebElement exitingAccount;

    @FindBy(xpath = ("//*[@class='info-box blue-bg']"))
    private WebElement purchasLicense;

    @FindBy(xpath = ("(//*[@class='info-box green-bg'])[2]"))
    private WebElement buyLicense;

    @FindBy(xpath=("//*[@id='licenseCount']"))
    private WebElement licensePack;

    @FindBy(xpath = ("//*[@id='validFromDate']"))
    private WebElement datePicker1;

    @FindBy(xpath = ("//*[@id='validTillDate']"))
    private WebElement datePicker2;

    @FindBy(xpath=("(//*[@id='account_form_submit'])[1]"))
    private WebElement buyLcense;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement closeBtn;

    @FindBy(xpath = ("//*[text()='Purchased License']"))//guixt
    private WebElement purchasedLicense;




    public PurchasedLicensePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickExistingAccount()
    {
        exitingAccount.click();
    }

    public void clickPurchasLicense()
    {
        purchasLicense.click();
    }

    public void clickBuyLicense()
    {
        buyLicense.click();
    }

    public void clickLicensePack()
    {
        licensePack.click();
        licensePack.clear();
    }

     public void EnterLicensePackData()
     {
         licensePack.sendKeys("55");
     }

    public void clickFromDate()
    {
        datePicker1.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementById('validFromDate').setAttribute('value','12/3/2019');");
    }
    public void clickTillDate()
    {
        datePicker2.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementById('validTillDate').setAttribute('value','12/3/2022');");
    }

    public void clickBuyLcense()
    {
        buyLcense.click();
    }

    public void clickcloseBtn()
    {
        closeBtn.click();
    }


    public void clickRows() throws InterruptedException {
        try{
            for(int i=3;i<=12;i++)
            {
                WebElement e1=driver.findElement(By.xpath("(//*[@role='row'])[" + i + "]"));
                String msg=   e1.getAttribute("data-expirydate");
                System.out.println("message"+msg);
                if(msg.contains("Expired"))
                {
                    System.out.println("#####");
                    Actions actions=new Actions(driver);
                    int j=i+1;
                    WebElement e=driver.findElement(By.xpath("(//*[@role='row'])["+j+"]"));
                    actions.moveToElement(e).build().perform();
                    actions.click(e).build().perform();
                    Thread.sleep(2000);
                    clickPurchasLicense();
                    Thread.sleep(5000);
                }
                else  {
                    //firstRow.click();
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }





}

















