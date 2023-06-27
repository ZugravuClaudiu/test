package tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DynamicControlsPage;

public class DynamicControlsTests extends TestBase {
    private DynamicControlsPage dynamicControlsPage;
    @Test
    public void enableFieldTest() {
        dynamicControlsPage = new DynamicControlsPage(driver);
        //1. Launch the application
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
        //2. Click on the Enable button
        dynamicControlsPage.getEnableButton().click();
        //3. Add input to the field
        wait.until(ExpectedConditions.elementToBeClickable(dynamicControlsPage.getInputField()));
        dynamicControlsPage.getInputField().sendKeys("test");
        //Expected Result: The input is successfully added into the field
        Assertions.assertEquals("test", dynamicControlsPage.getInputField().getAttribute("value"));
    }
}
