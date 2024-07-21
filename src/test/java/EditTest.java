import org.testng.annotations.Test;
import pages.Filters;
import pages.TaskClass;

public class EditTest extends BaseTest{
    @Test
    public void editTest(){
        TaskClass taskClass =new TaskClass(driver);

        taskClass.addNewToDo("Aliaa");
        taskClass.addNewToDo("first training");
        taskClass.addNewToDo("sports");
        taskClass.addNewToDo("arts");
        taskClass.addNewToDo("friends");
        taskClass.addNewToDo("travels");

        taskClass.editTask(0,"Rana");
        //taskClass.clearANDeditTask(1,"first internship");

    }
}
