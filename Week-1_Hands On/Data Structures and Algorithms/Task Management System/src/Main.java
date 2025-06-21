public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        // Create sample tasks
        Task t1 = new Task(1, "Design UI", "Pending");
        Task t2 = new Task(2, "Implement Backend", "In Progress");
        Task t3 = new Task(3, "Write Tests", "Pending");

        // Add tasks
        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        // Traverse all tasks
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\n--- Search Task ID 2 ---");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        // Delete a task
        System.out.println("\n--- Delete Task ID 2 ---");
        taskList.deleteTask(2);

        // Traverse again
        taskList.traverseTasks();
    }
}
