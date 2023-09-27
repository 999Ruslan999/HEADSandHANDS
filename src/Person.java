public class Person {

    private String klan;
    private int attack;
    private int protection;
    private int health;
    private int damage;

    final int MIN_ATTACK = 1;
    final int MAX_ATTACK = 30;
    final int MIN_PROTECTION = 1;
    final int MAX_PROTECTION = 30;
    final int MIN_DAMAGE = 1;
    final int MAX_DAMAGE = 30;
    final int MAX_HEALTH = 100;

    public Person(String klan, int attack, int protection, int health, int damage) {
        this.klan = klan;
        this.attack = attack;
        this.protection = protection;
        this.health = health;
        this.damage = damage;

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

// метод атаки
    public void dam(int attack) {
        int result = health - attack;
        if (result <= 0) {
            System.out.println("Game Over");
        }

    }

    // метод восстановления
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
        return "Персонаж {" +
                "klan='" + klan + '\'' +
                ", attack=" + attack +
                ", protection=" + protection +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
