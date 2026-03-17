package hw_8.exceptions.task_3;
/*
3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
Создайте собственный класс исключения, наследуя его от класса Exception.
В методе используйте ключевое слово throw для генерации вашего исключения при неверных условиях.
Метод должен быть объявлен с ключевым словом throws.
 */
public class AgeCheck {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age " + age + " is noy valid. It must be between 0 and 150");
        }
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
