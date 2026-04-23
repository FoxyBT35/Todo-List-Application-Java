package IP.TodoListApplication.DataSorting;

import IP.TodoListApplication.App.Task;
import java.util.ArrayList;
import java.util.Comparator;

public class AlphabeticalSort {

    public void sort(ArrayList<Task> list) {
        list.sort(Comparator.comparing(Task::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}