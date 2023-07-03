package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.ForgotPasswordPage;
public class ForgotPasswordPageDefinitions {

    private ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();
    @Given("The user navigates to ForgotPassword app")
    public void userOpensApplication()
    {
        forgotPasswordPage.getDriver().navigate().to("https://the-internet.herokuapp.com/forgot_password");
    }
//    @When("The user enters a random password")
//    public void enterPass(String string)
//    {
//    forgotPasswordPage.getEmail().sendKeys(string);
//    }
    @When("The user enters a random password {string}")
    public void the_user_enters_a_random_password(String string) {
        forgotPasswordPage.getEmail().sendKeys(string);    }





    @And("The user clicks on 'Retrieve Password' button")
    public void clickOnButton()
    {
        forgotPasswordPage.getButton().click();
    }
    @Then("A new message appears displaying 'Internal Server Error'")
    public void message()
    {
        Assertions.assertEquals("Internal Server Error",forgotPasswordPage.getMessage().getText());
    }


}
