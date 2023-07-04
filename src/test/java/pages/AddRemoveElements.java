package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddRemoveElements {

    @FindBy(xpath="//*[@id=\"content\"]/div/button")
    private WebElement addbutton;
    @FindBy (xpath="/html/body/div[2]/div/div/div/button[1]")
    private WebElement removebutton;
    @FindBy(xpath="/html/body/div[2]/div/div/div/button[1]")
    private WebElement nobuttons;


    public AddRemoveElements(WebDriver driver) {
        //driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }
    public WebElement getAddbutton()
    {
        return addbutton;
    }
    public WebElement getRemovebutton()
    {
        return removebutton;
    }
    public WebElement getNobuttons()
    {
        return nobuttons;
    }


}
