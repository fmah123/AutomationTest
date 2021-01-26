package steps;

import driverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.FormAuthenticationPage;

public class LoginSteps extends DriverFactory{

    private DriverFactory driverFactory;
    private FormAuthenticationPage formAuthenticationPage;

    public LoginSteps(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Given("^that I navigate to the form authentication page$")
    public void thatINavigateToTheFormAuthenticationPage() {
        formAuthenticationPage = new FormAuthenticationPage(driverFactory.driver);
        formAuthenticationPage.GoToFormAuthenticationPage();
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
        formAuthenticationPage.clickOnLoginButton();
    }

    @When("^I enter a incorrect ([^\"]*) and incorrect ([^\"]*)$")
    public void iEnterAIncorrectUsernameAndIncorrectPassword(String username, String password ) {
        formAuthenticationPage.enterAUserNameAndPassWord(username,password);
    }

    @Then("^I should see a username invalid message$")
    public void iShouldSeeAUsernameInvalidMessage() {
        FormAuthenticationPage.VerifyLogText text = formAuthenticationPage.getLoginMessageTxt();
        Assert.assertEquals(
                "Your username is invalid!\n" +
                        "×", text.loginFailMsgTxt());

    }


    @When("^I enter a correct ([^\"]*) and incorrect ([^\"]*)$")
    public void iEnterACorrectUsernameAndIncorrectPassword(String username, String password) {
        formAuthenticationPage.enterAUserNameAndPassWord(username,password);
    }

    @Then("^I should see a password invalid message$")
    public void iShouldSeeAPasswordInvalidMessage() {
        FormAuthenticationPage.VerifyLogText verifyLogText = formAuthenticationPage.getLoginMessageTxt();
        Assert.assertEquals(
                "Your password is invalid!\n" +
                        "×", verifyLogText.loginFailMsgTxt());

    }


    @When("^I enter a correct ([^\"]*) and correct ([^\"]*)$")
    public void iEnterACorrectUsernameAndCorrectPassword(String username, String password) {
        formAuthenticationPage.enterAUserNameAndPassWord(username,password);
    }

    @Then("^I should see a welcome login message$")
    public void iShouldSeeAWelcomeLoginMessage() {
        FormAuthenticationPage.VerifyLogText verifyLogText = formAuthenticationPage.getLoginMessageTxt();
        Assert.assertEquals(
                "You logged into a secure area!\n" +
                        "×", verifyLogText.loginSuccessMsgTxt());
    }


 }
