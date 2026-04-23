package IP.TodoListApplication;
import IP.TodoListApplication.App.Task;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void getId() {
        Task task = new Task();
        task.setId("1");
        assertEquals("1", task.getId());
    }

    @Test
    public void getTitle() {
        Task task = new Task();
        task.setTitle("Test");
        assertEquals("Test", task.getTitle());
    }

    @Test
    public void getDueDate() {
        Task task = new Task();
        LocalDate dueDate = LocalDate.of(2020, 12, 12);
        task.setDueDate(dueDate);
        assertEquals(dueDate, task.getDueDate());
    }

    @Test
    public void getStatus() {
        Task task = new Task();
        task.setStatus("Working");
        assertEquals("Working", task.getStatus());
    }

    @Test
    public void getProjectName() {
        Task task = new Task();
        task.setProjectName("Coding");
        assertEquals("Coding", task.getProjectName());
    }

    @Test
    public void setId() {
        Task task = new Task();
        task.setId("1122");
        assertEquals("1122", task.getId());
    }

    @Test
    public void setTitle() {
        Task task = new Task();
        task.setTitle("Clear-Cache");
        assertEquals("Clear-Cache", task.getTitle());
    }

    @Test
    public void setDueDate() {
        Task task = new Task();
        LocalDate dueDate = LocalDate.of(2021, 10, 13);
        task.setDueDate(dueDate);
        assertEquals(dueDate, task.getDueDate());
    }

    @Test
    public void setStatus() {
        Task task = new Task();
        task.setStatus("in-progress");
        assertEquals("in-progress", task.getStatus());
    }

    @Test
    public void setProjectName() {
        Task task = new Task();
        task.setProjectName("Monthly-Supply");
        assertEquals("Monthly-Supply", task.getProjectName());
    }

    @Test
    public void setFavorite() {
        Task task = new Task();
        task.setFavorite(true);
        assertTrue(task.isFavorite());
    }
}