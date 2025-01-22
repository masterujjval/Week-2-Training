import java.util.*;

// Driver class
public class Main {
    public static void main(String[] args) {
        // Create a University
        University university = new University("Tech University");

        // Add Departments to the University
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Add Faculty members to Departments
        Faculty faculty1 = new Faculty("Dr. ujjwal");
        Faculty faculty2 = new Faculty("Dr. kapeed");
        Faculty faculty3 = new Faculty("Dr. akshit");

        university.addFacultyToDepartment("Computer Science", faculty1);
        university.addFacultyToDepartment("Computer Science", faculty2);
        university.addFacultyToDepartment("Mechanical Engineering", faculty3);

        // Show University details
        university.showDetails();

        // Demonstrate aggregation by showing a Faculty member existing independently
        System.out.println("\nIndependent Faculty: " + faculty1.getName());

        // Delete the University (Composition relationship: Departments are also deleted)
        university = null;
        System.gc(); // Suggest garbage collection

        System.out.println("\nThe University and its departments have been deleted!");
    }
}

// University Class
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a Department to the University
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add a Faculty to a specific Department
    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
            }
        }
    }

    // Display University details
    public void showDetails() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            department.showDetails();
        }
    }
}

// Department Class (Composition: Exists only within a University)
class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add Faculty to the Department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display Department details
    public void showDetails() {
        System.out.println("  Department: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("    Faculty: " + faculty.getName());
        }
    }
}

// Faculty Class (Aggregation: Can exist independently of a Department)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

