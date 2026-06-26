package hw_12.task_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService<Integer> service;
    private Task<Integer> task1;
    private Task<Integer> task2;
    private Task<Integer> task3;

    @BeforeEach
    void setup() {
        service = new TaskService<>();

        task1 = new Task<>(1, Status.DONE, Priority.HIGH, LocalDate.of(2026, 6, 19));
        task2 = new Task<>(2, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.of(2026, 7, 31));
        task3 = new Task<>(3, Status.NEW, Priority.LOW, LocalDate.of(2026, 8, 30));
    }

    @Test
    void testAddTask() {
        service.addTask(task1);
        List<Task<Integer>> allTasks = service.getAll();
        assertEquals(1, allTasks.size());
        assertTrue(allTasks.contains(task1));
    }

    @Test
    void testAddDuplicateTask() {
        service.addTask(task1);
        assertThrows(IllegalArgumentException.class, () ->
                service.addTask(task1));
    }

    @Test
    void testRemoveTaskById() {
        service.addTask(task1);
        service.removeTaskById(task1.getId());
        assertTrue(service.getAll().isEmpty());
    }

    @Test
    void testRemoveTaskByNonExistingId() {
        service.addTask(task1);
        assertFalse(service.removeTaskById(task2.getId()));
    }

    @Test
    void testFindByStatus() {
        service.addTask(task1);
        service.addTask(task2);

        List<Task<Integer>> filteredByStatus = service.findByStatus(Status.DONE);

        assertEquals(1, filteredByStatus.size());
        assertEquals(1, filteredByStatus.getFirst().getId());
    }

    @Test
    void testFindByPriority() {
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> filteredByPriority = service.findByPriority(Priority.MEDIUM);

        assertEquals(1, filteredByPriority.size());
        assertEquals(task2, filteredByPriority.get(0));
    }

    @Test
    void testSortByDate() {
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> sortedByDate = service.sortByDate();
        assertEquals(task3, sortedByDate.get(2));
    }
}
