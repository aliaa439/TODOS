package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BrowserActions;

import java.util.List;

public class TaskClass extends BasePage{
    public TaskClass(WebDriver driver) {
        super(driver);
    }
    public List <WebElement> tasks;

    Actions actions = new Actions(driver);


    By clear_completed = By.className("clear-completed");

    //By todos_list = By.xpath("//ul[@class=\"todo-list\"]//app-todo-item//li");

    public void clearAllcompletedTasks(){
        BrowserActions.clickElement(clear_completed,driver);
    }

    public  List<WebElement> toGetAllTasks(){
        //tasks = driver.findElements(By.xpath("//ul//input[@type=\"checkbox\"]"));
        return tasks = driver.findElements(By.tagName("app-todo-item"));

    }

    public void toCompleteTask(int no){
        //tasks.get(no).click();
        WebElement completedone=toGetAllTasks().get(no);
        completedone.findElement(By.tagName("input")).click();
    }

    public void deleteSpecficTask(int xno){
        WebElement deletedone = toGetAllTasks().get(xno);
        actions.moveToElement(deletedone).perform();
        deletedone.findElement(By.tagName("button")).click();
    }

    public void editTask(int no,String newTask){
        WebElement theone = toGetAllTasks().get(no);
        actions.doubleClick(theone).perform();

        WebElement thenew=theone.findElement(By.xpath("//div[@class=\"input-container\"]//input"));
        thenew.sendKeys(newTask);
    }

    public void clearANDeditTask(int no,String newTask){
        WebElement theone = toGetAllTasks().get(no);
        actions.doubleClick(theone).perform();

        WebElement thenew=theone.findElement(By.xpath("//div[@class=\"input-container\"]//input"));
        thenew.clear();
        thenew.sendKeys(newTask);
    }
}
