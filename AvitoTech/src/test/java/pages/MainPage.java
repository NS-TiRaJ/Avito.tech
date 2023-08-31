package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public  String mainUrl="https://www.avito.ru/";
    public MainPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@data-marker='bx-recommendations-block-item']")
    WebElement recomendationBlock;
}
