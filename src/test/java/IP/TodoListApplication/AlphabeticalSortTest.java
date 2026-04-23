package IP.TodoListApplication;

import IP.TodoListApplication.App.Task;
import IP.TodoListApplication.DataSorting.AlphabeticalSort;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlphabeticalSortTest {

    @Test
public void sortTasksAlphabetically() {
    ArrayList<Task> list = new ArrayList<>();

    Task t1 = new Task();
    t1.setTitle("Banana");

    Task t2 = new Task();
    t2.setTitle("Apple");

    list.add(t1);
    list.add(t2);

    AlphabeticalSort sorter = new AlphabeticalSort();
    sorter.sort(list);

    assertEquals("Apple", list.get(0).getTitle());
    assertEquals("Banana", list.get(1).getTitle());
}
}