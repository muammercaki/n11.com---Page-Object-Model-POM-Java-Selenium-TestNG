package testCaseFunction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class TitleControl extends BasePage {
    public TitleControl(WebDriver driver) {
        super(driver);
    }

    private String title() {
        return driver.getTitle();
    }

    public void titleControl() {
        Assert.assertEquals(title(), "n11.com - Alışverişin Uğurlu Adresi");
    }
}
