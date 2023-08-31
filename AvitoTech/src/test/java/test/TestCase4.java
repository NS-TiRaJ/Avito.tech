package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SiteHeaders;
import tools.Webdriver;

public class TestCase4 {
    WebDriver driver = Webdriver.getChromeDriver();
    SiteHeaders siteHeaders = new SiteHeaders(driver);
    SearchPage searchPage = new SearchPage(driver);
    public String pageUrl ="https://www.avito.ru/";
    @BeforeTest
    public void befTest(){driver.get(pageUrl);siteHeaders.search("Товар");searchPage.addToFavorite();}
    @Test
    public void deleteFavoriteFromSearchPage(){searchPage.addToFavorite();siteHeaders.favorites();}
    @AfterTest
    public void closeDriver(){driver.close();}
}
