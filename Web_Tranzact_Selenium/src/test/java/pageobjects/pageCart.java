package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageCart {
    private WebDriver driverl;
    private WebDriverWait wait;
    public String resultado="";

    //Constructor
    public pageCart(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }


    //Action
    public void chekoutproducts() throws InterruptedException {
        //set Shipping addres
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='address[full_name]']")));
        //wait.until(ExpectedConditions.visibilityOf(driverl.findElement(By.cssSelector("input[name='address[full_name]']"))));
        driverl.findElement(By.cssSelector("input[name='address[full_name]']")).click();
        driverl.findElement(By.cssSelector("input[name='address[full_name]']")).sendKeys("Cristian Delgado");

        // set telephone
        driverl.findElement(By.cssSelector("input[name='address[telephone]']")).click();
        driverl.findElement(By.cssSelector("input[name='address[telephone]']")).sendKeys("+51987532479");

        // set address_1
        driverl.findElement(By.cssSelector("input[name='address[address_1]']")).click();
        driverl.findElement(By.cssSelector("input[name='address[address_1]']")).sendKeys("Santa teresita 318");

        // set city
        driverl.findElement(By.cssSelector("input[name='address[city]']")).click();
        driverl.findElement(By.cssSelector("input[name='address[city]']")).sendKeys("Los Angeles");

        // set country
        wait.until(ExpectedConditions.visibilityOf(driverl.findElement(By.cssSelector("select[name='address[country]']"))));
        driverl.findElement(By.cssSelector("select[name='address[country]']")).click();
        Select selcectcountry = new Select(driverl.findElement(By.cssSelector("select[name='address[country]']")));
        selcectcountry.selectByIndex(5);

        //set province
        // Create object of the Select class
        wait.until(ExpectedConditions.visibilityOf(driverl.findElement(By.cssSelector("select[name='address[province]']"))));
        driverl.findElement(By.cssSelector("select[name='address[province]']")).click();
        Select selectprovince = new Select(driverl.findElement(By.cssSelector("select[name='address[province]']")));
        // Select the option by index
        selectprovince.selectByIndex(5);

        //set postcode
        driverl.findElement(By.cssSelector("input[name='address[postcode]']")).sendKeys(Keys.ENTER);
        driverl.findElement(By.cssSelector("input[name='address[postcode]']")).sendKeys("+51");

        //set Shipping Method
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label[for='method0']")));
        driverl.findElement(By.cssSelector("label[for='method0']")).click();

        //go to payment
        driverl.findElement(By.cssSelector("button[class='button primary']")).click();


        Thread.sleep(2000);

        //select credit card
        driverl.findElement(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        //type credit card number
        driverl.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(1000);
        driverl.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]")).click();
        String msg= driverl.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]")).getText();
        Thread.sleep(1000);

        //switch to iframe
        driverl.switchTo().frame(0);

        //set CardNumber
        driverl.findElement(By.cssSelector(".CardNumberField-input-wrapper .InputElement")).click();
        driverl.findElement(By.cssSelector(".CardNumberField-input-wrapper .InputElement")).sendKeys("4242 4242 4242 4242");

        // card expiry
        driverl.findElement(By.cssSelector(".CardField-expiry .InputElement")).click();
        driverl.findElement(By.cssSelector(".CardField-expiry .InputElement")).sendKeys("0424");

        //set CVV code
        driverl.findElement(By.cssSelector(".CardField-cvc .InputElement")).click();
        driverl.findElement(By.cssSelector(".CardField-cvc .InputElement")).sendKeys("0424");

        //Click on Place Order
        driverl.switchTo().parentFrame();
        driverl.findElement(By.cssSelector("button[class='button primary']")).click();


    }


}
