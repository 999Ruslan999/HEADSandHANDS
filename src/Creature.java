import java.util.Random;

public class Creature {

    private String klan;
    private int attack;
    private int protection;
    private int health;

    private int damage;

    private Creature creature;
    private Random random;
    public final int MIN_ATTACK = 1;
    public final int MAX_ATTACK = 30;
    public final int MIN_PROTECTION = 1;
    public final int MAX_PROTECTION = 30;
    public final int MIN_DAMAGE = 1;
    public final int MAX_DAMAGE = 6;
    public final int MAX_HEALTH = 100;

    public Creature(String klan, int attack, int protection, int health) {
        this.klan = klan;
        this.attack = attack;
        this.protection = protection;
        this.health = health;

        random = new Random();
        creature = new Creature();
    }

    public Creature() {

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

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
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
        System.out.println("Осталось здоровья: " + creature.getHealth());
    }



    // метод восстановления (ещё не готов)
    public void heal(int health) {
        int maxHealth = MAX_HEALTH;
        if (health < maxHealth) {
            health += MAX_HEALTH * 0.3;
            if (health > MAX_HEALTH) {
                health = MAX_HEALTH;
            }
        }

    }


    @Override
    public String toString() {
        return  "КЛАН = " + klan + '\'' +
                ", Атака = " + attack +
                ", Защита = " + protection +
                ", Здоровье = " + health;
    }
}
