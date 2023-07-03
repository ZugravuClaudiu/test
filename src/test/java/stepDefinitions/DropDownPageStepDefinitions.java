package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.DropDownPage;
public class DropDownPageStepDefinitions {
    private DropDownPage dropDownPage = new DropDownPage();
    @Given("The user navigates to the DropDown Page")
    public void userOpensApplication()
    {
        dropDownPage.getDriver().navigate().to("https://the-internet.herokuapp.com/dropdown");
    }

    @When("The user clicks on the {string} menu")
    public void the_user_clicks_on_the_menu(String string) {
    dropDownPage.getDropdown().click();
}


    //Select select = new Select(dropDownPage.getDriver().findElement(By.xpath("//*[@id=\"dropdown\"]")));
    @And("The user selects Option 1 and 2")
    public void userClicksOptions()
    {
        Select select = new Select(dropDownPage.getDriver().findElement(By.xpath("//*[@id=\"dropdown\"]")));
        select.selectByValue("1");
        String option=select.getFirstSelectedOption().getText();
        Assertions.assertEquals("Option 1",option);
        select.selectByValue("2");
        option=select.getFirstSelectedOption().getText();
        Assertions.assertEquals("Option 2", option);
    }
    @Then("The drop down menu displays Option 2")
    public void menuDisplay()
    {
        Select select = new Select(dropDownPage.getDriver().findElement(By.xpath("//*[@id=\"dropdown\"]")));
        String option=select.getFirstSelectedOption().getText();
        Assertions.assertEquals("Option 2", option);

    }





}
