package turo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import turo.pages.AdvancedSearch;
import turo.utils.ConfigurationReader;
import turo.utils.MyDriver;

public class AdvancedSearchSteps extends Base {
    AdvancedSearch advancedSearch = new AdvancedSearch();

    @Given("User is on advanced search page")
    public void userIsOnAdvancedSearchPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("advancedUrl"));

       MyDriver.get().manage().deleteAllCookies();
       MyDriver.get().navigate().refresh();
        waitSomeTime(5L);
    }

    @When("Fills out more filters option")
    public void fillsOutMoreFiltersOption() {
            click(advancedSearch.moreFiltersButton);
            click(advancedSearch.allStarHost);

       // selectCarAndVehicleMakes
            click(advancedSearch.vehicleTypesButton);
            click(advancedSearch.car);

            waitSomeTime(2L);
            Select select = new Select(advancedSearch.vehicleMakes);
            scrollDown(advancedSearch.lexus);
            waitSomeTime(2L);
            select.selectByVisibleText("Toyota");

            scrollDown(advancedSearch.yearText);

            Actions move = new Actions(MyDriver.get());
            Action actionLeft1 = (Action) move.dragAndDropBy(advancedSearch.leftYearSlider, 430, 0).release().build();
            ((Action) actionLeft1).perform();

            Action actionLeft = (Action) move.dragAndDropBy(advancedSearch.rightYearSlider, -15, 0).release().build();
            ((Action) actionLeft).perform();

            select = new Select(advancedSearch.transmission);
            waitSomeTime(2L);
            select.selectByVisibleText("Automatic");
            waitSomeTime(2L);
            click(advancedSearch.viewResult4);
        }

    @And("Completes all other filters")
    public void completesAllOtherFilters() {
            waitSomeTime(5L);
            click(advancedSearch.sortBy);
            click(advancedSearch.lowToHigh);
            System.out.println(advancedSearch.lowToHigh.getText() + " is Selected...");
            click(advancedSearch.applyButton);
            waitSomeTime(2L);

            click(advancedSearch.price);
            Actions move = new Actions(MyDriver.get());
            // We can get coordinate with coordinates extension in google chrome.
            // Left slider move to 50$. x coordinate is moving 68 pixel to right from left.
            Action actionLeft = move.dragAndDropBy(advancedSearch.leftSlider, 68, 234).build();
            actionLeft.perform();

            // Right slider move to 200$. x coordinate is moving -90 pixel   to left from right.
            Action actionRight = (Action) move.dragAndDropBy(advancedSearch.rightSlider, -90, 234).build();
            ((Action) actionRight).perform();

            click(advancedSearch.viewResult);
            waitSomeTime(2L);

            click(advancedSearch.bookInstantly);
            click(advancedSearch.viewResult2);
            waitSomeTime(2L);

            click(advancedSearch.deliveryButton);
            move = new Actions(MyDriver.get());

            actionRight = move.dragAndDropBy(advancedSearch.deliveryRightSlider, -105, 234).build();
            actionRight.perform();
            waitSomeTime(2L);
            click(advancedSearch.viewResult3);

            waitSomeTime(2L);
            click(advancedSearch.distanceButton);
            click(advancedSearch.distance200miles);
            waitSomeTime(2L);
            click(advancedSearch.applyButton1);
        }
    }



