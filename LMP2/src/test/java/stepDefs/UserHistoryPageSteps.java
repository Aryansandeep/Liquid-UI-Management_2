package stepDefs;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import pages.PurchasedLicensePage;
import pages.UserHistoryPage;
import resources.TestContext;

public class UserHistoryPageSteps {

    TestContext testContext;
    UserHistoryPage userHistoryPage;
    WebDriverWait wait;
    WebDriver driver;


    public UserHistoryPageSteps(TestContext context) {
        testContext = context;
        userHistoryPage=testContext.getPageObjectContext().getUserHistoryPage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }

    @Then("^click any Existing Account$")
    public void click_any_Existing_Account()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='account_table']/tbody/tr[4]")));
        userHistoryPage.clickExtingAccount();

    }


    @Then("^Click License Information tab$")
    public void click_License_Information_tab(){
        WebDriverWait w=new WebDriverWait(driver,50);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='usedLicense']/div/div")));
        userHistoryPage.clicklicenseInform();

    }

    @Then("^click on user history tab$")
    public void click_on_user_history_tab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userHistory']/div/div")));
        userHistoryPage.clickUsrHistory();
        Thread.sleep(1000);
        userHistoryPage.clickScroll();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='hasDatepicker'])[1]")));
        userHistoryPage.clickDateTxt();
        userHistoryPage.changeDate();
        userHistoryPage.clickDateTxt2();
        userHistoryPage.changeDate2();
        userHistoryPage.clickgetUsrBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-collection']")));
        userHistoryPage.clickScroll();
        Thread.sleep(1000);
        userHistoryPage.clickback();





    }








}
