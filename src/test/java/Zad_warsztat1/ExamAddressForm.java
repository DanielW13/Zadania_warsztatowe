package Zad_warsztat1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamAddressForm {

    private WebDriver driver;

    public ExamAddressForm(WebDriver driver){this.driver = driver;}

    public void AddressForm(String alias, String address, String city, String zipCode, String country, String phone){
        driver.findElement(By.id("field-alias")).sendKeys(alias);
        driver.findElement(By.id("field-address1")).sendKeys(address);
        driver.findElement(By.id("field-city")).sendKeys(city);
        driver.findElement(By.id("field-postcode")).sendKeys(zipCode);
        driver.findElement(By.id("field-id_country")).sendKeys(country);
        driver.findElement(By.id("field-phone")).sendKeys(phone);
    }
}
