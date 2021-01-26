package steps;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import page.HomePage;


import java.util.concurrent.TimeUnit;

public class Hooks extends DriverFactory{
    private HomePage homePage;
    private DriverFactory driverFactory;

    public Hooks(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Before
    public void InitialiseTest(){
        driver = driverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        homePage.goToHomePage();
    }

    @After
    public void TearDownTest() {
        driver.close();
    }
}
