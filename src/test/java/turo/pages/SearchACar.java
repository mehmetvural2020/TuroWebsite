package turo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import turo.utils.MyDriver;

public class SearchACar {
    public SearchACar() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//input[@id='searchFormLocationTypeahead-input']")
    public WebElement locationUser;

    @FindBy(xpath = "//div[@class='seo-pages-19ve007-SuggestionTextTitle ee6ccll1'][normalize-space()='Los Angeles, CA']")
    public WebElement selectLocation;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElement startDate;

    @FindBy(xpath = "//div[@aria-label='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//div[@aria-label='Move forward to switch to the next month']")
    public WebElement nextMonthClick;

    @FindBy(xpath = "//div[@class='DateRangePicker_picker DateRangePicker_picker__horizontal DateRangePicker_picker__with_header seo-pages-jonmmy']")
    public WebElement daysTable1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
}
