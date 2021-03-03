package turo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import turo.pages.Homepage;
import turo.utils.MyDriver;

public class HomepageSteps extends Base {
    Homepage homepage = new Homepage();

    @Given("user is in landing page")
    public void userIsInLandingPage() {
        String expected = "Way better than a rental car";
        textIsDisplayedAndEnabled(expected, homepage.homepageTitle);
    }

    @And("user verifies that default elements on homepage")
    public void userVerifiesThatDefaultElementsOnHomepage() {
        imageIsDisplayedAndEnabled(homepage.logo);
        String expected = "Log in";
        textIsDisplayedAndEnabled(expected, homepage.login);
        expected = "Sign up";
        textIsDisplayedAndEnabled(expected, homepage.signup);
        imageIsDisplayedAndEnabled(homepage.insuranceLogo);
    }

    @Then("user verifies that homepage title is present")
    public void userVerifiesThatHomepageTitleIsPresent() {
        String expected = "Turo | The world's largest car sharing marketplace";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
    }
}
