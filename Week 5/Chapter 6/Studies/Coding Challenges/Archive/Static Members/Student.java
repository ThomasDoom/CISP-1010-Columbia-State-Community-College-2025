public class Student {
    // Fields
    private String name;
    private int studentID;

    private static int nextID = 1000;
    private static int totalStudents = 0;

    // Constructors
    public Student() {}

    public Student(String name) {
        this.name = name;
        this.studentID = nextID;
        nextID++;
        totalStudents++;
    }

    // Getters and Setters
    public int getTotalStudents() {
        return totalStudents;
    }

    public void getStudentInfo() {
        System.out.printf("Student: %s%nID: %d%n", this.name, studentID);
    }

    // Methods


}