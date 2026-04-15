package hw_4.switchtasks;

import java.util.Scanner;

/*
2. Стоимость билета по дню недели
Задача:
Определите стоимость билета в кино:
будние дни (1–5) — 300 рублей
выходные (6–7) — 450 рублей
 */
public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week 1 - 7: ");
        int day = scanner.nextInt();
        int price = 0;

        switch(day) {
            case 1, 2, 3, 4, 5 -> price = 300;
            case 6, 7 -> price = 450;
            default -> {
                System.out.println("Error: enter number 1 - 7");
                return;
            }
        }

        System.out.println("Ticket price " + price + " руб.");
    }
}
