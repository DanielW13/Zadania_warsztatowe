package POP;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testHotel {

    String email = "test1323@test.pl";
    String password = "12345";
    String firstName = "Dan";
    String lastName = "Will";


    @Test
    public void registerUserTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a")).click();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.startRegistration(email);

        CreateAccount createAnAccountPage = new CreateAccount(driver);
        createAnAccountPage.registerUser(firstName, lastName, password);
    }
}
