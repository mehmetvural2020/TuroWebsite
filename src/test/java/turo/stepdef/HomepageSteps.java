package turo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;

public class HomepageSteps extends Base {
    Homepage homepage = new Homepage();

    @Given("user is in landing page")
    public void userIsInLandingPage() {

    }

    @And("user verifies that default elements on homepage")
    public void userVerifiesThatDefaultElementsOnHomepage() {
    }

    @Then("user verifies that homepage title is present")
    public void userVerifiesThatHomepageTitleIsPresent() {
    }
}
