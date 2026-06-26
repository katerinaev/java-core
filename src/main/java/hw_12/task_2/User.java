package hw_12.task_2;
/*
Task 2: User Data Validator

Description:
Develop a validation system for the user data model that checks the validity of name, age,
and email. Validation should be controlled through the global validationEnabled flag,
which can be enabled or disabled. If the data fails validation, a specialized
InvalidUserException exception should be thrown.

Data Model:
User: A user class with attributes for name, age, and email.
Validator Class:
UserValidator: A service that provides methods for validating User objects against specific
rules.
Functional Requirements:
Name Validation: The name must be non-empty and begin with a capital letter.
Age Validation: The age must be between 18 and 100 years old.
Email Validation: The email must conform to the standard email format.
Validation Management: Data validation should only occur if the validationEnabled flag
is set to true.
Exceptions: If invalid data is detected, an InvalidUserException must be thrown.
*/
public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
