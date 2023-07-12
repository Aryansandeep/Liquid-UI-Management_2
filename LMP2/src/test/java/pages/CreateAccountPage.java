package pages;

import Utils.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.ScreenShot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class CreateAccountPage {

    WebDriver driver;
    Xls_Reader reader;
    public int flag = 0;


    @FindBy(xpath = ("//*[@id='title']"))
    private WebElement vryDashboar;

    @FindBy(xpath = ("//*[@class='arrow']"))
    private WebElement arrow;

    @FindBy(xpath = ("//*[@class='fa fa-building-o']"))
    private WebElement cretAccnt;


    @FindBy(xpath = ("//*[@title='Contact Number']"))
    private WebElement contactNumberTxt;

    @FindBy(xpath = ("//*[@title='Address Line 1']"))
    private WebElement addressLine1Txt;

    @FindBy(xpath = ("//*[@title='Address Line 2']"))
    private WebElement addressLine2Txt;

    @FindBy(xpath = ("//*[@title='Location']"))
    private WebElement EnterlocationTxt;

    @FindBy(xpath = ("//*[@id='country']"))
    private WebElement countryTxt;

    @FindBy(xpath = ("//*[@title='State']"))
    private WebElement stateTxt;

    @FindBy(xpath = ("//*[@title='Company Name']"))
    private WebElement companyNameTxt;

    @FindBy(xpath = ("//*[@title='City']"))
    private WebElement cityTxt;

    @FindBy(xpath = ("//*[@title='Zip']"))
    private WebElement zipCodeTxt;

    @FindBy(xpath = ("//*[@title='Email Address']"))
    private WebElement EmailAdressTxt;

    @FindBy(xpath = ("//*[@id='licenseCount']"))
    private WebElement licenseCountTxt;

    @FindBy(xpath = ("//*[@id='validFromDate']"))
    private WebElement vaidFromDateTxt;

    @FindBy(xpath = ("//*[@id='validTillDate']"))
    private WebElement vaidTillDateTxt;

    @FindBy(xpath = "//*[@id='account_form_submit']")
    private WebElement submitbutton;

    @FindBy(xpath = ("(//*[@class='row'])[3]/child::*[1]"))
    public WebElement ErrorMessage1;

    @FindBy(xpath = ("//*[contains(text(),'Valid Contact Number!')]"))
    public WebElement ErrorMessage2;

    @FindBy(xpath = ("//*[contains(text(),'valid ZIP code')]"))
    public WebElement ErrorMessage3;

    @FindBy(xpath = ("//*[contains(text(),'valid email address')]"))
    public WebElement ErrorMessage4;

    @FindBy(xpath = ("//*[@class='fa fa-home']"))
    private WebElement dashboard;

    @FindBy(xpath = ("//*[@type='search']"))
    public WebElement searchfield;

    @FindBy(xpath = ("//*[@id='licenseCount']"))
    private WebElement licenseCount;

    @FindBy(xpath = ("//*[@title='Start date for License pack']"))
    private WebElement fromDate;

    @FindBy(xpath = ("//*[@title='End date for License pack']"))
    private WebElement toDate;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement popClsBtn;


    @FindBy(xpath = ("//*[@type='search']"))
    private WebElement searchTxt;

    @FindBy(xpath = ("//*[@class='role btn btn-success']"))
    private WebElement edtBtn;

    @FindBy(xpath = ("//*[@id='zip']"))
    private WebElement Txt8;

    @FindBy(xpath = ("(//*[@class='btn btn-primary'])[1]"))
    private WebElement detailsBtn;

    @FindBy(xpath = ("(//*[@class='text-center'])[1]"))
    private WebElement err;

    @FindBy(xpath = ("//*[@name='company']"))
    private WebElement Txt;

    @FindBy(xpath = ("//*[@id='contactno']"))
    private WebElement Txt1;

    @FindBy(xpath = ("//*[@id='address1']"))
    private WebElement Txt2;

    @FindBy(xpath = ("//*[@id='address2']"))
    private WebElement Txt3;

    @FindBy(xpath = ("//*[@id='location']"))
    private WebElement Txt4;

    @FindBy(xpath = ("//*[@id='country']"))
    private WebElement Txt5;

    @FindBy(xpath = ("//*[@id='administrative_area_level_1']"))
    private WebElement Txt6;

    @FindBy(xpath = ("//*[@id='locality']"))
    private WebElement Txt7;

    @FindBy(xpath = ("//*[@class='iti-arrow']"))
    private WebElement arro;

    @FindBy(xpath = ("(//*[@class='country-name'])[100]"))
    private WebElement ind;

    @FindBy(xpath = ("//*[@name='contactno']"))
    private WebElement Txt0;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement popClsBtn2;

    @FindBy(xpath = ("(//*[@id='account_form_submit'])[2]"))
    private WebElement clsBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-collection']"))
    private WebElement export;

    @FindBy(xpath = ("//*[@class='dt-button buttons-copy buttons-html5']"))
    private WebElement cpyBtn;

    @FindBy(xpath = ("//*[@class='dt-button buttons-excel buttons-html5']"))
    private WebElement excel;

    @FindBy(xpath = ("//*[@class='dt-button buttons-csv buttons-html5']"))
    private WebElement cvs;

    @FindBy(xpath = ("//*[@class='dt-button buttons-pdf buttons-html5']"))
    private WebElement pdf;

    @FindBy(xpath = ("//*[@class='dt-button buttons-print']"))
    private WebElement print;


    public CreateAccountPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getvryDashboard() {
        return vryDashboar;
    }

    public void clickarrow() {
        Actions act = new Actions(driver);
        WebElement pro = arrow;
        act.moveToElement(pro).click().build().perform();
    }

    public void clickCreateAccount() {
        cretAccnt.click();
    }


    public WebElement getCompantName() {
        return companyNameTxt;
    }

    public void setCompanyName(String companyname) {
        getCompantName().sendKeys(companyname);
    }

    public WebElement getContactNumber() {
        return contactNumberTxt;
    }

    public void setcontactNumber(String contactNumber) {
        getContactNumber().sendKeys(contactNumber);
    }

    public WebElement getAddessLine1() {
        return addressLine1Txt;
    }

    public void setAddessLine1(String addressline1) {
        getAddessLine1().sendKeys(addressline1);
    }

    public WebElement getAddessLine2() {
        return addressLine2Txt;
    }

    public void setAddessLine2(String addressline2) {
        getAddessLine2().sendKeys(addressline2);
    }

    public WebElement getLocation() {
        return EnterlocationTxt;
    }

    public void setLocation(String location) {
        getLocation().sendKeys(location);
    }

    public WebElement getCountry() {
        return countryTxt;
    }

    public void setCountry(String country) {
        getCountry().sendKeys(country);
    }

    public WebElement getState() {
        return stateTxt;
    }

    public void setState(String state) {
        getState().sendKeys(state);
    }

    public WebElement getCity() {
        return cityTxt;
    }

    public void setcity(String city) {
        getCity().sendKeys(city);
    }

    public WebElement getZipCode() {
        return zipCodeTxt;
    }

    public void setZipCode(String zip) {
        getZipCode().sendKeys(zip);
    }

    public WebElement getAccountEmailAddress() {
        return EmailAdressTxt;
    }

    public void setAccountEmailAddress(String email) {
        getAccountEmailAddress().sendKeys(email);
    }

    public WebElement clickLicenseCount() {
        return licenseCount;
    }

    public void setLicenseCount(String lic) {
        clickLicenseCount().sendKeys(lic);
    }

    public WebElement clickFromDate() {
        return fromDate;
    }

    public void setclickFromdate(String from)
    {
        fromDate.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('validFromDate').setAttribute('value','" + from + "');");

    }

    public WebElement clickToDate() {
        return toDate;
    }

    public void setClickToDate(String to) {
        toDate.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('validTillDate').setAttribute('value','" + to + "');");

    }

    public void clickSubmitBtn()
    {
        submitbutton.click();
    }

    public void clickpopClsBtn()
    {
        popClsBtn.click();
    }



    public void CreateAccountClearFields() {
        companyNameTxt.clear();
        contactNumberTxt.clear();
        addressLine1Txt.clear();
        addressLine2Txt.clear();
        EnterlocationTxt.clear();
        countryTxt.clear();
        stateTxt.clear();
        cityTxt.clear();
        zipCodeTxt.clear();
        EmailAdressTxt.clear();
        licenseCount.clear();
    }

    public void readExcelData() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 40);
        reader = new Xls_Reader("./Test_Data_Guixt/AccountCreationData.xlsx");
        // parameterizatioin
        int rowCount = reader.getRowCount("Sheet1");
        int colcount = reader.getColumnCount("Sheet1");
        for (int rowNum = 2; rowNum <= rowCount; rowNum++)
        {

            companyNameTxt.clear();
            String companyName = reader.getCellData("Sheet1", "Company name", rowNum);
            setCompanyName(companyName);

            contactNumberTxt.clear();
            String contactnumber = reader.getCellData("Sheet1", "Phone number", rowNum);
            setcontactNumber(contactnumber);

            addressLine1Txt.clear();
            String adress = reader.getCellData("Sheet1", "Address1", rowNum);
            setAddessLine1(adress);

            addressLine2Txt.clear();
            String adress2 = reader.getCellData("Sheet1", "Address2", rowNum);
            setAddessLine2(adress2);

            EnterlocationTxt.clear();
            String location = reader.getCellData("Sheet1", "Location", rowNum);
            setLocation(location);

            countryTxt.clear();
            String country = reader.getCellData("Sheet1", "Country", rowNum);
            setCountry(country);

            stateTxt.clear();
            String state = reader.getCellData("Sheet1", "State", rowNum);
            setState(state);

            cityTxt.clear();
            String city = reader.getCellData("Sheet1", "City", rowNum);
            setcity(city);

            zipCodeTxt.clear();
            String zip = reader.getCellData("Sheet1", "Zip code", rowNum);
            setZipCode(zip);

            EmailAdressTxt.clear();
            String mail = reader.getCellData("Sheet1", "Email", rowNum);
            setAccountEmailAddress(mail);

            licenseCount.clear();
            String licen = reader.getCellData("Sheet1", "licensecount", rowNum);
            setLicenseCount(licen);


            String fromdate = reader.getCellData("Sheet1", "From date", rowNum);
            setclickFromdate(fromdate);

            String todate = reader.getCellData("Sheet1", "Todate", rowNum);
            setClickToDate(todate);
          //  clickSubmitBtn();
        }
