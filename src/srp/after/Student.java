package srp.after;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private final ArrayList<Grade> grades = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addGrade(Grade grade) {
            grades.add(grade);
    }
}
