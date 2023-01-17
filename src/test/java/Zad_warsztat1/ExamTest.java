package Zad_warsztat1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExamTest {

    
    private WebDriver driver;

    
    String email = "10minut@email.com";

    String password = "123456";

    String delete = "Address successfully deleted!";


    
    @Given("user is on main site and click signIn button")
    public void userIsOnMainSiteAndClickSignInButton() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.className("user-info")).click();
    }

    @When("user input email address and password and click sign in button")
    public void userInputEmailAddressAndPasswordAndClickSignInButton() {
        ExamUserLogIn examUserLogIn = new ExamUserLogIn(driver);
        examUserLogIn.SignIn(email,password);
    }

    @When("user clicks an addresses button")
    public void userClicksAnAddressesButton() {
        driver.findElement(By.xpath("//*[@id=\"addresses-link\"]/span/i")).click();
    }

    @When("user clicks create new address button")
    public void userClicksCreateNewAddressButton() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a/span")).click();
    }

    @When("user fills in the new address form with {}, {}, {}, {}, {}, {} and clicks save button")
    public void userFillsInTheNewAddressFormWithAliasAddressCityZipCodeCountryPhone(String alias, String address, String city, String zipCode, String country, String phone) {
        ExamAddressForm examAddressForm = new ExamAddressForm(driver);
        examAddressForm.AddressForm(alias, address, city, zipCode, country,phone);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();
    }

    @Then("user checks the entered data {}, {}, {}, {}, {}, {}")
    public void userChecksTheEnteredDataAndClicksSaveButton(String alias, String address, String city, String zipCode, String country, String phone) {
        String addressData = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]")).getText();

        if (addressData.contains(alias) && addressData.contains(address) && addressData.contains(city) && addressData.contains(zipCode) && addressData.contains(country) && addressData.contains(phone)) {
            System.out.println("Data is correct");
        }
        else {
            System.out.println("Data is incorrect");
        }
    }

    @Then("user deletes new address")
    public void userDeletesNewAddress() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]/span")).click();
    }

    @Then("user checks positive deletion")
    public void userChecksPositiveDeletion() {
        String correctdeletion = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
        Assertions.assertTrue(correctdeletion.contains(delete));
        System.out.println(correctdeletion);
    }

    @And("user closes browser")
    public void userClosesBrowser() {
        driver.quit();
    }
}
