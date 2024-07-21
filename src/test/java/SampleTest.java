import org.testng.annotations.Test;
import pages.Filters;
import pages.TaskClass;

public class SampleTest extends BaseTest{
    @Test
    public void SampleTest() {

        TaskClass taskClass =new TaskClass(driver);
        Filters filter = new Filters(driver);

        taskClass.addNewToDo("Aliaa");
        taskClass.addNewToDo("first training");
        taskClass.addNewToDo("Qorrect platform");
        taskClass.addNewToDo("testing");
        taskClass.addNewToDo("sports");

        taskClass.toCompleteTask(1);
        taskClass.toCompleteTask(3);

        filter.getAllCompletedTasks();
        filter.getActiveTasks();
        filter.getAllTasks();

        soft.assertAll();
    }
}
