package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage extends BasePage {

    private By INFINITE_SCROLL_LINK = By.cssSelector("a[href*=oll]");

    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }

    public void goToInfiniteScrollPage(){
        WaitAndClick(INFINITE_SCROLL_LINK);
    }

    public void scrollPageDownTwice(){
        scrollDownPage(2);
    }

    public void scrollPageToTop(){
        scrollUpPage();
    }

    public verifyPageText getTitleText(){
        return new verifyPageText(driver.findElement(By.cssSelector("div.example")));
    }

    public class verifyPageText{
        private WebElement element;

        public verifyPageText(WebElement element){
            this.element = element;
        }

        public String titleTxt(){
            return element.findElement(By.cssSelector("div.example h3")).getText().trim();
        }
    }
}
