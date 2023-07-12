package stepDefs;

import com.aventstack.extentreports.ExtentTest;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UploadCsvFilePage;
import resources.TestContext;

import java.awt.*;

public class UploadCsvFilePageSteps {


    TestContext testContext;
    UploadCsvFilePage uploadCsvFilePage;
    WebDriverWait wait;
    WebDriver driver;
    ExtentTest scenarioDef;
    // LoggerHelper logger;

    public UploadCsvFilePageSteps(TestContext context)
    {
        testContext = context;
        uploadCsvFilePage = testContext.getPageObjectContext().getUploadCsvFilePage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }

    @Then("^click Add user tab$")
    public void click_Add_user_tab()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='title'])[5]")));
        uploadCsvFilePage.clickAddUsr();
    }

    @Then("^Click Upload from CSV file$")
    public void click_Upload_from_CSV_file() throws AWTException, InterruptedException
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='uploadFile']")));
        uploadCsvFilePage.clkUpLoadCvs();
        uploadCsvFilePage.clickSavBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        uploadCsvFilePage.clickPopBtn();
    }

    @Then("^verify Error All users were already uploaded$")
    public void verify_Error_All_users_were_already_uploaded() throws AWTException, InterruptedException {
        uploadCsvFilePage.uploadCVSFile();
        uploadCsvFilePage.clickSavBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        uploadCsvFilePage.clickPopBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='add_users']/tbody/tr/td")));
    }

    @Then("^click Sing Out the Super Admin  Login page$")
    public void click_Sing_Out_the_Super_Admin_Login_page()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='username']")));
        uploadCsvFilePage.moveToLogOut();
    }





}
