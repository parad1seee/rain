package Model;

import java.util.Set;

public class Department {

    private int depID;

    private String depName;

    private Set<Student> students;

    public Department(int depID, String depName, Set<Student> students) {
        this.depID = depID;
        this.depName = depName;
        this.students = students;
    }

    public Department() {
        this(0,null,null);
    }

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Model.Department{" +
                "depID=" + depID +
                ", depName='" + depName + '\'' +
                '}';
    }
}
