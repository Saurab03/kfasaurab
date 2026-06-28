
class Member {
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public int getBorrowingLimit() {
        return 2;
    }

    public void displayLimit() {
        System.out.println(name + " can borrow up to " + getBorrowingLimit() + " book(s).");
    }
}

class StudentMember extends Member {
    public StudentMember(String name) {
        super(name);
    }

    @Override
    public int getBorrowingLimit() {
        return 3;
    }
}

class TeacherMember extends Member {
    public TeacherMember(String name) {
        super(name);
    }

    @Override
    public int getBorrowingLimit() {
        return 8;
    }
}

public class LibraryMember {
    public static void main(String[] args) {
        Member m1 = new StudentMember("Saurab");
        Member m2 = new TeacherMember("Sandesh");

        m1.displayLimit();
        m2.displayLimit();
    }
}
 