package tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CheckBoxesPage;

public class CheckBoxesTests extends TestBase {
    private CheckBoxesPage checkboxes;

    public CheckBoxesTests() {
    }

    @Test
    public void successfulCheckbox1() {
        this.checkboxes = new CheckBoxesPage(this.driver);
        this.driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        this.checkboxes.getCheckbox1().click();
        Assertions.assertTrue(this.checkboxes.getCheckbox1().isSelected());
    }

    @Test
    public void successfulCheckbox2() {
        this.checkboxes = new CheckBoxesPage(this.driver);
        this.driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        this.checkboxes.getCheckbox2().click();
        Assertions.assertFalse(this.checkboxes.getCheckbox2().isSelected());
    }
}