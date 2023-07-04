package pages;
import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ForgotPasswordPage {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;
    @FindBy(xpath ="/html/body/h1")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"form_submit\"]/i")
    private WebElement button;

    public  ForgotPasswordPage(WebDriver driver)
    {

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


}

