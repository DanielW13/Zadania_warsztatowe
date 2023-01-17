package cucumber.hotelregister;

import POP.AuthenticationPage;
import POP.CreateAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class HotelRegisterSteps {
    private WebDriver driver;

    @Given("user is on main site and click sign in button")
    public void userIsOnMainSiteAndClickSignInButton() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
    }

    @When("user input email address and click create an account button")
    public void userInputEmailAddressAndClickCreateAnAccountButton() {
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.startRegistration(generateEmail());
    }

    @When("user fills in the registration form with {}, {}, {} and click registration button")
    public void userFillsInTheRegistrationButtonAndClickRegistrationButton(String firstName, String lastName, String password) {
        CreateAccount createAccount = new CreateAccount(driver);
        createAccount.registerUser(firstName, lastName, password);
    }

    @Then("user sees my account page")
    public void userSeesMyAccountPage() {
        Assertions.assertEquals("https://hotel-testlab.coderslab.pl/en/my-account", driver.getCurrentUrl());
        //Assertions.assertTrue(driver.getCurrentUrl().contains("https://hotel-testlab.coderslab.pl/pl/moje-konto")
        //        || driver.getCurrentUrl().contains("https://hotel-testlab.coderslab.pl/en/my-account"));
        //        asercja gdy są rożne języki przeglądarki
    }
     @And("user sees its name {}")
        public void userSeesHisHerUserName(String firstName) {
        String userName = driver.findElement(By.xpath("//*[@id='user_info_acc']/span[1]")).getText();
        Assertions.assertEquals(firstName, userName);
}

    public static String generateEmail() {
        Random random = new Random();

        String[] names = {"user", "jdoe", "jasFasola", "superman"};
        String name = names[random.nextInt(names.length)];

        String[] domains = {"mail.com", "gmail.com", "o2.pl", "wp.pl"};
        String domain = domains[random.nextInt(domains.length)];

        int randomNumber = random.nextInt(1000000);
        return name + "_" + randomNumber + "@" + domain;
    }
}