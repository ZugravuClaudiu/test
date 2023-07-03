package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DropDownPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"dropdown\"]")
    private WebElement dropdown;
    public DropDownPage()
    {
        driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }
    public WebElement getDropdown() {
        return dropdown;
    }
    public WebDriver getDriver() {
        return driver;
    }
}
