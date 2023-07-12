package stepDefs;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CreateAccountPage;
import resources.ScreenShot;
import resources.TestContext;

import java.awt.*;
import java.io.IOException;

public class CreateAccountPageSteps {


    TestContext testContext;
    CreateAccountPage createAccountPage;
    WebDriverWait wait;
    WebDriver driver;



    public CreateAccountPageSteps(TestContext context)  {
        testContext = context;
        createAccountPage = testContext.getPageObjectContext().getCreateAccountPage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }


    @Then("^verify Admin Dashboard$")
    public void verify_Admin_Dashboard()
    {
        {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='title']")));
            Assert.assertTrue(createAccountPage.getvryDashboard().getText().contentEquals("Dashboard"));
            ScreenShot.takeSS(driver,this.getClass().getName());
        }
    }

    @Then("^Click an arrow$")
    public void click_an_arrow()
        {
            createAccountPage.clickarrow();
        }

    @Then("^Click Create Account Tab$")
    public void verify_Create_Account_Tab() throws InterruptedException {
          Thread.sleep(1000);
          createAccountPage.clickCreateAccount();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='company']")));
          createAccountPage.readExcelData();
          createAccountPage.clickSubmitBtn();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
          createAccountPage.clickpopClsBtn();
          Thread.sleep(1000);
          createAccountPage.clickDashboard();

    }

    @Then("^verify search text field$")
    public void verify_search_text_field()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='search']")));
        createAccountPage.clickSearchTxt();
        createAccountPage.enterCompanyName();
        createAccountPage.clearsearchTxt();
        createAccountPage.enterCompanyId();
    }

    @Then("^click Edit Button$")
    public void click_Edit_Button() throws InterruptedException {
        createAccountPage.clickEdtBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='company']")));
        createAccountPage.clearTxt8();
        createAccountPage.ensertwongData();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='btn btn-primary'])[1]")));
        createAccountPage.clickDetailsBtn();
        ScreenShot.takeSS(driver,this.getClass().getName());
        Assert.assertTrue(createAccountPage.geterr().getText().contentEquals("Please enter a valid ZIP code"));
        createAccountPage.clerTxtComny();
        createAccountPage.clickDetailsBtn();
        ScreenShot.takeSS(driver,this.getClass().getName());
        Assert.assertTrue(createAccountPage.geterr().getText().contentEquals("Please fill all required (*) fields."));
        createAccountPage.clearTxt();
        createAccountPage.EnterDataTxt();
        ScreenShot.takeSS(driver,this.getClass().getName());
        createAccountPage.clickDetailsBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        createAccountPage.clickpopClsBtn();
        // FluentWait w2=new FluentWait(driver).pollingEvery(10, TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
        // w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='account_form_submit'])[2]")));
        WebDriverWait w=new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='account_form_submit'])[2]")));
        Thread.sleep(1000);
        createAccountPage.clickClsBtn();
    }
    @Then("^verify Edit Account$")
    public void verify_Edit_Account()
    {

    }

    @Then("^verify Export Tab$")
    public void verify_Export_Tab() throws IOException, InterruptedException, AWTException
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-collection']")));
        Assert.assertTrue(createAccountPage.getexport().isDisplayed());
        createAccountPage.clickExport();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-copy buttons-html5']")));
        createAccountPage.clickCpyBtn();
        createAccountPage.openNotePad();
        createAccountPage.saveDataNotePad();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-excel buttons-html5']")));
        createAccountPage.downloadExcelFile();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        createAccountPage.downloadCvsFile();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        createAccountPage.downloadPdfFile();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-csv buttons-html5']")));
        createAccountPage.downloadPrint();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        createAccountPage.closePrintTab();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='panel-heading']")));
        createAccountPage.clickDashboard();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='arrow']")));
    }









}
