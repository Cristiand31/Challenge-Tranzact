package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageOrder {
    private WebDriver driverl;
    private WebDriverWait wait;

    //Constructor
    public pageOrder(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }

    //Action
    public void chekoutproducts() throws InterruptedException {
        //get Contact parameters
        Thread.sleep(5000);
        //String name=driverl.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText();


    }

    public void close() throws InterruptedException {
        driverl.close();

    }


}
