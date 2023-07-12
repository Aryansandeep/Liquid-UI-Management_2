package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

public class ExtentReport {
    public WebDriver driver;
    public ExtentReports extent;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public static String reportLocation = "C:\\Users\\sandeep\\IdeaProjects\\LIQUID_UI\\Report";
    String fileName = reportLocation + "extentreport.html";

    public void ExtentReport()
    {
        //First is to create Extent Reports
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Test report for basic");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test reort");
        extent.attachReporter(htmlReporter);
    }
/*
    public void ExtentReportScreenshot()throws IOException {

        var scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scr.toPath(),new File(reportLocation+"screenshot.png").toPath());
    }
*/

    public void flushReport()
    {
        extent.flush();
    }

}
