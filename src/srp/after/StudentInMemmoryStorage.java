package srp.after;

import java.util.ArrayList;

public class StudentInMemmoryStorage {
    private ArrayList<Student> students = new ArrayList<>();
    public void save(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }
}
