package mvc;

public class Student {

    private String name;
    private String lastName;
    private String indexNumber;

    public Student(String name, String lastName, String indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
