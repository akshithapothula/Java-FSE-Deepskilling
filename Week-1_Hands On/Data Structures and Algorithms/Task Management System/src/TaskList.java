public class TaskList {
    private Task head;

    // Add task at the end
    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Added: " + newTask.taskName);
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == taskId) {
            System.out.println("Deleted: " + head.taskName);
            head = head.next;
            return;
        }

        Task prev = head;
        Task current = head.next;

        while (current != null) {
            if (current.taskId == taskId) {
                System.out.println("Deleted: " + current.taskName);
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Task ID " + taskId + " not found.");
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        System.out.println("\n--- Task List ---");
        Task current = head;
        if (current == null) {
            System.out.println("No tasks found.");
            return;
        }
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
