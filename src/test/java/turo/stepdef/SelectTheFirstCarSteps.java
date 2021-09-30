package turo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import turo.pages.SelectTheFirstCar;
import turo.utils.*;

import java.util.ArrayList;

public class SelectTheFirstCarSteps extends Base {
    SelectTheFirstCar selectTheFirstCar = new SelectTheFirstCar();

    @Given("user is on landing page to select")
    public void userIsOnLandingPageToSelect() {
        MyDriver.get().get(ConfigurationReader.getProperty("selectTheFirstCarUrl"));
        waitSomeTime(3000L);
    }

    @And("User selects the first car in the list and verify the selected car title is present")
    public void userSelectsTheFirstCarInTheListAndVerifyTheSelectedCarTitleIsPresent() {
        waitSomeTime(5000L);

        JavascriptExecutor js = (JavascriptExecutor) MyDriver.get();
        js.executeScript("arguments[0].setAttribute('target', '')", selectTheFirstCar.firstCarLink );


        String expected = selectTheFirstCar.firstCarTitle.getText();
        click(selectTheFirstCar.firstCarLink);

        ArrayList<String> tabs = new ArrayList<String> (MyDriver.get().getWindowHandles());

        MyDriver.get().switchTo().window(tabs.get(1));


        waitSomeTime(1000L);
        scrollDown(selectTheFirstCar.tripEnd);
        waitSomeTime(3000L);
        String actual = selectTheFirstCar.selectedCarTitle.getText();
        logger.info("Expected is {} and actual is {}.",expected, actual);
        Assert.assertEquals(expected, actual);
    }

    @Then("User selects Pickup location")
    public void userSelectsPickupLocation() {

        selectTheFirstCar.pickupLocation.click();
        waitSomeTime(5000L);
        selectTheFirstCar.pickup.click();
        waitSomeTime(3000L);
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        waitSomeTime(3000L);
        selectTheFirstCar.continueButton.click();
        waitSomeTime(3000L);
    }
}
