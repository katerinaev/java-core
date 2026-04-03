package hw_5.task_2;
/*
2. Управление домашними питомцами
Условие:
В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
Примеры:
Собака гуляет и ест сухой корм
Кошка играет и ест влажный корм
Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем
с учётом его особенностей.
*/
public class Main {
    public static void main(String[] args) {
        PetManager owner = new PetManager();
        Pet dog = new Dog();

        owner.addPet(dog);
        owner.interact();

        Cat cat = new Cat();
        owner.addPet(cat);
        owner.interact();
    }
}
