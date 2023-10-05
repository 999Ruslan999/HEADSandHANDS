import java.util.Random;

public abstract class Creature {

    private String klan;
    private int attack;
    private int protection;
    private double health;
    private int countRestoration;

    private double damage;
    private Random random;
    public final int MIN_DAMAGE = 1;
    public final int MAX_DAMAGE = 6;
    public final double MAX_HEALTH = 15;


    public Creature(String klan, int attack, int protection, double health, int countRestoration) {
        this.klan = klan;
        this.attack = attack;
        this.protection = protection;
        this.health = health;
        this.countRestoration = countRestoration;
        random = new Random();
    }

    public String getKlan() {
        return klan;
    }

    public double getHealth() {
        return health;
    }

    public double setHealth(double health) {
        this.health = health;
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getCountRestoration() {
        return countRestoration;
    }

    public void setCountRestoration(int countRestoration) {
        this.countRestoration = countRestoration;
    }

    // Если игрок погиб - GAME OVER
    public void die() {
        System.out.println("GAME OVER");
        System.out.println("~~~~~~~~~~");
    }

    // Метод атаки
    public void dam(Creature creature) {
        damage = random.nextInt(MAX_DAMAGE) + MIN_DAMAGE;
        creature.setHealth(creature.getHealth() - damage);
        if (creature.getHealth() <= 0) {
            creature.die();
        }
        System.out.println(creature.getKlan() + " Получил урон " + getDamage());
        System.out.println("Здоровье: " + creature.getHealth());
        System.out.println("~~~~~~~~~~");
    }

    // Метод восстановления
    public void heal(Creature creature) {
        double restoration = MAX_HEALTH * 0.3;
        creature.setHealth(creature.getHealth() + restoration);
        if (creature.getHealth() >= MAX_HEALTH) {
            creature.setHealth(MAX_HEALTH);
        }
        System.out.println(creature.getKlan() + " Исцелился ");
        System.out.println("Здоровье: " + getHealth());
        System.out.println("~~~~~~~~~~");
        // считаем количество восстановлений
        creature.setCountRestoration(creature.getCountRestoration() + 1);
        if (creature.getCountRestoration() > 4) {
            creature.setHealth(creature.getHealth() - restoration);
            System.out.println("Возродиться можно только 4 раза");
            System.out.println("Возрождённое здоровье изъято");
            System.out.println("~~~~~~~~~~");
        }
    }

    // Бросок кубика
    public void cube(Creature creature) {
        int diceValue = (int) (Math.random() * 6) + 1;
        switch (diceValue) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Выпало: " + diceValue + " Ход пропущен");
                System.out.println("~~~~~~~~~~");
                break;
            case 5:
            case 6:
                System.out.println("Выпало: " + diceValue);
                creature.dam(creature);
                break;
            default:
                System.out.println("Ошибка: недопустимое значение");
                System.out.println("~~~~~~~~~~");
        }
    }

    @Override
    public String toString() {
        return "КЛАН = " + klan + '\'' +
                ", Атака = " + attack +
                ", Защита = " + protection +
                ", Здоровье = " + health +
                ", Использовал возрождений = " + countRestoration;
    }
}
