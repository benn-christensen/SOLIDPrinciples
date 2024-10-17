package srp;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private final ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public double calculateGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void saveStudent() {
        // save student to database
    }
}
