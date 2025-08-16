public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.getTotalStudents());

        Student student1 = new Student("Nathan");
        student1.getStudentInfo();
        System.out.println(student1.getTotalStudents());

        Student student2 = new Student("Mac");
        student2.getStudentInfo();
        System.out.println(student2.getTotalStudents());

        Student student3 = new Student("Paul");
        student3.getStudentInfo();
        System.out.println(student3.getTotalStudents());

    }
}
