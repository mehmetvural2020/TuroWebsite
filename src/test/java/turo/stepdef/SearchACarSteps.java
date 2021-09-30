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
        String expected = "Turo | Find the perfect car on the world’s largest car sharing marketplace";
        String actual = MyDriver.get().getTitle();
        verifyTheText(expected,actual);

//        Assert.assertEquals(expected,actual);
//        logger.info("Turo.com website title is {}", actual);
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
        while (!searchACar.calendar.getText().contains("December 2021")) {  // We can get today's date from LocalDateTime.
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
    waitSomeTime(3000L);
    }
}
