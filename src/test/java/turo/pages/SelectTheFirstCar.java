package turo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import turo.utils.MyDriver;

public class SelectTheFirstCar {
    public SelectTheFirstCar() {
        PageFactory.initElements(MyDriver.get(), this);
    }

//    @FindBy(xpath = "//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div[1]/div/div/a")
//    @FindBy(xpath = "(//a[@data-testid=\"vehicle-card-link-box\"])[1]")
    @FindBy(xpath = "(//img[@class=\"css-gpqzdq\"])[1]")
    public WebElement firstCarLink;

//    @FindBy(xpath = "//*[@class='ey4g3ta0 css-1wmlurb-StyledText-VehicleLabelText']")
    @FindBy(xpath = "(//div[@class=\"css-1xhwfei-StyledText\"])[1]")
    public WebElement firstCarTitle;

    @FindBy(xpath = "(//p[@class=\"css-9974qc-StyledText\"])[2]")
    public WebElement tripEnd;

    @FindBy(xpath = "//h1[@class=\"css-tibi9u-StyledText\"]")
    public WebElement selectedCarTitle;

//    @FindBy(xpath = "//div[@class='reservationBoxLocation-current reservationBoxLocation-current--instantBook']")
    @FindBy(xpath = "//div[@class=\"reservationBox-section reservationBoxLocation\"]")
    public WebElement pickupLocation;

    //    @FindBy(xpath = "//span[@class='reservationBoxLocationOption reservationBoxLocationOption--home is-active']")
    @FindBy(xpath = "//span[@class='reservationBoxLocationOption reservationBoxLocationOption--home']")
    public WebElement pickup;

    @FindBy(xpath = "//span[@tabindex='0' and @xpath='1']")
    public WebElement deliveryLocation;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

}
