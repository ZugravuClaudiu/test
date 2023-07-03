package pages;
import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ForgotPasswordPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;
    @FindBy(xpath ="/html/body/h1")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"form_submit\"]/i")
    private WebElement button;
///html/body/h1
    public  ForgotPasswordPage()
    {
        driver=TestBase.getDriver();
        PageFactory.initElements(driver, this);}

    public WebElement getEmail()
        {
            return email;
        }
    public WebElement getMessage()
    {
        return message;
    }
    public WebElement getButton()
    {
        return button;
    }

        public WebDriver getDriver() {
        return driver;
    }
}

