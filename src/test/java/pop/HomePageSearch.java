package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageSearch {

    private WebDriver driver;

    public HomePageSearch(WebDriver driver){
        this.driver = driver;
    }
    public void SearchHotel(String hotelLocation, String checkInDate, String checkOutDate) {
        driver.findElement(By.id("hotel_location")).sendKeys(hotelLocation);
        driver.findElement(By.id("hotel_cat_name")).click();
        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li")).click();
        driver.findElement(By.id("check_in_time")).sendKeys(checkInDate);
        driver.findElement(By.id("check_out_time")).sendKeys(checkOutDate);
        driver.findElement(By.id("search_room_submit")).click();
    }
}
