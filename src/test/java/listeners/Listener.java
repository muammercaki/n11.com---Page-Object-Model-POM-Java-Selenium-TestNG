package listeners;

import org.apache.log4j.MDC;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failure");
        logger.error("Fail");
        MDC.put("fail", iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Skip");
        logger.warn("Skip");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestResult) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Browser opened ");
    }

    public void onFinish(ITestContext iTestResult) {
        driver.quit();
        logger.info("Closed browser");
    }
}
