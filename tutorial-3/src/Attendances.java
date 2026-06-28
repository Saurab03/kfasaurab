
class Attendance {
    protected String studentName;
    protected int classesAttended;
    protected int totalClasses;

    public Attendance(String studentName, int classesAttended, int totalClasses) {
        this.studentName = studentName;
        this.classesAttended = classesAttended;
        this.totalClasses = totalClasses;
    }

    public double calculateAttendance() {
        return ((double) classesAttended / totalClasses) * 100;
    }

    public void display() {
        System.out.printf("%s attendance: %.2f%%\n", studentName, calculateAttendance());
    }
}

class EngineeringAttendance extends Attendance {
    private int labSessionsAttended;
    private int totalLabSessions;

    public EngineeringAttendance(String studentName, int classesAttended, int totalClasses,
                                 int labSessionsAttended, int totalLabSessions) {
        super(studentName, classesAttended, totalClasses);
        this.labSessionsAttended = labSessionsAttended;
        this.totalLabSessions = totalLabSessions;
    }

    @Override
    public double calculateAttendance() {
        double lectureRate = (double) classesAttended / totalClasses;
        double labRate = (double) labSessionsAttended / totalLabSessions;
        return (lectureRate * 0.6 + labRate * 0.4) * 100;
    }
}

class MedicalAttendance extends Attendance {
    private int clinicalHoursAttended;
    private int totalClinicalHours;

    public MedicalAttendance(String studentName, int classesAttended, int totalClasses,
                             int clinicalHoursAttended, int totalClinicalHours) {
        super(studentName, classesAttended, totalClasses);
        this.clinicalHoursAttended = clinicalHoursAttended;
        this.totalClinicalHours = totalClinicalHours;
    }

    @Override
    public double calculateAttendance() {
        double lectureRate = (double) classesAttended / totalClasses;
        double clinicalRate = (double) clinicalHoursAttended / totalClinicalHours;
        return (lectureRate * 0.4 + clinicalRate * 0.6) * 100;
    }
}

public class Attendances {
    public static void main(String[] args) {
        Attendance eng = new EngineeringAttendance("Supriya Rawal", 40, 50, 18, 20);
        Attendance med = new MedicalAttendance("Saurab Chaulagai", 45, 50, 90, 100);

        eng.display();
        med.display();
    }
}
