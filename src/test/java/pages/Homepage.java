package pages;

import org.openqa.selenium.support.PageFactory;
import turo.utils.MyDriver;

public class Homepage {
    public Homepage() {
        PageFactory.initElements(MyDriver.get(), this);
    }


}
