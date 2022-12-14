package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        driver.findElement(By.className("user-info")).click();

        driver.findElement(By.className("no-account")).click();

        driver.navigate().back();
        driver.navigate().back();
    }
}
