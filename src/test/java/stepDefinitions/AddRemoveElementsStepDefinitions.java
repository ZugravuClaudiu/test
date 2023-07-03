package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddRemoveElements;
import java.util.List;

public class AddRemoveElementsStepDefinitions {

    private AddRemoveElements elementsPage = new AddRemoveElements();
    By elementlocator=By.name("Delete");
    List<WebElement> elements=elementsPage.getDriver().findElements(elementlocator);

    @Given ("The user enters the application")
    public void userOpensApp()
    {
        elementsPage.getDriver().navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @When("the user clicks on the Add button")
    public void clickOnAddButton()
    {
        elementsPage.getAddbutton().click();
    }
    @And("the user clicks on the Delete button")
    public void clickOnRemoveButton()
    {
        elementsPage.getRemovebutton().click();
    }
    @Then("The delete button no longer exists")

     public void deleteButtonIsDeleted(){
        Assertions.assertEquals(0,elements.size());
    }
    @When("The user ads multiple buttons")
    public void clickOnMultipleButtons()
    {
        elementsPage.getAddbutton().click();
        elementsPage.getAddbutton().click();
        elementsPage.getAddbutton().click();
    }
    @And("the user removes multiple buttons")
    public void deleteMultipleButtons()
    {
        while (!elementsPage.getDriver().findElements(By.xpath("//*[@id='elements']/button[1]")).isEmpty())
        {
            elementsPage.getRemovebutton().click();
        }

    }
}
