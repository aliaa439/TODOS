package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import javax.swing.*;

public class BrowserActions {
    static WebDriverWait  wait;

    public static void waitElement(By webelement, WebDriver driver){
        wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(webelement));
    }
    public static void clickElement(By webelement, WebDriver driver){
       // wait = new WebDriverWait(driver,30);
        waitElement(webelement,driver);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
        driver.findElement(webelement).click();
    }

    public static void sendkeys(By webelement, WebDriver driver, String textkeys){
        //wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(webelement));
        waitElement(webelement,driver);
        //driver.findElement(webelement).sendKeys(keys);
        WebElement done =driver.findElement(webelement);
        done.sendKeys(textkeys);
        done.sendKeys(Keys.ENTER);
    }
    public static String getText(By webelement, WebDriver driver){
        waitElement(webelement,driver);
        return driver.findElement(webelement).getText();
    }


}
