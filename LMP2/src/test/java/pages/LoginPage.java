package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sandeep Arya
 */

public class LoginPage {

    WebDriver driver;




    String url = "https://testim.guixt.com";
    // Liquid Ui Home Page object

    @FindBy(xpath = ("//img[@class='img-responsive']"))//guixt
    private WebElement imgLogo;

    @FindBy(xpath = ("//img[@class='img-responsive']"))//guixt
    private WebElement verifyimgLogo;

    @FindBy(xpath = ("//*[@id=\'login_form_submit\']"))//guixt
    private WebElement btnSignIn;

    @FindBy(xpath = ("//*[@id=\'loginEmail\']"))//guixt
    private WebElement EmailId;

    @FindBy(xpath = ("//*[@id=\'password\']"))//guixt
    private WebElement Password;

    @FindBy(xpath = ("//*[text()='Forgot Password?']"))//guixt
    private WebElement lnkForgotPwd;

    @FindBy(xpath = ("//*[contains(text(),'Create User')]"))//guixt
    private WebElement vryCretUser;

    @FindBy(xpath = ("(//*[@href='javascript:void(0)'])[4]"))
    private WebElement loginForHomPage;//Login for Home page

    @FindBy(xpath = ("(//*[@href='javascript:void(0)'])[8]"))
    private WebElement retForHomPage;

    @FindBy(xpath = ("//*[contains(text(),'Privacy Policy')]"))//guixt
    private WebElement privyPolicy;

    @FindBy(xpath = ("//*[contains(text(),'Terms of Use')]"))//guixt
    private WebElement termUse;

    @FindBy(xpath = ("//h1[@class='column2_h2_grid']"))
    private WebElement vrifytermUsePage;

    @FindBy(xpath = ("//span[@class='username']"))//guixt
    private WebElement logOut;

    @FindBy(xpath = ("//a[contains(text(),'Log"))//guixt
    private WebElement clickLogOut;

    @FindBy(xpath = ("//*[@class='column2_h2_grid']"))
    private WebElement TxtMsg;

    @FindBy(xpath = ("//*[@class='column2_h2_grid']"))
    private WebElement Txtln;

    @FindBy(xpath = ("//*[@class='text-center']"))//guixt
    private WebElement errTxtMsg;

    @FindBy(xpath = ("//*[@id='title']"))
    private WebElement vryDashboard;

    @FindBy(xpath = ("//*[@class='username']"))
    private WebElement username;

    @FindBy(xpath=("//*[@id='editProfile_form_submit']"))
    private WebElement editBtn;

    @FindBy(xpath = ("//*[@type='text']"))//guixt
    private WebElement namTxt;

    @FindBy(xpath = ("//*[@id='phone']"))//guixt
    private WebElement phText;

    @FindBy(xpath=("//*[@id='update_userprofile_form_submit']"))
    private WebElement updateBtn;

    @FindBy(xpath = ("//*[@id='errorMsg']"))
    private WebElement err1;

    @FindBy(xpath = ("(//*[@href='javascript:void(0)'])[2]"))
    private WebElement changePassword;

    @FindBy(xpath = ("//*[@id='change_password_form_submit']"))//guixt
    private WebElement changePassBtn;

    @FindBy(xpath = ("//*[@id='current_password']"))
    private WebElement currPassTxt;

    @FindBy(xpath = ("//*[@id='password']"))
    private WebElement newPassTxt;

    @FindBy(xpath = ("//*[@id='password-confirm']"))
    private WebElement comfimPassTxt;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement currentPassNotMatch;

    @FindBy(xpath = ("//*[@class='fa fa-suitcase']"))
    private WebElement selctAccount;

    @FindBy(xpath=("//*[@class='arrow']"))
    private WebElement backarro;

    @FindBy(xpath=("//*[text()='Dashboard']"))
    private WebElement dashboard;

    @FindBy(xpath = ("//*[@id='closeModal']"))
    private WebElement popClsBtn;

    @FindBy(xpath = ("(//*[@class='text-center'])[1]"))
    private WebElement err;


