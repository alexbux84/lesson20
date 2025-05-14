package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyBySmsPage {
    private final WebDriver webDriver;
    private By otpCodeField = By.id("otp-code");
    private By confirmButton = By.id("login-otp-button");

    public VerifyBySmsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void confirmByCode(String code) {
        webDriver.findElement(otpCodeField).sendKeys(code);
        webDriver.findElement(confirmButton).submit();
    }

}
