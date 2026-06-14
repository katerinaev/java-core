package hw_12.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    private GradeService<Integer> service;

    @BeforeEach
    void setup() {
        service = new GradeService<>();
    }

    @Test
    void testAddValidGrade() {
        service.addGrade(new StudentGrade<>("Artem", "Math", 10));
        assertEquals(1, service.getGrades().size());
    }

    @Test
    void testAverageGradeForSubject() {
        service.addGrade(new StudentGrade<>("Tom", "Psychology", 7));
        service.addGrade(new StudentGrade<>("Jerry", "Psychology", 10));

        assertEquals(8.5, service.getAverageGradeBySubject("Psychology"));
    }

    @Test
    void testAverageGradeForSubjectNotFound() {
        service.addGrade(new StudentGrade<>("Tom", "Psychology", 7));

        assertThrows(IllegalArgumentException.class, () -> service.getAverageGradeBySubject("Sociology"));
    }
}
