import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Здравствуйте, предлагаю сыграть Вам в мою игру!
        // Ознакомьтесь с правилами.
        // ПРАВИЛА ИГРЫ:
        // 1) Участники могут играть за Игрока или Монстра.
        // 2) Для того, что бы запустить игру нажмите 1 в консоли.
        // 3) Участники по очереди бросают кубик.
        // 4) Если выпало 1 - 4, то Участник пропускает ход.
        // 5) Если выпало 5 - 6, то участник атакует другого участника с помощью метода dam.
        // 6) Участник может восстановить здоровье c помощью метода heal, но не больше 4 раз.
        // 7) Если участник восстановит здоровье 5 раз то здоровье изымается.

        // Ниже я продемонстрировал пример выполненной игры

        Player player = new Player("Игрок", 5, 5, 15, 0);
        Monster monster = new Monster("Монстр", 5, 5, 15, 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Запустить игру нажмите 1");
        int cast = scanner.nextInt();
        if (cast == 1) {
            System.out.println("ИГРА НАЧАЛАСЬ");
        }

        player.cube(player);
        monster.cube(monster);
        player.cube(player);
        monster.cube(monster);
        player.heal(player);
        monster.heal(monster);
        System.out.println(player);
        System.out.println();
        System.out.println(monster);
    }
}