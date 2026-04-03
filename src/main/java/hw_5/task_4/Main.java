package hw_5.task_4;
/*
4. Аквариум
Условие:
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и
продемонстрировать его поведение.
*/
public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        SeaCreature star = new StarFish();

        aquarium.addCreature(star);
        aquarium.showBehavior();

        SeaCreature sharik = new Shark();
        aquarium.addCreature(sharik);
        aquarium.showBehavior();
    }
}
