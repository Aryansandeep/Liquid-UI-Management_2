package stepDefs;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;
import resources.ScreenShot;
import resources.TestContext;

import java.awt.*;
import java.io.IOException;
//import utils.LoggerHelper;


/**
 * Created by Sandeep Arya
 */

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;
    WebDriverWait wait;
    WebDriver driver;



    public LoginPageSteps(TestContext context) throws AWTException {
        testContext = context;
        loginPage = testContext.getPageObjectContext().getLoginPage();
        wait = testContext.getDriverContext().initWait();
        driver = testContext.getDriverContext().initDriver();
    }

    @When("^I open the web browser and launch URL$")
    public void iOpenBrowUrl() throws Throwable
    {
       loginPage.getLoginLQUIDPage();
       Assert.assertTrue(loginPage.getimgLogo().isDisplayed());
      //scenarioDef.createNode(new GherkinKeyword("When"),"I open the web browser and launch URL");
        loginPage.vryfyUrl();
       //ScreenShot.takeSS(driver,"Open Liquid UI WEB");
        ScreenShot.takeSS(driver,this.getClass().getName());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Terms of Use')]")));
    }

    @Then("^Verify the LIQUIDUI for SAP ERP image$")
    public void vefyLiqUiImg()
    {
        loginPage.verifyimgLogo();
    }

    @Then("^Verify the Create user link$")
    public void verify_the_Create_user_link()
    {
        Assert.assertTrue(loginPage.vryCretUser().isDisplayed());
    }

    @Then("^Verify the Forgot Password link$")
    public void verifyForgotPwdLnk()
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Forgot Password?']")));
        loginPage.clickLinkForgotPwd();
      //  ScreenShot.takeSS(driver,"Forgot Password");
        ScreenShot.takeSS(driver,this.getClass().getName());
        loginPage.clickretForHomPage();

    }
    @Then("^Verify the Privacy Policy link$")
    public void verifyPrvacyPolcyLnk() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Privacy Policy')]")));
        loginPage.clickprivyPolicyLnk();
        ScreenShot.takeSS(driver,this.getClass().getName());
      // ScreenShot.takeSS(driver,"PRIVACY POLICY PAGE");
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='purechat-launcher-message']")));
      // Assert.assertTrue(superUserPage.getTxtMsg().getText().contentEquals("PRIVACY POLICY"));
        loginPage.switchto();
    }

    @Then("^Verify the Terms of Use link$")
    public void verifyTermUseLnk() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Terms of Use')]")));
        loginPage.clicktermUseLnk();
        ScreenShot.takeSS(driver,this.getClass().getName());
       //ScreenShot.takeSS(driver,"TERMS OF USE");
     // Assert.assertTrue(superUserPage.getTxtln().getText().contentEquals("TERMS OF USE"));
        loginPage.switchto();

    }

    @Then("^I should be able to enter valid \"([^\"]*)\" and valid \"([^\"]*)\" as Super Admin user$")
    public void loginAsValiUser(String emailid, String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'login_form_submit\']")));
        loginPage.getEmailId();
        loginPage.setEmailId(emailid);
     // Assert.assertTrue(loginPage.getBtnSignIn().isEnabled(), "\n\t Sign in button is not enabled");
        loginPage.getPassword();
        loginPage.setPassword(password);
        loginPage.clickBtnSignIn();
      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//div[@class='title'])[5]")));
      //ScreenShot.takeSS(driver,"SUCESSFULLY LOGIN");
        ScreenShot.takeSS(driver,this.getClass().getName());
    }

    @Then("^Edit profile$")
    public void edit_profile() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='username']")));
        loginPage.moveToUsername();
        loginPage.clickEditBtn();
        loginPage.clickNamTxt();
        loginPage.clickPhText();
        loginPage.clickUpdateBtn();
        Assert.assertTrue(loginPage.geterr().getText().contentEquals("Please fill all required (*) fields."));
        loginPage.enterInvalidData();
        loginPage.clickUpdateBtn();
        Assert.assertTrue(loginPage.geterr1().getText().contentEquals("Please enter a valid phone number."));
        loginPage.clickNamTxt();
        loginPage.clickPhText();
        loginPage.enterVlidData();
        loginPage.clickUpdateBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        loginPage.clickpopClsBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errorMsg']")));
        Assert.assertTrue(loginPage.geterr1().getText().contentEquals("Profile Update Successful"));
        Thread.sleep(1000);
        loginPage.moveToUsername();
        loginPage.clickChangePassword();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='change_password_form_submit']")));
        loginPage.clickChangePassBtn();
        Assert.assertTrue(loginPage.geterr1().getText().contentEquals("Please fill all required (*) fields."));
        loginPage.enterData();
        loginPage.clickChangePassBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        loginPage.clickCurrentPassNotMatch();
        loginPage.clearTxtField();
        loginPage.enterChangData();
        loginPage.clickChangePassBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeModal']")));
        loginPage.clickCurrentPassNotMatch();
        Thread.sleep(1000);
        loginPage.clickDashboard();

    }


    @Then("^I Sing Out the Super Admin user in Login page$")
    public void isingOutLoginPage()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='username']")));
        ScreenShot.takeSS(driver,"Log Out");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt-button buttons-collection']")));
        loginPage.moveToLogOut();
    }

    @Then("^I quit the browser$")
    public void iQuitTheBrowser()
    {
        testContext.getDriverContext().closseDriver();
    }


}
