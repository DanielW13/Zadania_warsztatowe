package testCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ByXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String email = "test1323333@test.com";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInButton = driver.findElement(By.className("hide_xs"));
        signInButton.click();

        //WebElement emailAddress = driver.findElement(By.cssSelector("is_required validate account_input form-control"));
        WebElement emailAddress = driver.findElement(By.id("email_create"));

        emailAddress.sendKeys(email);

        WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
        createAccount.click();

        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        //firstNameField.sendKeys("Dan");
        if (firstNameField.isDisplayed()) {
            firstNameField.sendKeys("Dan");
        } else {
            System.out.println("First name is not displayed");
        }

        WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        //lastNameField.sendKeys("Will");
        if (lastNameField.isDisplayed()) {
            lastNameField.sendKeys("Will");
        } else {
            System.out.println("Last name is not displayed");
        }

        WebElement emailAdress = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailAdress.clear();
        //emailAdress.sendKeys(email);
        if (emailAdress.isDisplayed()) {
            emailAdress.sendKeys(email);
        } else {
            System.out.println("Email is not displayed");
        }

        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        //passwordField.sendKeys("12345");
        if (passwordField.isDisplayed()) {
            passwordField.sendKeys("12345");
        } else {
            System.out.println("Password is not displayed");
        }

        WebElement daySelectElement = driver.findElement(By.id("days")) ;
        Select daySelect = new Select(daySelectElement);
        daySelect.selectByValue("16");

        WebElement newsletterCheckbox = driver.findElement(By.id("newsletter"));
        if(!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();

        //WebElement myPersonalButton = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > span"));

        //WebElement myAddresses = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > i"));

    }
}
