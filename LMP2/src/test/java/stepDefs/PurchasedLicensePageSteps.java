package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import pages.PurchasedLicensePage;
import resources.TestContext;

import java.rmi.server.ExportException;

public class PurchasedLicensePageSteps {

    TestContext testContext;
    CreateAccountPage createAccountPage;
    PurchasedLicensePage purchasedLicensePage;
    WebDriverWait wait;
    WebDriver driver;


    public PurchasedLicensePageSteps(TestContext context) {
        testContext = context;
        purchasedLicensePage = testContext.getPageObjectContext().getPurchasedLicensePage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }



    @Then("^Select One account From Exsisting Account$")
    public void select_One_account_From_Exsisting_Account()
    {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='sorting_1'])[3]")));
      purchasedLicensePage.clickExistingAccount();

    }

    @Then("^Click on Purchased license tab$")
    public void click_on_Purchased_license_tab()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='info-box blue-bg']")));
        purchasedLicensePage.clickPurchasLicense();
    }

    @Then("^Click on Buy License tab$")
    public void click_on_Buy_License_tab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='info-box green-bg'])[2]")));
        purchasedLicensePage.clickBuyLicense();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='licenseCount']")));
        purchasedLicensePage. clickLicensePack();
        purchasedLicensePage.EnterLicensePackData();
        purchasedLicensePage.clickFromDate();
        purchasedLicensePage.clickTillDate();
        purchasedLicensePage.clickBuyLcense();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        purchasedLicensePage.clickcloseBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='sorting_1'])[2]")));
        purchasedLicensePage.clickRows();

    }







}