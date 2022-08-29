package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;
    private ArrayList<String> daysAbsent;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<>();
        daysAbsent = new ArrayList<>();
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

    public void recordAttendance(String date, String value) {
        if(value.equals("A") || value.equals("P")){
            attendance.put(date, value);
            if (value.equals("A")) {
                daysAbsent.add(date);
            }
        } else {
            System.out.printf("%s is not an acceptable value", value);
        }
    }

    public double getAttendancePercentage() {
        double absences = 0;
        for(String attendance : attendance.values()) {
            if(attendance.equals("A")) {
                absences += 1;
            }
        }
        return (((double) attendance.size() - absences) / (double) attendance.size()) * 100;
    }

    public ArrayList<String> getDaysAbsent() {
        return daysAbsent;
    }
}
