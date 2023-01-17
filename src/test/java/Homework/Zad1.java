package Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad1 {

    @Test
    public void Homework1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        driver.findElement(By.className("user-info")).click();

        driver.findElement(By.className("no-account")).click();

        driver.navigate().back();
        driver.navigate().back();
    }
}
