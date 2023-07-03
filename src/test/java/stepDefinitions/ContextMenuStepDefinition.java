package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ContextMenuPage;

public class ContextMenuStepDefinition {
    private ContextMenuPage contextMenuPage = new ContextMenuPage();
    Actions action = new Actions(contextMenuPage.getDriver());

    @Given("The user opens the Context Menu Page application")
    public void openContextMenuPage() {
        contextMenuPage.getDriver().navigate().to("https://the-internet.herokuapp.com/context_menu");
    }

    @When("The user right clicks on the hotspot")
    public void rightClickHotspot() {
        action.contextClick(contextMenuPage.getHotspot()).perform();
    }

    @Then("The JavaScript alert You selected a context menu is displayed ")
    public void jsAlertDisplay() {
        Alert alert = contextMenuPage.getDriver().switchTo().alert();
        String message = contextMenuPage.getDriver().switchTo().alert().getText();
        Assertions.assertEquals("You selected a context menu", message);
    }

    @Then("the JavaScript alert You selected a context menu is displayed")
    public void the_java_script_alert_you_selected_a_context_menu_is_displayed() {
        Alert alert = contextMenuPage.getDriver().switchTo().alert();
        String message = contextMenuPage.getDriver().switchTo().alert().getText();
        Assertions.assertEquals("You selected a context menu", message);
    }



}
