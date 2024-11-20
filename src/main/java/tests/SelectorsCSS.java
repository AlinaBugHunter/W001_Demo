package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsCSS {

    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {

        // driver.navigate().to("https://demoqa.com/");
        // The option to open the browser
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(logo.getTagName());

        driver.quit();

    }

    @Test
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
