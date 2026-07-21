package listeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
            byte[] screenshot = ((TakesScreenshot) OpenClose.getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            Allure.addAttachment(
                    "Failure Screenshot",
                    new ByteArrayInputStream(screenshot)
            );

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