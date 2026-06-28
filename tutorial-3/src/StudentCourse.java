
import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}

class StudentWithCourses {
    private String name;
    private int rollNumber;

    private List<Course> registeredCourses;

    public StudentWithCourses(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        System.out.println(name + " registered for " + course);
    }

    public void displayRegisteredCourses() {
        System.out.println("\nCourses registered by " + name + " (Roll No: " + rollNumber + "):");
        if (registeredCourses.isEmpty()) {
            System.out.println("  No courses registered yet.");
            return;
        }
        for (Course c : registeredCourses) {
            System.out.println("  -> " + c);
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        Course oop = new Course("BCSNT6063", "Object Oriented Programming");
        Course dbms = new Course("BCSNT6064", "Database Management Systems");
        Course networking = new Course("BCSNT6065", "Computer Networking");

        StudentWithCourses student = new StudentWithCourses("Saurab Chaulagai", 7);

        student.registerCourse(oop);
        student.registerCourse(dbms);
        student.registerCourse(networking);

        student.displayRegisteredCourses();
    }
}