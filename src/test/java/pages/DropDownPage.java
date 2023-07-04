package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DropDownPage {

    @FindBy(xpath = "//*[@id=\"dropdown\"]")
    private WebElement dropdown;
    public DropDownPage(WebDriver driver)
    {
        //driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }
    public WebElement getDropdown() {
        return dropdown;
    }

}
