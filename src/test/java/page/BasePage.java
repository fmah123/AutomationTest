package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30 );

    }


    public void FindAndType(String text, By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.sendKeys(text);
    }

    public void FindAndType(Keys key, By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.sendKeys(key);
    }

    public void WaitAndClick(By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    public void scrollDownPage(int howManyTimes){
        for(int i = 0; i < howManyTimes; i++){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(-250,0)","");
        }
    }

    public void scrollUpPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(document.body.scrollheight,0)");
    }


}
