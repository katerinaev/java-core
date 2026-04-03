package hw_5.task_6;
/*
6. Ботанический сад
Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Примеры:
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
*/
public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

        Plant cactus = new Cactus();
        garden.setPlant(cactus);
        garden.careForPlant();

        Plant orchid = new Orchid();
        garden.setPlant(orchid);
        garden.careForPlant();
    }
}
