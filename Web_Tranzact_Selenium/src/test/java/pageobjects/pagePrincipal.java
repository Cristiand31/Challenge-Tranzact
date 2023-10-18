package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pagePrincipal {
    private WebDriver driverl;
    private WebDriverWait wait;

    //constructor
    public pagePrincipal(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);
    }
//

    //Actions


    String full_name="Cristian Delgado";

    int valorEntero = (int) (Math.floor(Math.random()*(1000-9999+1)+9999));
    String email="cristian"+valorEntero+"@outlook.com";
    String password="clave_00001";

    public void registeraccount(){
        driverl.findElement(By.cssSelector("a[href*='/account/login']")).click();
        driverl.findElement(By.cssSelector("a[href*='/account/register']")).click();
        driverl.findElement(By.cssSelector("input[name='full_name']")).click();
        driverl.findElement(By.cssSelector("input[name='full_name']")).sendKeys(full_name);
        driverl.findElement(By.cssSelector("input[name='email']")).click();
        driverl.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
        driverl.findElement(By.cssSelector("input[name='password']")).click();
        driverl.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driverl.findElement(By.cssSelector("div[class='form-submit-button flex border-t border-divider mt-1 pt-1']")).click();
    }

    public void login(){
        driverl.findElement(By.cssSelector("a[href*='/account/login']")).click();
        driverl.findElement(By.cssSelector("input[name='email']")).click();
        driverl.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
        driverl.findElement(By.cssSelector("input[name='password']")).click();
        driverl.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driverl.findElement(By.cssSelector("div[class='form-submit-button flex border-t border-divider mt-1 pt-1']")).click();
    }



}
