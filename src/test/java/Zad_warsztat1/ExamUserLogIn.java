package Zad_warsztat1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamUserLogIn {

    private WebDriver driver;

    public ExamUserLogIn(WebDriver driver){this.driver = driver;}

    public void SignIn(String email, String password) {
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();
    }
}
