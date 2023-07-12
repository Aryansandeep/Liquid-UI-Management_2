package stepDefs;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SAPConnectionPage;
import pages.UserHistoryPage;
import resources.TestContext;

public class SAPConnectionPageSteps {

    TestContext testContext;
    UserHistoryPage userHistoryPage;
    SAPConnectionPage sapConnectionPage;
    WebDriverWait wait;
    WebDriver driver;


    public SAPConnectionPageSteps(TestContext context) {
        testContext = context;
        sapConnectionPage=testContext.getPageObjectContext().getSapConnectionPage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }


    @Then("^Click on SAP Connection Tab$")
    public void click_on_SAP_Connection_Tab()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='associateConnections']/div/div")));
        sapConnectionPage.clickSapConnetTab();
    }

    @Then("^Click on Create Connection button$")
    public void click_on_Create_Connection_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='dt-button'])[2]")));
        sapConnectionPage.clickCrtConntBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='add_connection_form_submit']")));
        sapConnectionPage.EnterDataSAPConnection();
        WebDriverWait w=new WebDriverWait(driver,50);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        sapConnectionPage.clickClosePop();
        Thread.sleep(1000);
        sapConnectionPage.clickBackBtn();
    }

    @Then("^Modify the Sap connection details$")
    public void modify_the_Sap_connection_details()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='btn btn-primary edit-connection'])[1]")));
        sapConnectionPage.clickCheckBox();
        sapConnectionPage.clickmodyfyBtn();
        sapConnectionPage.clearTxtFild();
        sapConnectionPage.EnterEditData();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='icon_check_alt2'])[1]")));
        sapConnectionPage.clickSubmitBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        sapConnectionPage.clickCloseBtn();

    }

    @Then("^Remove the sap connection$")
    public void remove_the_sap_connection()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Remove'])[2]")));
        sapConnectionPage.clickRemoveBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        sapConnectionPage.clickCloseBtn();
        sapConnectionPage.clickScroll();
    }

    @Then("^Click on Update Connection Button$")
    public void click_on_Update_Connection_Button()
    {
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Click here to update connection list']")));
       sapConnectionPage.clickUpdateConnectBtn();
    }

    @Then("^click close button in sap connection page$")
    public void click_close_button_in_sap_connection_page()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='license_extension_form_submit']")));
        sapConnectionPage.clickCloseBtn2();
    }








}
