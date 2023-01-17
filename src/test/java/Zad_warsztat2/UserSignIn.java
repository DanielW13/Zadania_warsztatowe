package Zad_warsztat2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSignIn {
    protected WebDriver driver;

    public UserSignIn(WebDriver driver){this.driver = driver;}

    public void SignInUser(String email, String password) {
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();
    }
}

