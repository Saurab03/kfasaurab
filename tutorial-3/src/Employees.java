
class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
    }
}

class Teacher extends Employee {
    private String subject;

    public Teacher(String name, int employeeId, String subject) {
        super(name, employeeId);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role        : Teaching Staff");
        System.out.println("Subject     : " + subject);
    }
}

class AdminStaff extends Employee {
    private String department;

    public AdminStaff(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role        : Administrative Staff");
        System.out.println("Department  : " + department);
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Teacher("Saurab CHaulagai", 201, "Mathematics");
        Employee e2 = new AdminStaff("Shanti Chaulagai", 202, "Finance");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}