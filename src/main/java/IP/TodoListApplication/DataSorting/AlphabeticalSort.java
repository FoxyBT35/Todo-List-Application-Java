package IP.TodoListApplication.DataSorting;

import IP.TodoListApplication.App.Task; // Import the correct Task class
import java.util.ArrayList;
import java.util.Comparator;

public class AlphabeticalSort {
    /**
     * Logic for alphabetical sorting to satisfy Task 2 (CO2).
     */
    public void sort(ArrayList<Task> list) {
        // This sorts the list by the task description/title
        // Note: Check Task.java for the exact getter name (e.g., getDescription or getTitle)
        list.sort(Comparator.comparing(Task::getDescription, String.CASE_INSENSITIVE_ORDER));
        System.out.println(">>> Tasks sorted alphabetically.");
    }
}