package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CheckBoxesPage;
public class CheckBoxesStepDefinitions {
    private CheckBoxesPage checkBoxes =new CheckBoxesPage(TestBase.getDriver());
    @Given ("the user opens the checkboxes application")
    public void openCheckboxesApp()
            {
            TestBase.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");
            }
    @When("the user clicks the checkboxes")
    public void clickOnCheckboxes()
    {
        checkBoxes.getCheckbox1().click();
        checkBoxes.getCheckbox2().click();
    }
    @Then("CheckBox1 is checked, and CheckBox2 is unchecked")
    public void returnCheckBoxes()
    {
        Assertions.assertTrue(this.checkBoxes.getCheckbox1().isSelected());
        Assertions.assertFalse(this.checkBoxes.getCheckbox2().isSelected());
    }



}
