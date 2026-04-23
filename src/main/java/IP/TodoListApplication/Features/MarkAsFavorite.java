package IP.TodoListApplication.Features;

import IP.TodoListApplication.App.Task;
import IP.TodoListApplication.App.TodoList;

import java.util.Scanner;

public class MarkAsFavorite extends Actions {

    @Override
    public void showActionsInformation() {
        System.out.println("");
        System.out.println("To mark a task as favorite, enter ID and press ENTER:");
        System.out.println("");
        System.out.println("Enter 0 to RETURN");
    }

    @Override
    public String readUserInput() {
        while (true) {
            System.out.println("");
            System.out.print("Enter task id:");
            Scanner in = new Scanner(System.in);
            try {
                String userInput = in.nextLine();
                int userInputAsNum = Integer.parseInt(userInput);

                if (userInputAsNum != 0) {
                    Task task = TodoList.tasks.get(userInput);
                    if (task != null) {
                        return userInput;
                    } else {
                        System.out.println("There is no task with this ID, try again:");
                    }
                } else {
                    return userInput;
                }

            } catch (Exception err) {
                System.out.println("Enter a valid ID or 0 to RETURN");
            }
        }
    }

    @Override
    public void executeAction(String command) {
        Task task = TodoList.tasks.get(command);
        task.setFavorite(true);
        System.out.println("Task with ID " + command + " is marked as favorite.");
    }
}
