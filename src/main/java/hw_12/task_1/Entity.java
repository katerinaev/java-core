package hw_12.task_1;

import java.util.Objects;

/*
Task 1: A Generic Entity Manager
Description:
Develop an EntityManager<T> class that will manage a collection of objects of any type T,
providing thread-safe addition, removal, and retrieval of elements. The class should also
provide specific data filtering methods that allow the user to retrieve elements
based on specific criteria.
Functional Requirements:
Add Elements: Method for adding an object to the collection. Must be thread-safe.
Remove Elements: Method for removing an object from the collection. Returns true if the object
was removed and false if the object was not found in the collection. Must be thread-safe.
Get All Elements: Method returns a copy of the list of all elements, ensuring that
the original collection cannot be modified through the returned list.
Specialized Filtering Methods:
Age Filtering: Returns a list of users within a specified age range.
Name Filtering: Returns a list of users whose names match a specified string.
Activity Filtering: Returns a list of users with a specified activity status.
 */
public abstract class Entity {
    private String name;
    private int age;
    private boolean isActive;

    public Entity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age; this.isActive = isActive;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return age == entity.age && isActive == entity.isActive && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isActive);
    }
}
