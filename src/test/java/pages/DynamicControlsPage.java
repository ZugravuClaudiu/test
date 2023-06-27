package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    @FindBy(css = "button[onclick='swapInput()']")
    private WebElement enableButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputField;

    public DynamicControlsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getEnableButton() {
        return enableButton;
    }

    public WebElement getInputField() {
        return inputField;
    }
}
