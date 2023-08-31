package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SiteHeaders;
import tools.Webdriver;

public class TestCase2 {

    WebDriver driver = Webdriver.getChromeDriver();
    ProductPage productPage = new ProductPage(driver);
    SiteHeaders siteHeaders = new SiteHeaders(driver);

    public String pageUrl ="https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363";
    @BeforeTest
    public void befTest(){driver.get(pageUrl);productPage.addToFavorite();}
    @Test
    public void deleteFavoriteFromProductPage(){productPage.addToFavorite();siteHeaders.favorites();}
    @AfterTest
    public void closeDriver(){driver.close();}
}
