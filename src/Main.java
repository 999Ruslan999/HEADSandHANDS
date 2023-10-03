import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       Player player = new Player("Игрок", 25, 25, 100);
       Monster monster = new Monster("Монстр", 25, 25, 100);
       player.dam(monster);
       System.out.println(monster);








    }
}