
package listeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.OpenClose;
import io.qameta.allure.Allure;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed: " + result.getName());

        try {

            // Get current test class instance
            Object testInstance = result.getInstance();

            // Access WebDriver from OpenClose class
            if (testInstance instanceof OpenClose) {

                OpenClose openClose = (OpenClose) testInstance;

                WebDriver driver = openClose.driver;

                if (driver != null) {

                    byte[] screenshot =
                            ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.BYTES);

                    Allure.addAttachment(
                            "Failure Screenshot",
                            "image/png",
                            new ByteArrayInputStream(screenshot),
                            ".png"
                    );

                    System.out.println("Failure screenshot attached to Allure.");

                } else {
                    System.out.println("WebDriver is null. Screenshot not captured.");
                }

            } else {
                System.out.println("Test class does not extend OpenClose.");
            }

        } catch (Exception e) {
            System.out.println("Screenshot not captured: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Suite Finished: " + context.getName());
    }
}
