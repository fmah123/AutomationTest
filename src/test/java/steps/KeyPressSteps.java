package steps;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.KeyPressesPage;



public class KeyPressSteps{
    private DriverFactory driverFactory;
    private KeyPressesPage keyPressesPage;

    public KeyPressSteps(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Given("^that I navigate to the key presses on menu page$")
    public void thatINavigateToTheKeyPressesOnMenuPage() {
        keyPressesPage = new KeyPressesPage(driverFactory.driver);
        keyPressesPage.goToKeyPressesPage();
    }

    @When("^I enter a tab key$")
    public void iEnterATabKey() {
        keyPressesPage.enterKeyValueToTextBox(Keys.TAB);
    }

    @Then("^it should say you entered tab$")
    public void itShouldSayYouEnteredTab() {
        KeyPressesPage.TextBoxValueResult textBoxValueResult = keyPressesPage.getTextBoxValueResult();
        Assert.assertEquals("You entered: TAB", textBoxValueResult.textBoxResultTxt());

    }

    @When("^I enter a control key$")
    public void iEnterAControlKey() {
        keyPressesPage.enterKeyValueToTextBox(Keys.CONTROL);
    }

    @Then("^it should say you entered control$")
    public void itShouldSayYouEnteredControl() {
        KeyPressesPage.TextBoxValueResult textBoxValueResult = keyPressesPage.getTextBoxValueResult();
        Assert.assertEquals("You entered: CONTROL", textBoxValueResult.textBoxResultTxt());
    }

    @When("^I enter a escape key$")
    public void iEnterAEscapeKey() {
        keyPressesPage.enterKeyValueToTextBox(Keys.ESCAPE);
    }

    @Then("^it should say you entered escape$")
    public void itShouldSayYouEnteredEscape() {
        KeyPressesPage.TextBoxValueResult textBoxValueResult = keyPressesPage.getTextBoxValueResult();
        Assert.assertEquals("You entered: ESCAPE", textBoxValueResult.textBoxResultTxt());
    }

    @When("^I enter a alt key$")
    public void iEnterAAltKey() {
        keyPressesPage.enterKeyValueToTextBox(Keys.ALT);
    }

    @Then("^it should say you entered alt$")
    public void itShouldSayYouEnteredAlt() {
        KeyPressesPage.TextBoxValueResult textBoxValueResult = keyPressesPage.getTextBoxValueResult();
        Assert.assertEquals("You entered: ALT", textBoxValueResult.textBoxResultTxt());
    }
}
