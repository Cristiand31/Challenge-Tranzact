package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
    private WebDriver driver;
    public WebDriver chrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Cristian\\Tranzact\\Web_Tranzact_Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.evershop.io/");
        return driver;
    }
}
