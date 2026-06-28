
abstract class Scholarship {
    protected String studentName;

    public Scholarship(String studentName) {
        this.studentName = studentName;
    }

    public abstract boolean isEligible();

    public void checkEligibility() {
        if (isEligible()) {
            System.out.println(studentName + " IS eligible for " + this.getClass().getSimpleName() + ".");
        } else {
            System.out.println(studentName + " is NOT eligible for " + this.getClass().getSimpleName() + ".");
        }
    }
}

class MeritScholarship extends Scholarship {
    private double gpa;
    private static final double MIN_GPA = 3.6;

    public MeritScholarship(String studentName, double gpa) {
        super(studentName);
        this.gpa = gpa;
    }

    @Override
    public boolean isEligible() {
        return gpa >= MIN_GPA;
    }
}

class NeedBasedScholarship extends Scholarship {
    private double familyIncome;
    private static final double MAX_INCOME = 300000.0;

    public NeedBasedScholarship(String studentName, double familyIncome) {
        super(studentName);
        this.familyIncome = familyIncome;
    }

    @Override
    public boolean isEligible() {
        return familyIncome <= MAX_INCOME;
    }
}

public class ScholarShip {
    public static void main(String[] args) {
        Scholarship s1 = new MeritScholarship("Saurab Chaulagai", 3.8);
        Scholarship s2 = new MeritScholarship("Arjun Basnet", 3.2);
        Scholarship s3 = new NeedBasedScholarship("Sarita Oli", 250000.0);
        Scholarship s4 = new NeedBasedScholarship("Manish KC", 450000.0);

        s1.checkEligibility();
        s2.checkEligibility();
        s3.checkEligibility();
        s4.checkEligibility();
    }
}

