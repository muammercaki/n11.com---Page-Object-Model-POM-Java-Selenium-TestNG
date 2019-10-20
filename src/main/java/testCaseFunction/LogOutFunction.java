package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class LogOutFunction extends BasePage {

    private By hoverElement = By.linkText("Hesabım");
    private By logOut = By.linkText("Çıkış Yap");

    public LogOutFunction(WebDriver driver) {
        super(driver);
    }

    public void logOut() {
        hoverElement(element(hoverElement));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element(logOut).click();
    }
}
