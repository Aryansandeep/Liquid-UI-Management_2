package resources;

import org.openqa.selenium.WebDriver;
import pages.*;

import java.awt.*;

/**
 * Created by Sandeep Arya
 */

public class PageObjectContext {

    private WebDriver driver;
    private LoginPage loginPage;
    private CreateAccountPage createAccountPage;
    private PurchasedLicensePage purchasedLicensePage;
    private LicenseInformationPage licenseInformationPage;
    private UserHistoryPage userHistoryPage;
    private SAPConnectionPage sapConnectionPage;
    private UploadCsvFilePage uploadCsvFilePage;


    public PageObjectContext(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() throws AWTException {
        return (loginPage == null) ?
                loginPage = new LoginPage(driver) : loginPage;
    }

    public CreateAccountPage getCreateAccountPage() {
        return (createAccountPage == null) ?
                createAccountPage = new CreateAccountPage(driver) : createAccountPage;
    }

    public PurchasedLicensePage getPurchasedLicensePage(){
        return (purchasedLicensePage== null)?
                purchasedLicensePage=new PurchasedLicensePage(driver):purchasedLicensePage;
    }

    public LicenseInformationPage getLicenseInformationPage()  {
        return (licenseInformationPage==null)?
                licenseInformationPage=new LicenseInformationPage(driver):licenseInformationPage;

    }

   public UserHistoryPage getUserHistoryPage()
   {
       return (userHistoryPage==null)?
               userHistoryPage=new UserHistoryPage(driver):userHistoryPage;

   }

   public SAPConnectionPage getSapConnectionPage()
   {
       return (sapConnectionPage==null) ?
               sapConnectionPage=new SAPConnectionPage(driver):sapConnectionPage;
   }


    public UploadCsvFilePage getUploadCsvFilePage()
    {
        return(uploadCsvFilePage==null)?
                uploadCsvFilePage=new UploadCsvFilePage(driver):uploadCsvFilePage;
    }

}









