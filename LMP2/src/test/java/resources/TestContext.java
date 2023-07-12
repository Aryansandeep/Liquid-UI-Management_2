package resources;

/**
 * Created by Sandeep Arya
 */

public class TestContext
{
    private DriverContext driverContext;
    private PageObjectContext pageObjectContext;

    public TestContext()
    {
        driverContext = new DriverContext();
        pageObjectContext = new PageObjectContext(driverContext.initDriver());
    }
    public DriverContext getDriverContext()
    {
        return driverContext;
    }

    public PageObjectContext getPageObjectContext()
    {
        return pageObjectContext;
    }

}
