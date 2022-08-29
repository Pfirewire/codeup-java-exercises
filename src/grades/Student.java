package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return (double) total / (double) grades.size();
    }

    // method to return string with every value in grades ArrayList
    public String getAllGrades() {
        String allGrades = "";
        for (int grade : grades) {
            allGrades = allGrades + grade + " ";
        }
        return allGrades;
    }

}
