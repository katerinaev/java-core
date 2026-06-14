package hw_12.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        boolean exist = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));

        if (exist) {
            throw new IllegalArgumentException("Task with this id is already exists");
        }

        tasks.add(task);
    }

    public synchronized boolean removeTaskById(T id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public List<Task<T>> findByStatus(Status status) {
        return tasks.stream()
                .filter(t -> t.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> findByPriority(Priority priority) {
        return tasks.stream()
                .filter(t -> t.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDate() {
        return tasks.stream()
                .sorted(
                        Comparator.comparing(Task<T>::getDate)
                )
                .toList();
    }

    public List<Task<T>> getAll() {
        return List.copyOf(tasks);
    }
}
