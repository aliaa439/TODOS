package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserActions;

public class BasePage {
    WebDriver driver;
    //WebDriverWait wait;

    By texttask= By.className("new-todo");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        //wait = new WebDriverWait(driver,30);
    }

    public void addNewToDo(String new_task){
        BrowserActions.sendkeys(texttask,driver,new_task);

    }

}
