package hw_12.task_6;

import java.time.LocalDate;

/*
Task 6: Task Manager
General Description:
Develop a task management service that allows adding, deleting, and searching for tasks
by various criteria. Each task will have a unique generic identifier, status, priority,
and date.

Functional Requirements:
Classes and Interfaces:
Task<T>: A class representing a task. Must contain fields for ID, status, priority, and date.
TaskService<T>: A task management service that includes methods for adding, deleting,
and searching for tasks.
Task Management:
Add Task: Method for adding a new task to the list.
Delete Task: Method for deleting a task by ID. This method must be synchronized to prevent
concurrency.
Task Search: Methods for filtering tasks by status and priority, as well as sorting tasks
by date.
Data Processing:
Using the Stream API to filter and sort tasks.
Lambda expressions for sorting tasks by date.
*/
public class Task<T> {
    private final T id;
    private final Status status;
    private final Priority priority;
    private final LocalDate date;

    public Task(T id, Status status, Priority priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}
