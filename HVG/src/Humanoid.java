public class Humanoid {
    private int health;
    private int attackPower;
    private int attackPoints;
    private int mana;
    private int speed;

    public Humanoid() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void attack() {
    }

    public void move() {
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "health=" + health +
                ", attackPower=" + attackPower +
                ", attackPoints=" + attackPoints +
                ", mana=" + mana +
                ", speed=" + speed +
                '}';
    }
}