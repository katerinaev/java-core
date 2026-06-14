package hw_12.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Grade must not be negative");
        }
        grades.add(grade);
    }

    public synchronized double getAverageGradeBySubject(String subject) {
        return grades.stream()
                .filter(grade -> grade.getSubject()
                        .equals(subject))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                        .average()
                .orElseThrow(() -> new IllegalArgumentException("No grades on this subject"));
    }

    public List<StudentGrade<T>> getGrades() {
        return List.copyOf(grades);
    }
}
