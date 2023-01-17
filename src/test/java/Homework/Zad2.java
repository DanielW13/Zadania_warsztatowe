package Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Zad2 {
        @Test
                public void Homework2() {
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://mystore-testlab.coderslab.pl/index.php");

            driver.findElement(By.className("user-info")).click();

            driver.findElement(By.className("no-account")).click();

            driver.navigate().back();
            driver.navigate().back();
        }
}