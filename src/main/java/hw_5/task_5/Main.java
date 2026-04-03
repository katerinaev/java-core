package hw_5.task_5;
/*
5. Ферма
Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей
*/
public class Main {
    public static void main(String[] args) {
        Farm ourFarm = new Farm();

        FarmAnimal hen = new Chicken();
        ourFarm.addAnimal(hen);
        ourFarm.manageAnimal();

        System.out.println();

        FarmAnimal cow = new Cow();
        ourFarm.addAnimal(cow);
        ourFarm.manageAnimal();
    }
}
