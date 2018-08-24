package mvc;

public class StudentView {

    public void printStudent(Student student){
        System.out.println("Imie: " + student.getName());
        System.out.println("Nazwisko: " + student.getLastName());
        System.out.println("Index: " + student.getIndexNumber());
    }
}
