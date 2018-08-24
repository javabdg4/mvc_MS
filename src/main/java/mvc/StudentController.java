package mvc;

public class StudentController {
    //klasa kontrolera przyjmuje obiekty widoku i modelu

    private StudentView studentView;
    private Student student;

    public StudentController(StudentView studentView, Student student) {
        this.studentView = studentView;
        this.student = student;
    }

    public void setStudentName(String name){
        student.setName(name);
    }
    public void updateView(){
        studentView.printStudent(student);
    }
}
