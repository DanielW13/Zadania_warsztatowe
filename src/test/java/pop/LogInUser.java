package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInUser {
    private WebDriver driver;

    public LogInUser(WebDriver driver) {
        this.driver = driver;
    }
    public void UserIn(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }
}
