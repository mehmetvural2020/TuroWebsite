package turo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import turo.pages.SearchACar;
import turo.utils.MyDriver;

import java.util.List;

public class SearchACarSteps extends Base {
    SearchACar searchACar = new SearchACar();
    @Given("user is on landing page to search")
    public void userIsOnLandingPageToSearch() {
        waitSomeTime(1000L);
        String expected = "Turo | The world's largest car sharing marketplace";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected,actual);
        logger.info("Turo.com website title is {}", actual);
    }

    @And("user enter {string} in Where text box")
    public void userEnterInWhereTextBox(String location) {
        click(searchACar.locationUser);
        sendKeysValue(location, searchACar.locationUser);
        click(searchACar.selectLocation);
    }

    @And("user select {string} and {string} under From")
    public void userSelectAndUnderFrom(String dateFrom, String dateUntil) {
        click(searchACar.startDate);
        waitSomeTime(500L);
        while (!searchACar.calendar.getText().contains("May 2021")) {
            waitSomeTime(500L);
            click(searchACar.nextMonthClick);
            waitSomeTime(500L);
        }

        List<WebElement> dates2 = searchACar.daysTable1.findElements(By.tagName("td"));
        for(WebElement day : dates2) {
//            waitSomeTime(1000L);
            if (day.getText().equals(dateFrom)) {
                click(day);
                logger.info("Start date {} is selected.", dateFrom);
            }
//            waitSomeTime(1000L);
            if (day.getText().equals(dateUntil)) {
                click(day);
                logger.info("End date {} is selected.",dateUntil);
                break;
            }
        }

    }

    @Then("User clicks Search button")
    public void userClicksSearchButton() {
    click(searchACar.searchButton);
    logger.info("User clicked search button.");
    }
}
