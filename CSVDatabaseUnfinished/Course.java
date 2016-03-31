package CSVDatabaseUnfinished;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Double> grades;

    public Course(String courseName, Double grade){
        this.courseName = courseName;
        this.grades.add(grade);
    }

    public void SetName(String courseName){
        this.courseName = courseName;
    }
    public void SetGrades(ArrayList<Double> grades){
        for (Double d:grades
             ) {
            this.grades.add(d);
        }
    }
}
