package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tools.Webdriver;

public class ProductPage {
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='style-header-add-favorite-M7nA2']")
    private WebElement favoritesButton;
    @FindBy(xpath = "//div[@class='style-item-notes-container-hNkRg style-header-item-notes-xKqZ4']")
    private WebElement addNoteButton;
    @FindBy(xpath = "//a[@data-marker='bargain-offer-button']")
    private WebElement bargainOfferButton;
    @FindBy(xpath = "//button[@data-marker='item-phone-button/card']")
    private WebElement showPhoneNumberButton;
    @FindBy(xpath = "//div[@class='messenger-button-cardButtonText-UjDG6']")
    private WebElement writeMessageButton;
    @FindBy(xpath = "//div[@class='style-seller-info-favorite-seller-buttons-U0Ia7']")
    private WebElement subscribeToSellerButton;
    @FindBy(xpath = "//div[@class='style-item-map-control-X1Oqc']")
    private WebElement Map;
    @FindBy(xpath = "//div[@class='extended-input-extended-input-container-NGyjU']")
    private WebElement messageBox;
    @FindBy(xpath = "//div[@class='extended-input-inputIcon-v0B9s']")
    private WebElement sendMessage;
    @FindBy(xpath = "//button[@data-marker='item-view/abuse-button']")
    private WebElement reportButton;

    @Step
    public void addToFavorite(){
        favoritesButton.click();
    }
    @Step
    public void addNote(){addNoteButton.click();}
    @Step
    public void bargainOffer(){bargainOfferButton.click();}

}

