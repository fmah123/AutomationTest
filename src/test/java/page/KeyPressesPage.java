package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage extends BasePage {

    private By KEY_PRESSES_LINK = By.cssSelector("a[href*=ses]");
    private By TEXT_BOX = By.cssSelector("input#target");


    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void goToKeyPressesPage(){
        WaitAndClick(KEY_PRESSES_LINK);
    }

    public void enterKeyValueToTextBox(String key){
        FindAndType(key,TEXT_BOX);
    }

    public void enterKeyValueToTextBox(Keys key){
        FindAndType(key, TEXT_BOX);
    }

    public TextBoxValueResult getTextBoxValueResult(){
        return new TextBoxValueResult(driver.findElement(By.cssSelector("div#content")));
    }

    public class TextBoxValueResult{
        private WebElement element;

        public TextBoxValueResult(WebElement element) {
            this.element = element;
        }

        public String textBoxResultTxt () {
            return element.findElement(By.cssSelector("p#result")).getText().trim();
        }
    }
}
