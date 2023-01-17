package Zad_warsztat2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderCheck {

    protected WebDriver driver;

    String orderNumber = "OIMXLKGFU";

    String invoice = "Awaiting check payment";

    String price = "€95.60";

    public OrderCheck(WebDriver driver) {
        this.driver = driver;
    }
    public void OrderListCheck(){
        String listCheck = driver.findElement(By.xpath("//*[@id=\"content\"]/table")).getText();

        if (listCheck.contains(orderNumber) && listCheck.contains(invoice) && listCheck.contains(price)) {
            System.out.println("Order correctly placed");
        } else {
            System.out.println("Order incorrectly placed");
        }
    }
}
