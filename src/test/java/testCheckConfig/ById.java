package testCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class ById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationElement = driver.findElement(By.id("hotel_location"));
        hotelLocationElement.sendKeys("Warsaw");

        WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));

        WebElement enterYourEmailBottomElement = driver.findElement(By.id("newsletter-input"));

        enterYourEmailBottomElement.sendKeys("test@test.com");


        driver.quit();
    }
}
