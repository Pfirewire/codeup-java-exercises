package grades;

public class StudentTest {
    public static void main(String[] arg) {
        Student steve = new Student("steve");
        System.out.println(steve.getName());
        steve.addGrade(42);
        steve.addGrade(50);
        steve.addGrade(58);
        System.out.println(steve.getGradeAverage());
    }
}
