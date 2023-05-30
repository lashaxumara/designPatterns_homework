package Utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenshotUtil {
    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] captureScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void captureScreenshotOnFailure(WebDriver driver, ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver);
        }
    }
}
