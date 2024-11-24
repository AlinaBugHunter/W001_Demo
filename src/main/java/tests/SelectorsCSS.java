package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        hideBanner();
        hideFooter();

        WebElement logo = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(logo.getTagName());

        driver.quit();

    }

    @Test
    public void selectorsRadioButtonPage() {

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement btnYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        btnYes.click();

        driver.quit();

    }

    private void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    private void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }

}
