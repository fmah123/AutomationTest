package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage extends BasePage {

    private By FORM_AUTHENTICATION_LINK = By.cssSelector("a[href*=ogin]");
    private By USERNAME_ENTRY_BOX = By.cssSelector("input#username");
    private By PASSWORD_ENTRY_BOX = By.cssSelector("input#password");
    private By LOGIN_BUTTON = By.cssSelector("button.radius");
    private By LOGOUT_BUTTON = By.cssSelector("a.button.secondary.radius");

    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void GoToFormAuthenticationPage(){
        WaitAndClick(FORM_AUTHENTICATION_LINK);
    }

    public void enterAUserNameAndPassWord(String username, String password){
        FindAndType(username, USERNAME_ENTRY_BOX);
        FindAndType(password, PASSWORD_ENTRY_BOX);
    }

    public void clickOnLoginButton(){
        WaitAndClick(LOGIN_BUTTON);
    }

    public void clickOnLogOutButton(){
        WaitAndClick(LOGOUT_BUTTON);
    }

    public VerifyLogText getLoginMessageTxt(){
        return new VerifyLogText(driver.findElement(By.cssSelector("html.no-js")));
    }


    public class VerifyLogText{
        private WebElement element;

        public VerifyLogText(WebElement element){
            this.element = element;
        }


        public String loginFailMsgTxt(){
            return element.findElement(By.cssSelector("div.error")).getText().trim();
        }

        public String loginSuccessMsgTxt(){
            return element.findElement(By.cssSelector("div.success")).getText().trim();
        }

    }
}
