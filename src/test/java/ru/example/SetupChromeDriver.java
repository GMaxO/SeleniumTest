package ru.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class SetupChromeDriver {
    public WebDriver driver;
    public MainPage mainPage;
    public OpenPage openPage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        openPage = new OpenPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Start test");
    }

    @After
    public void endTest() {
        driver.close();
        driver.quit();
        System.out.println("Finish test");
    }
}
