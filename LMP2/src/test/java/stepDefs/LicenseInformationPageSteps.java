package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LicenseInformationPage;
import pages.LoginPage;
import resources.ScreenShot;
import resources.TestContext;

import java.awt.*;
import java.io.IOException;

public class LicenseInformationPageSteps {

    TestContext testContext;
    LicenseInformationPage licenseInformationPage;
    WebDriverWait wait;
    WebDriver driver;



    public LicenseInformationPageSteps(TestContext context){
        testContext = context;
        licenseInformationPage=testContext.getPageObjectContext().getLicenseInformationPage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }


    @And("^I Click Any Account$")
    public void i_Click_Any_Account()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sorting_1']")));
        licenseInformationPage.selectAcct();

    }

    @Then("^I Click License Information tab$")
    public void iClickLiceInformation_tab()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='info-box brown-bg']")));
        licenseInformationPage.clickLicenseTab();
    }

    @Then("^Verify License Information Table$")
    public void vryLiceInfoTable()
    {
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"License Table");
        //   Assert.assertTrue(licenseInformationPage. vrypenalHandig().getText().contentEquals("Used License Table"));
    }
    @Then("^Search for valid mailid$")
    public void search_for_valid_mailid()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='search']")));
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.clickSerchTxt();
        licenseInformationPage.enterText();
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Email");
    }

    @Then("^Search for Company name$")
    public void search_for_Company_name()
    {
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterCompanyName();
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Company Name");
    }

    @Then("^Search for Device Identifier$")
    public void search_for_Device_Identifier()
    {
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterDeviceIdentifier();
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Device");

    }

    @Then("^Search for Status$")
    public void search_for_Status()
    {
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterActiveStatus();
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Active Status");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterInactiveStatus();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Inactive Status");
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterPendingStatus();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Pending Status");
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterRevokedStatus();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dataTables_scrollBody']")));
        ScreenShot.takeSS(driver,"Search by Revoked");

    }

    @Then("^Click any mail id and check License pack validity$")
    public void click_any_mail_id_and_check_License_pack_validity() throws InterruptedException {
        licenseInformationPage.clearSerchTxt();
        licenseInformationPage.enterActiveStatus();
        licenseInformationPage.clickActiveAccount();
        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='used_License']/tbody/tr[1]/td[1]")));
        ScreenShot.takeSS(driver,"Search by Revoked");

    }

    @Then("^Click Export Tab$")
    public void click_Export_Tab() throws IOException, InterruptedException, AWTException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-collection']")));
        licenseInformationPage.clickLicenseExport();
        licenseInformationPage.clickcopyBtn();
        licenseInformationPage.openNotePad2();
        licenseInformationPage.saveDataNotePad2();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-excel buttons-html5']")));
        licenseInformationPage.downloadExcelFle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        licenseInformationPage.downloadCvsFle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        licenseInformationPage.downloadPdfFle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        licenseInformationPage.downloadPrintFle();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        licenseInformationPage.closePrintTabe();

    }





}
