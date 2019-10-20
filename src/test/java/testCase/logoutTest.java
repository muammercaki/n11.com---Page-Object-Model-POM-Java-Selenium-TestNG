package testCase;


import listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.LogOutFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class logoutTest extends BaseTest {

    @Test(priority = 1)
    public void logOutTest() {
        LogOutFunction logOutFunction = new LogOutFunction(driver);
        logOutFunction.logOut();

    }
}
