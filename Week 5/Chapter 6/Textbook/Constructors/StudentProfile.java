import javax.print.attribute.standard.JobHoldUntil;

public class StudentProfile {
    // Fields
    private String name,
                   major,
                   university;
    private int age;

    // Constructors
    public StudentProfile(String name, int age, String major, String university) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.university = university;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getUniversity() { return university; }
    public String getMajor() { return major; }

    // Setters


    // Methods

}

public class Main {
    public static void main(String[] args) {
        StudentProfile studentProfile = new StudentProfile("John", 24, "Computer Science", "MIT");
    }
}
