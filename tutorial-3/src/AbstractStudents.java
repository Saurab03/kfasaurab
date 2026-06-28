
abstract class AbstractStudent {
    protected String name;
    protected int rollNumber;

    public AbstractStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public abstract double calculateFee();

    public void displayFee() {
        System.out.println(name + " (Roll No: " + rollNumber + ") Fee: Rs. " + calculateFee());
    }
}

class Undergraduate extends AbstractStudent {
    private int creditsTaken;
    private static final double RATE_PER_CREDIT = 1500.0;

    public Undergraduate(String name, int rollNumber, int creditsTaken) {
        super(name, rollNumber);
        this.creditsTaken = creditsTaken;
    }

    @Override
    public double calculateFee() {
        // Undergraduate fee = flat rate per credit
        return creditsTaken * RATE_PER_CREDIT;
    }
}

class Graduate extends AbstractStudent {
    private int creditsTaken;
    private double researchFee;
    private static final double RATE_PER_CREDIT = 2500.0;

    public Graduate(String name, int rollNumber, int creditsTaken, double researchFee) {
        super(name, rollNumber);
        this.creditsTaken = creditsTaken;
        this.researchFee = researchFee;
    }

    @Override
    public double calculateFee() {
        return (creditsTaken * RATE_PER_CREDIT) + researchFee;
    }
}

public class AbstractStudents {
    public static void main(String[] args) {

        AbstractStudent ug = new Undergraduate("Saurab Chaulagai", 110, 18);
        AbstractStudent gd = new Graduate("Kabita Chaulagai", 220, 12, 5000.0);

        ug.displayFee();
        gd.displayFee();
    }
}

