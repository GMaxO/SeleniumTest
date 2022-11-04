package ru.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenPage extends SetupChromeDriver {

    public OpenPage() {
    }

    public OpenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(@class, 'ant-typography open-ui-text open-ui-text-theme-default largeText main-page-exchange__currency-name') and text() = 'USD']/../../following-sibling::td[1]")
    private WebElement usdBuy;

    @FindBy(xpath = "//span[contains(@class, 'ant-typography open-ui-text open-ui-text-theme-default largeText main-page-exchange__currency-name') and text() = 'USD']/../../following-sibling::td[3]")
    private WebElement usdSale;

    @FindBy(xpath = "//span[contains(@class, 'main-page-exchange__currency-name') and text() = 'EUR']/../../following-sibling::td[1]")
    private WebElement eurBuy;

    @FindBy(xpath = "//span[contains(@class, 'main-page-exchange__currency-name') and text() = 'EUR']/../../following-sibling::td[3]")
    private WebElement eurSale;

    public boolean checkUSD() {
        float x = Float.parseFloat(usdSale.getText());
        float v = Float.parseFloat(usdBuy.getText());
        if (x > v) {
            return true;
        } else {
            return false;
        }
    }
//   public boolean checkEUR() {
//        boolean x = float.parseInt(eurSale.getText()) > float.parseInt(eurBuy.getText());
//        return true;
//    }

}