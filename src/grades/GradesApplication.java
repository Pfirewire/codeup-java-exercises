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

        boolean userContinue;
        String userInput;
        Student userStudent;
        System.out.println("Welcome to my Students class!\n\n" +
                "Here are all the GitHub names of my Students:\n");
        students.forEach((gitHubName, student) -> {
            System.out.printf("|%s| ", gitHubName);
        });
        System.out.println();
        do{
            userInput = inpt.getString("Which student would you like to see information on? ");
            if (!students.containsKey(userInput)) {
                System.out.println("\nI couldn't find any students with that GitHub name.\n");
            } else {
                userStudent = students.get(userInput);
                System.out.printf("%nStudent Name: %s%n" +
                        "Student GitHub: %s%n" +
                        "Student Grade Average: %s%n%n", userStudent.getName(), userInput, userStudent.getGradeAverage());
            }

            userContinue = inpt.yesNo("Do you wish to continue? ");
        } while(userContinue);
    }
}
