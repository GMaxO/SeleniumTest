package ru.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends SetupChromeDriver {

    public MainPage(WebDriver driver) {
        driver.get("https:///www.google.com/");
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi' and @name='q']")
    private WebElement fieldSearch;

    @FindBy(xpath = "//a[@href = 'https://www.open.ru/']")
    private WebElement openString;

    @FindBy(xpath = "//a[@href = 'https://www.open.ru/']")
    private WebElement link;

    public String checkLink(){
        String text = link.getAttribute("href");
        return text;
    }
    public MainPage searchField(String search){
        fieldSearch.sendKeys(search);
        fieldSearch.sendKeys(Keys.ENTER);
        return this;
    }
    public OpenPage open(){
        link.click();
        return new OpenPage();
    }
}
