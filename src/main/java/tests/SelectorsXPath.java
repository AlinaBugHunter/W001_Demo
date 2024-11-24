package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsXPath {

    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsRadioButton() {

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement btnYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        btnYes.click();
        threadSleep();

        WebElement btnImpressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        btnImpressive.click();

        threadSleep();
        driver.quit();

    }

    @Test
    public void selectorsTextBox() {

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement inputFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        inputFullName.sendKeys("Alina Bug Hunter");

        WebElement inputEmail = driver.findElement(By.xpath("//form/div[@id='userEmail-wrapper']//input"));
        inputEmail.sendKeys("testemail@gmail.com");

        WebElement inputAddress = driver.findElement(By.xpath("//*[text()='Current Address']/../..//textarea"));
        inputAddress.sendKeys("Tel Aviv, Israel");

        threadSleep();
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

    public void threadSleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
