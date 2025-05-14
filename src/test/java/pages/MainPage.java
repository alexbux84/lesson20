package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MainPage {
    private final WebDriver webDriver;
    private final By financeFreedom = By.xpath("//span[text()='Финансовая свобода']/parent::span[@id='accounts-can-spend']");
    private final By financeFreedomSum = By.xpath("//span[text()='Финансовая свобода']/parent::span[@id='accounts-can-spend']//span[@class='can-spend-amount']");
    private final By cards = By.xpath("//*[contains(@class,'account-cards')]//*[@data-content]");
    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By getFinanceFreedom() {
        return financeFreedom;
    }

    public String getFinanceFreedomSum() {
        return webDriver.findElement(financeFreedomSum).getText();
    }

    public List<WebElement> getCards() {
        return webDriver.findElements(cards);
    }
}
