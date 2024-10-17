package srp.after;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Grade> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
            grades.add(grade);
    }
}
