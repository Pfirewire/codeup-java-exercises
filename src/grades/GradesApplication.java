package grades;
import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] arg) {
        Input inpt = new Input();
        HashMap<String, Student> students = new HashMap<>();

        Student failingStudent = new Student("Pat");
        failingStudent.addGrade(12);
        failingStudent.addGrade(4);
        failingStudent.addGrade(38);
        Student averageStudent = new Student("Harold");
        averageStudent.addGrade(70);
        averageStudent.addGrade(65);
        averageStudent.addGrade(82);
        Student straightAStudent = new Student("Eve");
        straightAStudent.addGrade(99);
        straightAStudent.addGrade(100);
        straightAStudent.addGrade(100);
        Student allOverStudent = new Student("Carol");
        allOverStudent.addGrade(0);
        allOverStudent.addGrade(100);
        allOverStudent.addGrade(92);

        students.put("idontcare", failingStudent);
        students.put("meh24", averageStudent);
        students.put("gaming_rainbows", straightAStudent);
        students.put("alibaba7", allOverStudent);

        boolean userContinue = true;
        int userInput;
        String userStringInput;
        Student userStudent;

        System.out.println("Welcome to my Students class!\n\n");
        do{
            userInput = inpt.getInt(0, 4, "1. View individual Student\n" +
                "2. View all grades for all Students\n" +
                "3. View class grade average\n" +
                "4. View CSV report for all students\n" +
                "0. Exit\n\n" +
                "Enter an option: ");
            switch (userInput){
                case 0:
                    userContinue = false;
                    break;
                case 1:
                    System.out.println("Here are the GitHub usernames of my students: \n");
                    students.forEach((gitHubName, student) -> {
                        System.out.printf("|%s| ", gitHubName);
                    });
                    System.out.println("\n");
                    userStringInput = inpt.getString("Which student would you like to see information on? ");
                    if (!students.containsKey(userStringInput)) {
                        System.out.println("\nI couldn't find any students with that GitHub name.\n");
                    } else {
                        userStudent = students.get(userStringInput);
                        System.out.format("------------------------%n" +
                                "Student Name: %s%n" +
                                "Student GitHub: %s%n" +
                                "Student Grade Average: %.1f%n" +
                                "Grades: %s%n" +
                                "------------------------%n", userStudent.getName(), userInput, userStudent.getGradeAverage(), userStudent.getAllGrades());
                    }
                    break;
                case 2:

            }
        } while (userContinue);
    }
}
