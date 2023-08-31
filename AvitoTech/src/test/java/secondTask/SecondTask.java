package secondTask;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FavoritesPage;
import pages.ProductPage;
import pages.SiteHeaders;
import tools.Webdriver;

import java.time.Duration;

public class SecondTask {
    WebDriver driver = Webdriver.getChromeDriver();
    ProductPage productPage = new ProductPage(driver);
    SiteHeaders siteHeaders = new SiteHeaders(driver);
    FavoritesPage favoritesPage = new FavoritesPage(driver);
    public String pageUrl ="https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363";
    @BeforeTest
    public void befTest(){
        driver.get(pageUrl);
    }
    @Test
    @Description("Добавление в избранное")
    public void addToFavorite(){
        productPage.addToFavorite();
    }
    @AfterTest
    public void closeDriver(){driver.close();}
}
