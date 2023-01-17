package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    private WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void startRegistration(String email){
        driver.findElement(By.id("email_create")).sendKeys(email);
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
