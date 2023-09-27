import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  В реализации почему то не срабатывают методы атаки и восстановления,
        //  не восстанавливается health и не уменьшается от атаки;
        Player player1 = new Player("Человек", 30, 30, 100, 5);
        Monster monster1 = new Monster("Монстр", 30, 30, 30, 5);
        player1.dam(30);
        System.out.println(player1);
        monster1.heal(30);
        System.out.println(monster1);







    }
}