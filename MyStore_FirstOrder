package Zad_warsztat2;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ExamTest2 {

    public static WebDriver driver;

    String email = "10minut@email.com";

    String password = "123456";

@Before
    public void SetUp() {

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.get("https://mystore-testlab.coderslab.pl/index.php");
    driver.findElement(By.className("user-info")).click();
}

@Test
    public void FirstOrder() {

        UserSignIn userSignIn = new UserSignIn(driver);
        userSignIn.SignInUser(email, password);

        ChooseArticle chooseArticle = new ChooseArticle(driver);
        chooseArticle.Clothes();

        OrderVerification orderVerification = new OrderVerification(driver);
        orderVerification.AddressVerification();

        //zrzut ekranu
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("C:\\Users\\Danko\\Desktop\\Test aut\\tmp\\screenExam.jpg"));
        } catch (IOException s) {
            throw new RuntimeException(s);
        }

        //wejście w historie zamówień
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"history-link\"]/span")).click();

        //sprawdzenie czy zamówienie zostało poprawnie złożone
        OrderCheck orderCheck = new OrderCheck(driver);
        orderCheck.OrderListCheck();
    }

    @After
    public void EndTest() {
    driver.quit();
    }
}
