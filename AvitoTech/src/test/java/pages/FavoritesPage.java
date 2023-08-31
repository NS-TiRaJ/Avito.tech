package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage {

    public FavoritesPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@data-marker='favorites-tabs/tab(items)']")
    private WebElement favoriteAds;
    @FindBy(xpath = "//button[@data-marker='favorites-tabs/tab(searches)']")
    private WebElement favoriteSearches;
    @FindBy(xpath = "//button[@data-marker='favorites-tabs/tab(sellers)']")
    private WebElement favoriteProfiles;
    @FindBy(xpath = "//div[@data-marker='toggle-favorite-icon']")
    private WebElement deleteFavorite;
    @Step
    public void openFavoriteAds(){favoriteAds.click();}
    @Step
    public void openFavoriteSearchers(){favoriteSearches.click();}
    @Step
    public void openFaforiteProfiles(){favoriteProfiles.click();}
    @Step
    public void deleteFromFavorite(){
        deleteFavorite.click();
    }

}
