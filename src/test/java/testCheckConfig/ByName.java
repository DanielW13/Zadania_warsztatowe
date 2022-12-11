package testCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocation = driver.findElement(By.name("hotel_location"));
        hotelLocation.sendKeys("Warsaw");

        WebElement searchNow = driver.findElement(By.name("search_room_submit"));

        WebElement enterMail = driver.findElement(By.name("email"));
        enterMail.sendKeys("test@test.com");

        WebElement subscribeButton = driver.findElement(By.name("submitNewsletter"));

        subscribeButton.submit();

        driver.quit();
    }
}
