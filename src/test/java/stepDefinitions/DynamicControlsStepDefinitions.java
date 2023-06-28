package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DynamicControlsPage;

public class DynamicControlsStepDefinitions {
    private DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();

    @Given("the user opens the Dynamic Controls application")
    public void userOpensTheApplication() {
        dynamicControlsPage.getDriver().navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @When("the user clicks on the Enable button")
    public void clickOnTheEnableButton() {
        dynamicControlsPage.getEnableButton().click();
    }

    @And("the user adds input into the field")
    public void addInputIntoTheField() {
        TestBase.getWait().until(ExpectedConditions.elementToBeClickable(dynamicControlsPage.getInputField()));
        dynamicControlsPage.getInputField().sendKeys("test");
    }

    @Then("the input is added into the field")
    public void inputIsAddedIntoTheField() {
        Assertions.assertEquals("test", dynamicControlsPage.getInputField().getAttribute("value"));
    }
}
