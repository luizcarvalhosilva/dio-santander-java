package list.basicoperations.tasklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfTasks {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public int getTotalTasks() {
        return tasks.size();
    }

    public void removeTask(String description) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task_x = iterator.next();
            if (task_x.getDescription().equalsIgnoreCase(description)) {
                iterator.remove();
            }
        }
    }

    public List<String> getAllDescriptions() {
        List<String> descriptions = new ArrayList<>();
        Iterator<Task> it = tasks.iterator();

        while (it.hasNext())
            descriptions.add(it.next().getDescription());

        return descriptions;
    }

    /* ALTERNATIVA c/ iterator
     * public List<String> getAllDescriptions() {
        List<String> descriptions = new ArrayList<>();
        Iterator<Task> iterator = tasks.iterator();

        while (iterator.hasNext()) {
            Task task = iterator.next();
            descriptions.add(task.getDescription());
        }

        return descriptions;
    } 
    */
}
