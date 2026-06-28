
class Student {
    private String name;
    private int rollNumber;
    private String faculty;

    public Student(String name, int rollNumber, String faculty) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void displayProfile() {
        System.out.println("---- Student Profile ----");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Faculty     : " + faculty);
    }
}

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student("Saurab Chaulagai", 101, "Cyber Security");
        s1.displayProfile();

        System.out.println();

        s1.setFaculty("Information Technology");
        System.out.println("After updating faculty using setter:");
        s1.displayProfile();
    }
}