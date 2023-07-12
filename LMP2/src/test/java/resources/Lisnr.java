package resources;


import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;
import org.junit.runner.notification.RunListener;

/**RunListener
 * Created by Sandeep Arya
 */
public class Lisnr extends RunListener implements TestListener
{


    public void addError(Test test, Throwable throwable)
    {
        System.out.println("\n\t The error test is :" + test.getClass().getName() + "\n\t Caused by exception " + throwable.getMessage());
    }


    public void addFailure(Test test, AssertionFailedError assertionFailedError)
    {
        System.out.println("\n\t The Failure in test is :" + test.getClass().getName() + "\n\t Caused by exception " + assertionFailedError.getMessage());

    }

    public void endTest(Test test)
    {
        System.out.println("\n\t "+test.getClass().getName()+" Test Ended.");


    }

    public void startTest(Test test)
    {
        System.out.println("\n\t "+test.getClass().getName()+" Test Started.");


    }
}
