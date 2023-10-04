import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Правила игры: ");

       Player player = new Player("Игрок", 25, 25, 100, 0);
       Monster monster = new Monster("Монстр", 25, 25, 100, 0);
       System.out.println("Игрок атакует Монстра");
       player.dam(monster);
       monster.heal(monster);
       monster.heal(monster);
       monster.heal(monster);
       monster.heal(monster);
       monster.heal(monster);
       System.out.println(monster);














    }
}