    public LoginPage(WebDriver driver) throws AWTException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getLoginLQUIDPage() {
        driver.manage().window().maximize();
        driver.get(url);
        //Waiting till the xpath of the City image as it is likely the last one to load in the page.
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type='submit'])[1]")));
    }

    public WebElement getimgLogo() {
        return imgLogo;
    }

    public void verifyimgLogo() {
        getimgLogo().isDisplayed();
    }

    public WebElement getBtnSignIn() {
        return btnSignIn;
    }

    public WebElement getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailid) {
        getPassword().clear();
        getEmailId().sendKeys(emailid);
    }

    public WebElement getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public WebElement getTxtMsg() {
        return TxtMsg;
    }

    public WebElement getTxtln() {
        return Txtln;
    }

    public WebElement geterrTxtMsg() {
        return errTxtMsg;
    }

    public void clickBtnSignIn() {
        btnSignIn.click();
    }

    public void clickLinkForgotPwd() {
        lnkForgotPwd.click();
    }

    public void clickprivyPolicyLnk() {
        privyPolicy.click();
    }

    public void clicktermUseLnk() {
        termUse.click();
    }

    public WebElement vryCretUser() {
        return vryCretUser;
    }

    public void clickloginForHomPage() {
        loginForHomPage.click();
    }

    public void clickretForHomPage() {
        retForHomPage.click();
    }

    public void switchto()
    {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    public void getvrifytermUsePage()
    {
        return;
    }

    public void moveToLogOut() {
        Actions act = new Actions(driver);
        WebElement pro = driver.findElement(By.xpath("//span[@class='username']"));
        act.moveToElement(pro).build().perform();
        WebElement lg = driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
        act.moveToElement(lg).click().build().perform();

    }

    public void vryfyUrl()
    {
        String URL = driver.getCurrentUrl();

    }

    public WebElement getvryDashboard()
    {
        return vryDashboard;
    }

    public void moveToUsername()
    {
        {
            Actions act = new Actions(driver);
            WebElement pro = driver.findElement(By.xpath("//span[@class='username']"));
            act.moveToElement(pro).build().perform();
            WebElement lg = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
            act.moveToElement(lg).click().build().perform();
        }

    }

    public void clickEditBtn()
    {
        editBtn.click();
    }

    public void clickNamTxt()
    {
        namTxt.click();
        namTxt.clear();
    }

    public void clickPhText()
    {
        phText.click();
        phText.clear();
    }

    public void clickUpdateBtn()
    {
        updateBtn.click();
    }

    public WebElement geterr1()
    {
        return err1;
    }

    public void enterInvalidData()
    {
        namTxt.sendKeys("Ashish");
        phText.sendKeys("abc");
    }
    public void enterVlidData()
    {
        namTxt.click();
        namTxt.sendKeys("Ashish");
        phText.click();
        phText.sendKeys("9826404037");

    }

    public void clickChangePassword()
    {
        changePassword.click();
    }

    public void clickChangePassBtn()
    {
        changePassBtn.click();
    }

    public void enterData()
    {
        currPassTxt.click();
        currPassTxt.sendKeys("ab");
        newPassTxt.click();
        newPassTxt.sendKeys("ab");
        comfimPassTxt.click();
        comfimPassTxt.sendKeys("ab");
    }

    public void  clickCurrentPassNotMatch()
    {
        currentPassNotMatch.click();
    }

    public void clearTxtField()
    {

        currPassTxt.clear();
        newPassTxt.clear();
        comfimPassTxt.clear();
    }

    public void enterChangData()
    {
        currPassTxt.sendKeys("123");
        newPassTxt.sendKeys("123");
        comfimPassTxt.sendKeys("123");
    }

    public void clickSelectAccount()
    {
        Actions select=new Actions(driver);
        WebElement selAcc=selctAccount;
        select.moveToElement(selAcc).click().perform();
    }

    public void clickDashboard()
    {
        Actions a=new Actions(driver);
        WebElement account=dashboard;
        a.moveToElement(account).click().build().perform();
    }

    public void clickpopClsBtn()
    {
        popClsBtn.click();
    }


    public WebElement geterr()
    {
        return err;
    }


}