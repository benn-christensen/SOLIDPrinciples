package srp.after;

import java.util.ArrayList;

public class GradeCalculator {
    public static double calculateAverage(ArrayList<Grade> grades) {
        double sum = 0;
        if (grades.isEmpty()) {
            return 0;
        }
        int lowestGrade = grades.getFirst().getValue();
        for (Grade grade : grades) {
            sum += grade.getValue();
            if (grade.getValue() < lowestGrade) {
                lowestGrade = grade.getValue();
            }
        }
        return (sum - lowestGrade) / (grades.size() - 1);
    }
}
