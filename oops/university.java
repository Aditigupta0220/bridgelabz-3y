package oops;
import java.util.*;

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        departments.clear(); // Composition: departments are deleted with university
    }
}

class Department {
    String name;
    List<Faculty> faculties = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}
