package steps;


import driverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.InfiniteScrollPage;

public class ScrollSteps extends DriverFactory {

    private DriverFactory driverFactory ;
    private InfiniteScrollPage infiniteScrollPage;

    public ScrollSteps(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Given("^that I navigate to the infinte scroll page$")
    public void thatINavigateToTheInfinteScrollPage() {
        infiniteScrollPage = new InfiniteScrollPage(driverFactory.driver);
        infiniteScrollPage.goToInfiniteScrollPage();
    }

    @When("^I scroll down twice$")
    public void iScrollDownTwice() {
        infiniteScrollPage.scrollPageDownTwice();
    }

    @And("^scroll to the top$")
    public void scrollToTheTop() {
        infiniteScrollPage.scrollPageToTop();
    }

    @Then("^I should see the page title$")
    public void iShouldSeeThePageTitle() {
        InfiniteScrollPage.verifyPageText verifyPageText = infiniteScrollPage.getTitleText();
        Assert.assertEquals("Infinite Scroll",verifyPageText.titleTxt());
    }


}
