package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Zad3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String FirstName = "Karol";
        String LastName = "Kowalski";
        //String Gender = "Male";
        String DateOfbirth = "05/22/2010";
        String Address = "Prosta 51";
        String Email = "karol.kowalski@mailinator.com";
        String Password = "Pass123";
        String Company = "Coders Lab";
        String Comment = "To jest mój pierwszy automat testowy";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement FirstNameField = driver.findElement(By.id("first-name"));
        if (FirstNameField.isDisplayed()) {
            FirstNameField.sendKeys(FirstName);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement LastNameField = driver.findElement(By.id("last-name"));
        if (LastNameField.isDisplayed()) {
            LastNameField.sendKeys(LastName);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement Genderfield = driver.findElement(By.className("radio-inline"));
        if (Genderfield.isDisplayed()) {
            Genderfield.click();
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement DateOfBirthField = driver.findElement(By.id("dob"));
        if (DateOfBirthField.isDisplayed()) {
            DateOfBirthField.sendKeys(DateOfbirth);
        } else {
            System.out.println("Text box is not displayed");
        }

        //Próba przeklikania daty
//        DateOfBirthField.click();
//        driver.findElement(By.className("datepicker-switch")).click();
//        driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-months > table > thead > tr:nth-child(2) > th.datepicker-switch")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr[2]/th[1]")).click();
//        driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-right.datepicker-orient-top > div.datepicker-years > table > tbody > tr > td > span:nth-child(2)")).click();
//        WebElement YearSelectElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[2])"));
//        Select YearSelect = new Select(YearSelectElement);
//        YearSelect.selectByValue("2010");
//        //driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-right.datepicker-orient-top > div.datepicker-years > table > thead > tr:nth-child(2) > th.prev")).click();
//        //driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr[2]/th[1]")).click();
//        //driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[5]")).click();


        WebElement AddressField = driver.findElement(By.id("address"));
        if (AddressField.isDisplayed()) {
            AddressField.sendKeys(Address);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement EmailField = driver.findElement(By.id("email"));
        if (EmailField.isDisplayed()) {
            EmailField.sendKeys(Email);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement PasswordField = driver.findElement(By.id("password"));
        if (PasswordField.isDisplayed()) {
            PasswordField.sendKeys(Password);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement CompanyField = driver.findElement(By.id("company"));
        if (CompanyField.isDisplayed()) {
            CompanyField.sendKeys(Company);
        } else {
            System.out.println("Text box is not displayed");
        }

        WebElement CommentField = driver.findElement(By.id("comment"));
        if (CommentField.isDisplayed()) {
            CommentField.sendKeys(Comment);
        } else {
            System.out.println("Text box is not displayed");
        }
    }
}