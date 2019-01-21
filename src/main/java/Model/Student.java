package Model;

public class Student {
    private int StudentID;

    private String firstName;

    private String lastName;

    private Department department;

    public Student(int studentID, String firstName, String lastName, Department department) {
        this.StudentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Student() {
        this(0,null,null,null);
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Model.Student{" +
                "StudentID=" + StudentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department.toString() +
                '}';
    }
}
