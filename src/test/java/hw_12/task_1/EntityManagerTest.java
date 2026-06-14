package hw_12.task_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    private EntityManager<Student> manager;

    @BeforeEach
    void setup() {
        manager = new EntityManager<>();
    }

    // ADD
    @Test
    void addOneEntityToEmptyManagerTest() {
        int initialSize = manager.getAll().size();

        Student expectedStudent = new Student("Tom", 17, true);
        Student expectedStudentCopy = new Student("Tom", 17, true);

        manager.add(expectedStudent);
        assertTrue(manager.getAll().contains(expectedStudent));
        Student actualStudent = manager.getAll().getFirst();

        assertEquals(expectedStudentCopy, actualStudent);
        assertEquals(initialSize + 1, manager.getAll().size());
    }

    @Test
    void addOneEntityToNonEmptyManagerTest() {
        Student presentStudent = new Student("Tom", 18, false);
        Student expectedStudent = new Student("Jerry", 15, true);

        manager.add(presentStudent);
        int initialSize = manager.getAll().size();

        manager.add(expectedStudent);
        assertTrue(manager.getAll().contains(expectedStudent));

        Student actualStudent = manager.getAll().get(1);
        assertEquals(expectedStudent, actualStudent);
        assertEquals(initialSize + 1, manager.getAll().size());
    }

    // REMOVE
    @Test
    void removeExistingEntityTest() {
        Student existingStudent = new Student("Artem", 12, true);
        manager.add(existingStudent);
        assertTrue(manager.remove(existingStudent));
        assertFalse(manager.getAll().contains(existingStudent));
    }

    @Test
    void removeNotExistingEntityTest() {
        Student existingStudent = new Student("Artem", 12, true);
        Student nonExistingStudent = new Student("Ivan", 16, true);
        manager.add(existingStudent);
        assertFalse(manager.remove(nonExistingStudent));
    }

    @Test
    void removeFromEmptyManagerTest() {
        Student student = new Student("Igor", 24, true);
        assertFalse(manager.remove(student));
    }

    @Test
    void removeOnlyOneEntityFromDuplicatesTest() {
        Student student = new Student("Maria", 25, false);
        manager.add(student);
        manager.add(student);
        assertTrue(manager.remove(student));
        assertEquals(1, manager.getAll().size());
        assertTrue(manager.getAll().contains(student));
    }

    // GET ALL
    @Test
    void getAllEntitiesTest() {
        Student student1 = new Student("Igor", 24, true);
        Student student2 = new Student("Karina", 22, true);
        Student student3 = new Student("Ivan", 16, false);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);

        List<Student> allStudents = manager.getAll();

        assertEquals(3, allStudents.size());
        assertTrue(allStudents.contains(student1));
        assertTrue(allStudents.contains(student2));
        assertTrue(allStudents.contains(student3));
    }

    @Test
    void getAllElementsCannotModifyInitialCollectionTest() {
        Student student1 = new Student("Igor", 24, true);
        Student student2 = new Student("Karina", 22, true);

        manager.add(student1);
        manager.add(student2);

        List<Student> allStudents = manager.getAll();
        assertThrows(UnsupportedOperationException.class, () -> allStudents.add(
                new Student("Artem", 12, true)
        ));
    }

    // FILTER BY NAME
    @Test
    void filterByNameTest() {
        Student student1 = new Student("Igor", 24, true);
        Student student2 = new Student("Igor", 32, true);
        Student student3 = new Student("Marina", 32, true);

        manager.add(student1);
        manager.add(student2);
        manager.add(student3);

        List<Student> result = manager.filterByName("Igor");

        assertEquals(2, result.size());
        assertTrue(result.contains(student1));
        assertTrue(result.contains(student2));
    }

    @Test
    void filterByNonExistingNameTest() {
        Student kate = new Student("Kate", 25, true);
        manager.add(kate);

        List<Student> result = manager.filterByName("Igor");
        assertTrue(result.isEmpty());
    }

    // FILTER BY AGE
    @Test
    void filterByAgeRangeTest() {
        Student student1 = new Student("Tomr", 25, true);
        Student student2 = new Student("Jerry", 30, true);
        Student student3 = new Student("Nick", 18, false);
        manager.add(student1);
        manager.add(student2);
        manager.add(student3);

        List<Student> result = manager.filterByAge(18, 25);
        assertEquals(2, result.size());
        assertTrue(result.contains(student1));
        assertTrue(result.contains(student3));
    }

    @Test
    void filterByNotInRangeAgeTest() {
        Student student1 = new Student("Tom", 49, true);
        Student student2 = new Student("Jerry", 61, true);

        manager.add(student1);
        manager.add(student2);

        List<Student> result = manager.filterByAge(50, 60);
        assertTrue(result.isEmpty());
    }

    // FILTER BY ACTIVE
    @Test
    void filterByActiveTrueTest() {
        Student active = new Student("Timon", 10, true);
        Student inactive = new Student("Pumbaa", 11, false);

        manager.add(active);
        manager.add(inactive);

        List<Student> result = manager.filterByActive(true);

        assertEquals(1, result.size());
        assertTrue(result.contains(active));
    }

    @Test
    void filterByActiveFalseTest() {
        Student active = new Student("Timon", 10, true);
        Student inactive = new Student("Pumbaa", 11, false);

        manager.add(active);
        manager.add(inactive);

        List<Student> result = manager.filterByActive(false);

        assertEquals(1, result.size());
        assertTrue(result.contains(inactive));
    }
}
