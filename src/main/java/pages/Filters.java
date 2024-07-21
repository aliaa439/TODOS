package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserActions;

public class Filters extends BasePage{

    By All_butt = By.linkText("All");
    By Active_butt = By.linkText("Active");
    By complete_butt = By.linkText("Completed");

    public Filters(WebDriver driver) {
        super(driver);
    }

    public void getAllTasks(){
        BrowserActions.clickElement(All_butt,driver);
    }

    public void getActiveTasks(){
        BrowserActions.clickElement(Active_butt,driver);
    }

    public void getAllCompletedTasks(){
        BrowserActions.clickElement(complete_butt,driver);
    }
}
