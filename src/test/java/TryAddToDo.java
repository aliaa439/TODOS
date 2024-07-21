import org.testng.annotations.Test;
import pages.Filters;
import pages.TaskClass;

public class TryAddToDo extends BaseTest{
    @Test
    public void TryAddToDo(){
        TaskClass taskClass =new TaskClass(driver);
        Filters filter = new Filters(driver);

        taskClass.addNewToDo("Aliaa");
        taskClass.addNewToDo("first training");
        taskClass.addNewToDo("sports");
        taskClass.addNewToDo("arts");
        taskClass.addNewToDo("friends");
        taskClass.addNewToDo("travels");

        taskClass.toCompleteTask(1);
        taskClass.toCompleteTask(2);


        taskClass.deleteSpecficTask(1);
    }

}
