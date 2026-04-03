package hw_5.task_7;
/*
7. Парк развлечений
Условие:
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.
 */
public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        Attraction coaster = new RollerCoaster();
        park.setAttraction(coaster);
        park.manageAttraction();

        System.out.println();

        Attraction carousel = new Carousel();
        park.setAttraction(carousel);
        park.manageAttraction();
    }
}
