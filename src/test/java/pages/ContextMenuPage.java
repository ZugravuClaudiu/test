package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContextMenuPage {
    private WebDriver driver;

@FindBy(id = "hot-spot")
private WebElement hotspot;


    public ContextMenuPage() {
        driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }
    public WebElement getHotspot()
    {
        return hotspot;
    }
    public WebDriver getDriver() {
        return driver;
    }


}