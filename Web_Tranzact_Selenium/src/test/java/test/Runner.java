package test;

import pageobjects.pageOrder;
import tools.drivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.pageCart;
import pageobjects.pagePrincipal;
import pageobjects.pageSale;

public class Runner {
    private WebDriver driver;
    private drivers driverh=new drivers();

    @Test
    public void inicio() throws InterruptedException {

        System.out.println("projectPath");
        driver = driverh.chrome();

        pagePrincipal bienvenida=new pagePrincipal(driver);
        pageSale sales=new pageSale(driver);
        pageCart cart=new pageCart(driver);
        pageOrder order=new pageOrder(driver);


        bienvenida.registeraccount();
        bienvenida.login();
        sales.selectproduct1();
        sales.selectproduct2();
        sales.selectproduct3();
        sales.Shoppingcart();
        sales.checkout();
        cart.chekoutproducts();
        order.chekoutproducts();
        order.close();








    }
}
