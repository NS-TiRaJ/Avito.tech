package tools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {
    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Николай\\IdeaProjects\\AvitoTech\\src\\test\\java\\tools\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","--start-maximized");
        return new ChromeDriver(chromeOptions);
    }
}
