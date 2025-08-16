public class StudentTest {
    public static void main(String[] args) {
        // Student 1
        Student student1 = new Student();
        student1.displayInfo();
        System.out.println();
        // Student 2
        Student student2 = new Student("John Doe", 12345, 85.5);
        student2.displayInfo();
        System.out.println();

        // Test Setters
        student1.setGrade(92.3);
        student1.setName("Mac");
        student1.setStudentID(54321);
        // Test getters
        System.out.println(student1.getGrade());
        System.out.println(student1.getName());
        System.out.println(student1.getStudentID());
        // Test class method
        System.out.println(student1.calculateLetterGrade());
        System.out.println();
        // Test info after setting
        student1.displayInfo();
    }
}
