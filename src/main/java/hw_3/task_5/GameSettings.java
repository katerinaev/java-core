package hw_3.task_5;
/*
Класс GameSettings
Создайте класс GameSettings с полями:
static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас
Реализуйте конструктор, статический метод setMaxPlayers(int),
метод addPlayer() — добавляет 1 игрока,
метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 */
public class GameSettings {
    static int maxPlayers = 10;

    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int max) {
        maxPlayers = max;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    public void printGameStatus() {
        System.out.println("Game: " + gameName + ", current players: " + currentPlayers + ", max players: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings carcassonne = new GameSettings("Carcassonne", 2);
        GameSettings ticket = new GameSettings("Ticket to Ride", 3);

        setMaxPlayers(5);

        carcassonne.addPlayer();
        ticket.addPlayer();

        carcassonne.printGameStatus();
        ticket.printGameStatus();
    }
}
