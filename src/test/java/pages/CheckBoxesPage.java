package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[1]")
    private WebElement checkbox1;
    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[2]")
    private WebElement checkbox2;

    public CheckBoxesPage() {
        driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebElement getCheckbox1() {
        return checkbox1;
    }

    public WebElement getCheckbox2() {
        return checkbox2;
    }

    public WebDriver getDriver() {
        return driver;
    }
}


