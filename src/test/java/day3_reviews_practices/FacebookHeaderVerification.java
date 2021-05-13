package day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        WebElement header = driver.findElement(By.className("_8eso"));

        String expectedHeader  =  "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else {
            System.out.println("header verification passed!");


        }
    }
}
