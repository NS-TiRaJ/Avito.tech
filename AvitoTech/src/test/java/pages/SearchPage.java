package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage  (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@data-marker='favorites-add']")
    WebElement addItemToFavorite;
    @FindBy (xpath = "//a[@data-marker='search-form/save']")
    WebElement addSearchToFavorite;
    @FindBy(xpath = "//select[@data-marker='sort-select/input']")//Спросить за выбор опций
    WebElement sort;
    @FindBy(xpath = "//div[@data-marker='item']")
    WebElement item;

    @Step public void addToFavorite(){addItemToFavorite.click();}
}
