package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://mystore-testlab.coderslab.pl//index.php?controller=authentication&create_account=1");

        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/div[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"field-firstname\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"field-lastname\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"field-email\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[5]/div[1]/div/span/button")).click();

        driver.findElement(By.xpath("//*[@id=\"field-birthday\"]")).click();
    }
}
