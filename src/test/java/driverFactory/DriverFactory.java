package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    static {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver driver;

    public WebDriver getDriver() {
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    private void setDriver() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
