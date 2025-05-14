package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {
    private final WebDriver webDriver;
    private By loginField = By.id("username");
    private By passwordField = By.name("password");
    private By loginButton = By.id("login-button");
    public AuthPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void authenticate(String username, String password) {
        webDriver.findElement(loginField).clear();
        webDriver.findElement(loginField).sendKeys(username);
        webDriver.findElement(passwordField).clear();
        webDriver.findElement(passwordField).sendKeys(password);
        webDriver.findElement(loginButton).submit();
    }
}
