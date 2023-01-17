package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
    private WebDriver driver;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
    }
    public void registerUser(String firstName, String lastName, String password){
        driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
        driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
        driver.findElement(By.id("passwd")).sendKeys(password);

        driver.findElement(By.id("submitAccount")).click();
    }
}
