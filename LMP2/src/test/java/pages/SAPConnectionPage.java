package pages;

import Utils.Xls_Reader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SAPConnectionPage {

    WebDriver driver;
    Xls_Reader reader;

    @FindBy(xpath = ("//*[@id='associateConnections']/div/div"))
    private WebElement sapconnectionTab;

    @FindBy(xpath = ("//*[@title='Click here to update connection list']"))
    private WebElement updateConnectionbtn;

    @FindBy(xpath = ("(//*[@class='dt-button'])[2]"))
    private WebElement crtconntBtn;

    @FindBy(xpath = ("//*[@id='description']"))
    private WebElement description;

    @FindBy(xpath = ("//*[@id='group']"))
    private WebElement server;

    @FindBy(xpath = ("//*[@id='instanceNumber']"))
    private WebElement instancenumber;

    @FindBy(xpath = ("//*[@id='client']"))
    private WebElement client;

    @FindBy (xpath = ("//*[@id='saprouter']"))
    private WebElement saprouter;

    @FindBy(xpath = ("//*[@name='add_connection_form_submit']"))
    private WebElement submit;

    @FindBy(xpath = ("//*[@value='Back']"))
    private WebElement back;

    @FindBy(xpath = ("(//*[@title='Modify'])[1]"))
    private WebElement modifybtn;

    @FindBy(xpath = ("(//*[@role='row'])[5]/td[5]"))
    private WebElement editclientfeild;

    @FindBy(xpath = ("(//*[@class='icon_check_alt2'])[1]"))
    private WebElement rightmark;

    @FindBy(xpath = ("(//*[@title='Remove'])[2]"))
    private WebElement remove;

    @FindBy(xpath = ("(//*[@class='fa fa-qrcode'])[2]"))
    private WebElement qrcode;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement closePop;

    @FindBy(xpath = ("//*[@id='license_extension_form_submit']"))
    private WebElement close2;

    @FindBy(xpath = ("(//*[@id='location-select-all'])[1]"))
    private WebElement slectallcheckbox;

    @FindBy(xpath = ("(//*[@class='btn btn-primary'])[2]"))
    private WebElement backBtn;

    @FindBy(xpath=("//*[@title='Click here to update connection list']"))
    private WebElement updateconnectBtn;

    @FindBy(xpath = ("(//*[@class='btn btn-primary edit-connection'])[1]"))
    private WebElement modyfyBtn;

    @FindBy(xpath = ("(//*[@name='checkbox'])[1]"))
    private WebElement checkBox;

    @FindBy(xpath = ("//*[@id='associate_Connections']/tbody/tr/td[6]/input"))
    private WebElement sapRouterTxt;

    @FindBy(xpath = ("(//*[@class='icon_check_alt2'])[1]"))
    private WebElement submitBtn;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement closeBtn;

    @FindBy(xpath = ("(//*[@title='Remove'])[2]"))
    private WebElement removeBtn;

    @FindBy(xpath = ("//*[@id='license_extension_form_submit']"))
    private WebElement closeBtn2;


    public SAPConnectionPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSapConnetTab()
    {
        sapconnectionTab.click();
    }

    public void clickCrtConntBtn()
    {
        crtconntBtn.click();
    }

    public void clearfields()
    {
        description.clear();
        server.clear();
        instancenumber.clear();
        client.clear();
        saprouter.clear();
    }

    public void EnterDataSAPConnection()
    {
        try {
            reader = new Xls_Reader("E:\\LMP2\\Test_Data_Guixt\\SAPconnection.xlsx");
            int rowCount = reader.getRowCount("SAPConnection");
            for (int rowNum = 2; rowNum <= rowCount; rowNum++)
            {
                clearfields();
                String Desc = reader.getCellData("SAPConnection", "Description", rowNum);
                description.sendKeys(Desc);
                String serve = reader.getCellData("SAPConnection", "Server", rowNum);
                server.sendKeys(serve);
                String insta = reader.getCellData("SAPConnection", "Instance", rowNum);
                instancenumber.sendKeys(insta);
                String clien = reader.getCellData("SAPConnection", "Client", rowNum);
                client.sendKeys(clien);
                String sap = reader.getCellData("SAPConnection", "sapRouter", rowNum);
                saprouter.sendKeys(sap);
                submit.click();
            }
        }
        catch (Exception e)
        {//clickBackbtn();
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connection Added']")));
        }
    }

      public void clickClosePop()
      {
          closePop.click();
      }

      public void clickBackBtn()
      {
          backBtn.click();
      }

      public void clickCheckBox()
      {
          checkBox.click();
      }

      public void clickmodyfyBtn()
      {
          modyfyBtn.click();
      }

    public void clearTxtFild()
    {
        description.clear();
        server.clear();
        instancenumber.clear();
        client.clear();
        sapRouterTxt.clear();
    }

    public void EnterEditData()
    {
        description.sendKeys("juneau");
        server.sendKeys("192.168.01.22");
        instancenumber.sendKeys("27");
        client.sendKeys("200");
        sapRouterTxt.sendKeys("192.168.03.11");

    }

    public void clickSubmitBtn()
    {
        submitBtn.click();
    }

    public void clickCloseBtn()
    {
        closeBtn.click();
    }

    public void clickRemoveBtn()
    {
        removeBtn.click();
    }

    public void clickScroll()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
    }

      public void clickUpdateConnectBtn()
      {
          updateconnectBtn.click();
      }

      public void clickCloseBtn2()
      {
          closeBtn2.click();
      }







}