/*
             if (ErrorMessage1.isDisplayed())
             {
                 CreateAccountClearFields();
                 ScreenShot.takeSS(driver,"Create Account 2");
             }
             else
             {
                 flag=1;
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
                 clickpopClsBtn();
                 Thread.sleep(1000);
                 clickDashboard();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='search']")));
                 setSerachfeild(companyName);
             }

         }

 */



        }


        public void clickSearchTxt ()
        {
            searchTxt.click();
        }

        public void clearsearchTxt ()
        {
            searchTxt.clear();
        }

        public void enterCompanyName ()
        {
            searchTxt.sendKeys("01082018");
        }

        public void enterCompanyId ()
        {
            searchTxt.sendKeys("verizon");
        }

        public void clickEdtBtn ()
        {

            edtBtn.click();
        }


        public void clearTxt8 ()
        {
            Txt8.clear();
        }

        public void ensertwongData ()
        {
            Txt8.sendKeys("ssss");
        }


        public void clickDetailsBtn ()
        {
            detailsBtn.click();
        }

        public WebElement geterr ()
        {
            return err;
        }

        public void clerTxtComny ()
        {
            Txt.clear();
        }

        public void clearTxt ()
        {
            Txt.clear();
            Txt1.clear();
            Txt2.clear();
            Txt3.clear();
            Txt5.clear();
            Txt6.clear();
            Txt7.clear();
            Txt8.clear();
        }

        public void EnterDataTxt () throws InterruptedException
        {
            Txt.sendKeys("verizon");
            arro.click();
            WebDriverWait w = new WebDriverWait(driver, 20);
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='country-name'])[100]")));
            Actions mouse = new Actions(driver);
            mouse.moveToElement(ind).click().build().perform();
            Txt1.sendKeys("Hyderabad");
            Txt2.sendKeys("Hyderabad");
            Txt3.sendKeys("Kazitpet");
            Txt4.sendKeys("India");
            Txt5.sendKeys("India");
            Txt6.sendKeys("Teleangana");
            Txt7.sendKeys("Hyderabad");
            Txt8.sendKeys("506003");
            Txt0.sendKeys("919826404038");

        }

        public void clickpopClsBtn2 ()
        {
            popClsBtn.click();
        }


        public void clickClsBtn ()
        {
            clsBtn.click();
        }

        public WebElement getexport ()
        {
            return export;
        }


        public void clickExport ()
        {
            export.click();
        }
        public void clickCpyBtn ()
        {
            cpyBtn.click();
        }


        public void openNotePad () throws IOException, InterruptedException {
            Runtime rs = Runtime.getRuntime();
            try {
                rs.exec("notepad");
            } catch (IOException e) {

            }
        }

        public void saveDataNotePad () throws AWTException, InterruptedException
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

        public void downloadExcelFile ()
        {
            excel.click();
        }

        public void downloadCvsFile ()
        {
            cvs.click();
        }

        public void downloadPdfFile ()
        {
            pdf.click();
        }

        public void downloadPrint ()
        {
            print.click();
        }

        public void closePrintTab ()
        {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        }


        public void clickDashboard ()
        {
            Actions a = new Actions(driver);
            WebElement account = dashboard;
            a.moveToElement(account).click().build().perform();
        }

        public void clearPhTxt ()
        {
            Txt1.clear();
        }


    }

