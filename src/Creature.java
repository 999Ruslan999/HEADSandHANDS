import java.util.Random;

public class Creature {

    private String klan;
    private int attack;
    private int protection;
    private double health;
    private int countRestoration;

    public int getCountRestoration() {
        return countRestoration;
    }

    public void setCountRestoration(int countRestoration) {
        this.countRestoration = countRestoration;
    }

    private double damage;

    private Creature creature;
    private Random random;
    public final int MIN_ATTACK = 1;
    public final int MAX_ATTACK = 30;
    public final int MIN_PROTECTION = 1;
    public final int MAX_PROTECTION = 30;
    public final int MIN_DAMAGE = 1;
    public final int MAX_DAMAGE = 6;
    public final double MAX_HEALTH = 100;




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

    public void setKlan(String klan) {
        this.klan = klan;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
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


    public void die() {
        System.out.println("GAME OVER");
    }

    // метод атаки
    public void dam(Creature creature) {
        damage = random.nextInt(MAX_DAMAGE) + MIN_DAMAGE;
        creature.setHealth(creature.getHealth() - damage);
        if (creature.getHealth() <= 0) {
            creature.die();
        }
        System.out.println(creature.getKlan() + " Получил урон " + getDamage());
        System.out.println("Здоровье: " + creature.getHealth());
    }


    // метод восстановления (ещё не готов)
    public void heal(Creature creature) {
        double restoration = MAX_HEALTH * 0.3;
        creature.setHealth(creature.getHealth() + restoration);
        if (creature.getHealth() >= MAX_HEALTH) {
            creature.setHealth(MAX_HEALTH);
        }
        System.out.println(creature.getKlan() + " Исцелился ");
        System.out.println("Здоровье: " + getHealth());
        creature.setCountRestoration(creature.getCountRestoration() + 1);
        if(creature.getCountRestoration() > 4) {
            creature.setHealth(creature.getHealth() - restoration);
            System.out.println("Возродиться можно только 4 раза");
            System.out.println("Возрождённое здоровье изъято");
        }


    }









    @Override
    public String toString() {
        return "КЛАН = " + klan + '\'' +
                ", Атака = " + attack +
                ", Защита = " + protection +
                ", Здоровье = " + health +
                ", Количество возрождений = " + countRestoration;
    }
}
