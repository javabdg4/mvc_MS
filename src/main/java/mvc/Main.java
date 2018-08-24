package mvc;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(
                "Jack",
                "Sparrow",
                "420"

        );
        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(studentView,student);

        controller.updateView();
        controller.setStudentName("odsfsa");
        controller.updateView();
    }
}
