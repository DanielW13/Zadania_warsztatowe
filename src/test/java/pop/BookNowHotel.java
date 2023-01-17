package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookNowHotel {

    private WebDriver driver;

    public BookNowHotel(WebDriver driver) {
        this.driver = driver;
    }
    public void bookHotel() {
        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[2]/div/div[2]/a/span")).click();


    }
}
