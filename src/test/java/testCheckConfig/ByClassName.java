package testCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();

        //WebElement emailAddress = driver.findElement(By.cssSelector("is_required validate account_input form-control"));
        WebElement emailAddress = driver.findElement(By.id("email_create"));

        emailAddress.sendKeys("test1323@test.com");

        WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
        createAccount.click();

        driver.quit();
    }
}
