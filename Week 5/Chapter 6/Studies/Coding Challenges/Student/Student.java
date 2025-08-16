public class Student {
    // Fields
    private String name;
    private int studentID;
    private double grade;

    private static int studentNumber = 0;
    // Constructs
    public Student() {
        this.name = "Unknown";
        this.studentID = 0;
        this.grade = 0.0;
        studentNumber++;
    }

    public Student(String name, int studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        studentNumber++;
    }

    // Getters and Setters
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public int getStudentID() { return studentID;}
    public void setStudentID(int studentID) { this.studentID = studentID;}

    public double getGrade() { return grade;}
    public void setGrade(double grade) { this.grade = grade;}

    // Methods
    public String calculateLetterGrade() {
        return switch ((int) getGrade() / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

    public void displayInfo() {
        System.out.printf("Student %d:%n", studentNumber);
        System.out.printf("Name: %s%n", getName());
        System.out.printf("ID: %d%n", getStudentID());
        System.out.printf("Grade: %.1f%n", getGrade());
        System.out.printf("Letter Grade: %s%n", calculateLetterGrade());
    }
}