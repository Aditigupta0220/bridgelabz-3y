package oops;
import java.util.*;

// Aggregation: School has multiple Students
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

// Association: Student ↔ Course (many-to-many)
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // maintain bidirectional link
        }
    }

    public void viewEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}