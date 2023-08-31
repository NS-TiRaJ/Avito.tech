package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteHeaders {
    public SiteHeaders(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@href='/business']")
    private WebElement forBusinessButton;
    @FindBy(xpath = "//a[@href='//career.avito.com/?utm_source=avito.ru&utm_medium=referral&utm_campaign=test_placement_to_career&utm_content=top_vacancy']")
    private WebElement vacanciesButton;
    @FindBy(xpath = "//a[@href='//support.avito.ru']")
    private WebElement helpButton;
    @FindBy(xpath = "//span[@class='index-nav-link-muv1u index-nav-catalog-link-N33oX']")
    private WebElement catalogsButton;
    @FindBy(xpath = "//a[@data-catalog-slug='catalog_novostroyki']")
    private WebElement newBuildingsCatalog;
    @FindBy(xpath = "//a[@data-catalog-slug='catalog_auto']")
    private WebElement carCatalog;
    @FindBy(xpath = "//a[@href='/avito-care?from=mp_header']")
    private WebElement benefitButton;
    @FindBy(xpath = "//a[@href='/favorites']")
    private WebElement favoritesButton;
    @FindBy(xpath = "//a[@data-marker='header/cart']")
    private WebElement cartButton;
    @FindBy(xpath = "//a[@data-marker='header/login-button']")
    private WebElement enterAndRegisterButton;
    @FindBy(xpath = "//a[@href='#login?next=%2Fadditem&authsrc=ca']")
    private WebElement postAdButton;
    @FindBy(xpath = "//a[@data-marker='search-form/logo']")
    private WebElement mainPageButton;
    @FindBy(xpath = "//span[@class='styles-module-size_ms-EVWML']")
    private WebElement categoriesButton;
    @FindBy(xpath = "//input[@class='input-input-Zpzc1']")
    private WebElement searchBar;
    @FindBy(xpath = "//button[@data-marker='search-form/submit-button']")
    private WebElement searchButton;
    @Step
    public void forBusiness(){forBusinessButton.click();}
    @Step
    public void vacancies(){vacanciesButton.click();}
    @Step
    public void help(){helpButton.click();}
    @Step
    public void catalogs(){catalogsButton.click();}
    @Step
    public void openNewBuildingsCatalog(){catalogsButton.click();newBuildingsCatalog.click();}
    @Step
    public void openCarCatalog(){catalogsButton.click();carCatalog.click();}
    @Step
    public void benefit(){benefitButton.click();}
    @Step
    public void favorites(){favoritesButton.click();}
    @Step
    public void cart(){cartButton.click();}
    @Step
    public void enterAndRegister(){enterAndRegisterButton.click();}
    @Step
    public void postAd(){postAdButton.click();}
    @Step
    public void mainPage(){mainPageButton.click();}
    @Step
    public void search(String i){searchBar.click();searchBar.sendKeys(i);searchButton.click();}
}
