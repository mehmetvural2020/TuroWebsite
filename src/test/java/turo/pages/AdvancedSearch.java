package turo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import turo.utils.MyDriver;

public class AdvancedSearch {

    public AdvancedSearch() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//div[@class='searchFilter desktopMoreFilters']")
    public WebElement moreFiltersButton;

    @FindBy(css = "label[for='allStarHost'] span[class='styledCheckbox-label']")
    public WebElement allStarHost;

    @FindBy(xpath = "//div[@class='searchFilterBar']//div[7]//div[2]//div[1]//span[1]")
    public WebElement vehicleTypesButton;

    @FindBy(xpath = "//span[@class='imageMultiSelectOption-icon typeIcon typeIcon--car']")
    public WebElement car;

    @FindBy(xpath = "//select[@id='makes']")
    public WebElement vehicleMakes;

    @FindBy(xpath = "//option[@value='Lexus']")
    public WebElement lexus;

    @FindBy(xpath = "//span[@class='rangeSliderField-label']")
    public WebElement yearText;

    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-1']")
    public WebElement leftYearSlider;

    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-2']")
    public WebElement rightYearSlider;

    @FindBy(xpath = "//select[@id='automaticTransmission']")
    public WebElement transmission;

    @FindBy(css = "button[class='buttonSchumi buttonSchumi--medium buttonSchumi--purple searchFilterPopupDesktop-submitButton']")
    public WebElement viewResult4;

    @FindBy(xpath = "//div[@class='searchFilterBar']//div[1]//button[1]")
    public WebElement sortBy;

    @FindBy(css = "label[for='styledRadioButtonField-sortType-PRICE_LOW']")
    public WebElement lowToHigh;

    @FindBy(xpath = "//button[@data-test='searchFilterPopupDesktop-submitButton']")
    public WebElement applyButton;

    @FindBy(xpath = "//div[@class='searchFilterBar']//div[2]//button[1]")
    public WebElement price;


    @FindBy(css = "div[class='rc-slider-handle rc-slider-handle-1']")
    public WebElement leftSlider;

    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-2']")
    public WebElement rightSlider;

    @FindBy(css = "button[class='buttonSchumi buttonSchumi--medium buttonSchumi--purple searchFilterPopupDesktop-submitButton']")
    public WebElement viewResult;

    @FindBy(xpath = "//div[@class='searchFilterBar']//div[3]//button[1]")
    public WebElement bookInstantly;

    @FindBy(css = "button[class='buttonSchumi buttonSchumi--medium buttonSchumi--purple searchFilterPopupDesktop-submitButton']")
    public WebElement viewResult2;

    @FindBy(xpath = "//div[@class='searchFilterBar']//div[4]//button[1]")
    public WebElement deliveryButton;

    @FindBy(xpath = "//div[@role='slider']")
    public WebElement deliveryRightSlider;

    @FindBy(css = "button[class='buttonSchumi buttonSchumi--medium buttonSchumi--purple searchFilterPopupDesktop-submitButton']")
    public WebElement viewResult3;

    @FindBy(xpath = "//span[contains(text(), 'Distance included')]")
    public WebElement distanceButton;

    @FindBy(css = "label[for='styledRadioButtonField-minimumMileage-200']")
    public WebElement distance200miles;

    @FindBy(css = "button[class='buttonSchumi buttonSchumi--medium buttonSchumi--purple searchFilterPopupDesktop-submitButton']")
    public WebElement applyButton1;



//    @FindBy(xpath = "//div[@class='searchFilter desktopMoreFilters']")
//    public WebElement moreFiltersButton;
//
//    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-1']")
//    public WebElement left;
//
//    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-1 rc-slider-handle-click-focused']")
//    public WebElement leftSlider;
//
//    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-2']")
//    public WebElement right;
//
//    @FindBy(xpath = "//div[@class='rc-slider-handle rc-slider-handle-2 rc-slider-handle-click-focused']")
//    public WebElement rightSlider;
//
//    @FindBy(xpath = "//div[@class='rc-slider-track rc-slider-track-1']")
//    public WebElement slider;
//
//    @FindBy(xpath = "//span[@class='rangeSliderField-label']")
//    public WebElement yearText;



}
