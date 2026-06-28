
class StudentWithId {
    private static int counter = 1000;

    private String name;
    private final int studentId;
    public StudentWithId(String name) {
        this.name = name;
        counter++;
        this.studentId = counter;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + " | Name: " + name);
    }
}

public class StaticIdGenerator {
    public static void main(String[] args) {
        StudentWithId s1 = new StudentWithId("Saurab Chaulagai");
        StudentWithId s2 = new StudentWithId("Sandesh BHandari");
        StudentWithId s3 = new StudentWithId("Sumit Khatri");

        s1.display();
        s2.display();
        s3.display();
    }
}
 