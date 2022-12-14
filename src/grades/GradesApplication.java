package grades;
import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.entry;

public class GradesApplication {

    public static HashMap<String, Student> populateStudents() {

        Student failingStudent = new Student("Pat");
        failingStudent.addGrade(12);
        failingStudent.addGrade(4);
        failingStudent.addGrade(38);
        failingStudent.recordAttendance("2020-10-07", "A");
        failingStudent.recordAttendance("2020-10-08", "P");
        failingStudent.recordAttendance("2020-10-09", "A");
        failingStudent.recordAttendance("2020-10-10", "A");
        failingStudent.recordAttendance("2020-10-11", "P");
        Student averageStudent = new Student("Harold");
        averageStudent.addGrade(70);
        averageStudent.addGrade(65);
        averageStudent.addGrade(82);
        averageStudent.recordAttendance("2020-10-07", "P");
        averageStudent.recordAttendance("2020-10-08", "P");
        averageStudent.recordAttendance("2020-10-09", "P");
        averageStudent.recordAttendance("2020-10-10", "P");
        averageStudent.recordAttendance("2020-10-11", "P");
        Student straightAStudent = new Student("Eve");
        straightAStudent.addGrade(99);
        straightAStudent.addGrade(100);
        straightAStudent.addGrade(100);
        straightAStudent.recordAttendance("2020-10-07", "P");
        straightAStudent.recordAttendance("2020-10-08", "P");
        straightAStudent.recordAttendance("2020-10-09", "P");
        straightAStudent.recordAttendance("2020-10-10", "P");
        straightAStudent.recordAttendance("2020-10-11", "P");
        Student allOverStudent = new Student("Carol");
        allOverStudent.addGrade(0);
        allOverStudent.addGrade(100);
        allOverStudent.addGrade(92);
        allOverStudent.recordAttendance("2020-10-07", "A");
        allOverStudent.recordAttendance("2020-10-08", "P");
        allOverStudent.recordAttendance("2020-10-09", "P");
        allOverStudent.recordAttendance("2020-10-10", "A");
        allOverStudent.recordAttendance("2020-10-11", "A");

        Map<String, Student> immutableStudents = Map.ofEntries(
                entry("idontcare", failingStudent),
                entry("meh24", averageStudent),
                entry("gaming_rainbows", straightAStudent),
                entry("alibaba7", allOverStudent)
        );

        return new HashMap<>(immutableStudents);
    }

    public static String appOptions() {
        return """
                
                1. View individual Student
                2. View all grades for all Students
                3. View class grade average
                4. View CSV report for all students
                0. Exit
                
                Enter an option: 
                """;
    }

    public static void printSingleStudentData(Student userStudent, int userInput) {
        System.out.format("""
                        ------------------------------------------------
                        Student Name: %s
                        Student GitHub: %s
                        Student Grade Average: %.1f%%
                        Grades: %s
                        Attendance Percentage: %.1f%%
                        Days Absent: %s
                        ------------------------------------------------
                        """,
                userStudent.getName(),
                userInput,
                userStudent.getGradeAverage(),
                userStudent.getAllGrades(),
                userStudent.getAttendancePercentage(),
                userStudent.getDaysAbsent().toString()
        );
    }
    public static void execute() {
        Input inpt = new Input();
        HashMap<String, Student> students = populateStudents();

        boolean userContinue = true;
        int userInput;
        String userStringInput;
        Student userStudent;

        System.out.println("Welcome to my Students class!\n\n");
        do{
            userInput = inpt.getInt(0, 4, appOptions());
            switch (userInput) {
                case 0 -> userContinue = false;
                case 1 -> {
                    System.out.println("Here are the GitHub usernames of my students: \n");
                    students.forEach((githubName, student) -> System.out.printf("|%s| ", githubName));
                    System.out.println("\n");
                    userStringInput = inpt.getString("Which student would you like to see information on? ");
                    if (!students.containsKey(userStringInput)) {
                        System.out.println("\nI couldn't find any students with that GitHub name.\n");
                    } else {
                        userStudent = students.get(userStringInput);
                        printSingleStudentData(userStudent, userInput);
                    }
                }
                case 2 -> {
                    System.out.println("------------------------------------------------");
                    students.forEach((githubName, student) -> System.out.printf("%-12s: %s%n", student.getName(), student.getAllGrades()));
                    System.out.println("------------------------------------------------");
                }
                case 3 -> {
                    double totalClassAverage = 0;
                    System.out.println("------------------------------------------------");
                    for (Student student : students.values()) {
                        totalClassAverage += student.getGradeAverage();
                    }
                    System.out.format("Total Class Average: %.1f%n", totalClassAverage / (double) students.size());
                    System.out.println("------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("------------------------------------------------\n" +
                            "Name         | GitHub username      | Average\n" +
                            "-------------+----------------------+-----------");
                    for (Entry<String, Student> studentEntry : students.entrySet()) {
                        Student student = studentEntry.getValue();
                        String githubName = studentEntry.getKey();
                        System.out.format("%-12s | %-20s | %.1f%n", student.getName(), githubName, student.getGradeAverage());
                    }
//                    students.forEach((githubName, student) -> System.out.format("%-12s | %-20s | %.1f%n", student.getName(), githubName, student.getGradeAverage()));
                    System.out.println("------------------------------------------------");
                }
            }
        } while (userContinue);
    }
    public static void main(String[] arg) {
        execute();
    }
}
