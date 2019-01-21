import DAO.DepartmentDAO;
import DAO.StudentDAO;
import Model.Department;
import Model.Student;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*DepartmentDAO departmentDAO = new DepartmentDAO();

        Department department =  new Department();
        department.setDepName("Law");

        Student firstStudent = new Student();
        firstStudent.setFirstName("Harvey");
        firstStudent.setLastName("Specter");
        firstStudent.setDepartment(department);

        Student secondStudent = new Student();
        secondStudent.setFirstName("Mike");
        secondStudent.setLastName("Ross");
        secondStudent.setDepartment(department);

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(firstStudent);
        studentSet.add(secondStudent);

        department.setStudents(studentSet);

        departmentDAO.create(department);*/

        StudentDAO studentDAO = new StudentDAO();

        Student firstStudent = new Student();

        Student secondStudent = new Student();

        firstStudent = studentDAO.read(1);

        secondStudent = studentDAO.read(2);

        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());



    }

}
