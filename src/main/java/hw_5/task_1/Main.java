package hw_5.task_1;
/*
1. Зоопарк
Условие:
В зоопарке есть одно животное, но оно может быть разным: птица или слон.
Каждое животное издаёт уникальные звуки и передвигается по-своему.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любым животным,
добавлять его в зоопарк и демонстрировать его поведение.
*/
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal bird = new Bird();
        zoo.addAnimal(bird);
        zoo.showBehavior();

        Animal elly = new Elephant();
        zoo.addAnimal(elly);
        zoo.showBehavior();
    }
}
