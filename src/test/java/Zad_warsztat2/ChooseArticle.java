package Zad_warsztat2;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChooseArticle {

    protected WebDriver driver;

    public ChooseArticle(WebDriver driver) {
        this.driver = driver;
    }

    public void Clothes() {

        //wybranie produktu
        driver.findElement(By.xpath("//*[@id=\"category-3\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/div[1]/a/img")).click();

        //sprawdzenie czy jest rabat
        String discount = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[2]")).getText();
        Assertions.assertTrue(discount.contains("SAVE 20%"));
        System.out.println(discount);

        //wybór rozmiaru
        Select sizeM = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
        sizeM.selectByValue("2");

        //dodanie 5 sztuk
        WebElement addPiece = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i"));
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException q) {
            throw new RuntimeException(q);
        }
        for (int i = 0; i < 4; i++) {
            addPiece.click();
        }

        //dodanie do koszyka
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();

        //przejście do koszyka
        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();

        //przejście do płatności
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();
    }
}
