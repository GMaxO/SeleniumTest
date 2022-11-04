package ru.example;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends SetupChromeDriver {
    @Test
    public void mainTest() {
        mainPage.searchField("Открытие");
        String actual = mainPage.checkLink();
        String expected = "https://www.open.ru/";
        Assert.assertEquals(actual, expected);
        mainPage.open();
        Assert.assertTrue(openPage.checkUSD());
//        Assert.assertTrue(openPage.checkEUR());
    }
}
