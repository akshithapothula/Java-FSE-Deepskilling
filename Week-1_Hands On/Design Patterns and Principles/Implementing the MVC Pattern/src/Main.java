public class Main {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Aravind", "S101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Update model data
        controller.setStudentName("Aravind Pothula");
        controller.setStudentGrade("A+");

        // Display updated data
        System.out.println("\nAfter updating student details:");
        controller.updateView();
    }
}
