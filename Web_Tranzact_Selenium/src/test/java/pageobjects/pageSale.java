package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class pageSale {
    private WebDriver driverl;
    private WebDriverWait wait;


    //constructor
    public pageSale(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }
    //locator
    @FindBy(id="sortfield")
    private WebElement selecionador;
    @FindBy(id="ec_add_to_cart_5")
    private WebElement producto1;
    @FindBy(id="ec_add_to_cart_4")
    private WebElement producto2;
    By carrito= By.cssSelector("a[title='View Cart']");

    //Actions

    //
    public void selectproduct1()throws InterruptedException{

        //search first product
        driverl.findElement(By.cssSelector("div[class='mini-cart-wrapper self-center']")).click(); //Opcion carrito
        driverl.findElement(By.cssSelector("a[class='nav-link hover:underline']")).click(); //men option
        driverl.findElement(By.cssSelector("a[href*='/men/strutter-shoes-45']")).click();//select first shoe
        driverl.findElement(By.cssSelector("input[name='qty']")).click();
        driverl.findElement(By.cssSelector("input[name='qty']")).clear();
        driverl.findElement(By.cssSelector("input[name='qty']")).sendKeys("2");// quantity 2
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'L')]")).click(); // size L
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'Black')]")).click(); // color black
        Thread.sleep(1000);
        driverl.findElement(By.cssSelector("button[class='button primary outline']")).click(); // add to a cart
        }

        public void selectproduct2()throws InterruptedException{
        //search second product
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'Women')]")).click();
        driverl.findElement(By.cssSelector("a[href*='/women/alphaboost-shoes-20']")).click();//select second shoe
        driverl.findElement(By.cssSelector("input[name='qty']")).click();
        driverl.findElement(By.cssSelector("input[name='qty']")).clear();
        driverl.findElement(By.cssSelector("input[name='qty']")).sendKeys("1");// quantity 1
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'L')]")).click(); // size L
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'Blue')]")).click(); // Blue color
        Thread.sleep(1000);
        driverl.findElement(By.cssSelector("button[class='button primary outline']")).click(); // add to a cart
        }

        public void selectproduct3()throws InterruptedException{
        //search third product
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'Women')]")).click();
        driverl.findElement(By.cssSelector("a[href*='/women/alphaedge-4d-reflective-shoes-23']")).click();//select second shoe
        driverl.findElement(By.cssSelector("input[name='qty']")).click();
        driverl.findElement(By.cssSelector("input[name='qty']")).clear();
        driverl.findElement(By.cssSelector("input[name='qty']")).sendKeys("3");// quantity 3
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'XL')]")).click(); // size XL
        Thread.sleep(1000);
        driverl.findElement(By.xpath("//ul//li/a[contains(text(), 'Black')]")).click(); // Blue color
        Thread.sleep(1000);
        driverl.findElement(By.cssSelector("button[class='button primary outline']")).click(); // add to a cart
        }

        public void Shoppingcart()throws InterruptedException{
        ////go to Shopping cart
        driverl.findElement(By.cssSelector("div[class='mini-cart-wrapper self-center']")).click();
        }

        public void checkout()throws InterruptedException{
        //go to check out
        driverl.findElement(By.cssSelector("a[href*='checkout']")).click(); //check out
        }


}
