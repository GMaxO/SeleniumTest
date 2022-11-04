package ru.example;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void mainTest() {
        googlePage.searchField("Открытие");
        String actual = googlePage.checkLink();
        String expected = "https://www.open.ru/";
        Assert.assertEquals(actual, expected);
        googlePage.open();
        Assert.assertTrue(openPage.checkUSD());
        Assert.assertTrue(openPage.checkEUR());
    }
}
