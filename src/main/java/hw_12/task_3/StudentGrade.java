package hw_12.task_3;
/*
Task 3: Student Grade Management

Description:
Create a system for managing and analyzing student grades using a generalized approach.
The system should support various types of numerical grades, provide input validation,
and provide functionality for calculating statistical indicators.

Functional Requirements:
StudentGrade<T> Class:
Fields for the student's name, subject, and grade.
The grade must be of type T, which extends the Number class.
Constructor for initializing all fields.
Getters for accessing fields.
GradeService<T> Service:
List<StudentGrade<T>> for storing grades.
Method for adding a grade (addGrade), which also validates the grade to ensure it
is not negative.
Method for calculating the average of grades for a specific subject.
Exception handling via InvalidGradeException if the grade is invalid.
Multithreading:
Ensuring thread safety when adding estimates using synchronized.
*/
public class StudentGrade<T> {
    private final String studentName;
    private final String subject;
    private final T grade;

    public StudentGrade(String studentName, String subject, T grade) {
        this.studentName = studentName;
        this.subject = subject;
        this.grade = grade;
    }

    public  String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }
}
