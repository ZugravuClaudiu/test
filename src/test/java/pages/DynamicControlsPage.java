package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    private WebDriver driver;
    @FindBy(css = "button[onclick='swapInput()']")
    private WebElement enableButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputField;

    public DynamicControlsPage() {
        driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebElement getEnableButton() {
        return enableButton;
    }

    public WebElement getInputField() {
        return inputField;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
