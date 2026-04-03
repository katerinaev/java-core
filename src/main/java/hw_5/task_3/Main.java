package hw_5.task_3;
/*
3. Управление рестораном
Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и
выводить их описание с учётом характеристик
 */
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Dish steak = new HotDish(120);

        restaurant.addDish(steak);
        restaurant.makeDescription();

        Drink coctail = new Drink(300);
        restaurant.addDish(coctail);
        restaurant.makeDescription();
    }
}
