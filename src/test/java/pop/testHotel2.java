package POP;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testHotel2 {
    String email = "test1323@test.pl";
    String password = "12345";
    String hotelLocation = "Katowice";
    String checkInDate = "22-12-2022";
    String checkOutDate = "30-12-2022";

    @Test

    public void UserLogIn() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a")).click();

        LogInUser logInUser = new LogInUser(driver);
        logInUser.UserIn(email, password);

        driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();

        HomePageSearch homePageSearch = new HomePageSearch(driver);
        homePageSearch.SearchHotel(hotelLocation, checkInDate, checkOutDate);

        BookNowHotel bookNowHotel = new BookNowHotel(driver);
        bookNowHotel.bookHotel();

//        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")).getText();
//        Assertions.assertTrue("Room successfully added to your cart");


    }
}
