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
        do{

            userContinue = inpt.yesNo("Do you wish to continue? ");
        } while(userContinue);
    }
}
