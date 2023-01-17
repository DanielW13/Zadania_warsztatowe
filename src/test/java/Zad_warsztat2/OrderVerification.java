package Zad_warsztat2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderVerification {

    protected WebDriver driver;

    String address = "Boczna";

    String city = "Katowice";

    String zipCode = "33-333";

    String country = "United Kingdom";

    public OrderVerification(WebDriver driver) {
        this.driver = driver;
    }

    public void AddressVerification() {

        //sprawdzenie danych adresowych
        String verification = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[2]/div/div/form/div[1]/article/header/label/div")).getText();

        if (verification.contains(address) && verification.contains(city) && verification.contains(zipCode) && verification.contains(country)) {
            System.out.println("Data is correct");
        } else {
            System.out.println("Data is incorrect");
        }

        //przejście do wyboru dostawy
        driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")).click();

        //wybór i zatwierdzenie dostawy
        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button")).click();

        //wybór płatności i finalizacja zamówienia
        driver.findElement(By.xpath("//*[@id=\"payment-option-1-container\"]/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button")).click();
    }
}