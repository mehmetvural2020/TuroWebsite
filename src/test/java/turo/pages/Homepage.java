package turo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import turo.utils.MyDriver;

public class Homepage {
    public Homepage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//p[@class=\"seo-pages-1vnvqu-StyledText\"]")
    public WebElement homepageTitle;

    @FindBy(xpath = "//a[@title=\"Turo\"]")
    public WebElement logo;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//a[normalize-space()='Sign up']")
    public WebElement signup;

    @FindBy(xpath = "//p[@class=\"seo-pages-1vnvqu-StyledText\"]")
    public WebElement mainTitle;

//    @FindBy(xpath = "//img[@alt='Liberty Mutual Insurance']")
//    public WebElement insuranceLogo;
}
