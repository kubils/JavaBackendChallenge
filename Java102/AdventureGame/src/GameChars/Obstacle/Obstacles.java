package GameChars.Obstacle;

import GameChars.GameCharacter;

public abstract class Obstacles extends GameCharacter {

    private int allObstaleDefaultHealth;

    public Obstacles(int id, String name, int health) {
        super(id, name, health);
        this.allObstaleDefaultHealth = health;
    }

    public Obstacles(int id, String name, int damage, int health, int money) {
        super(id, name, damage, health, money);
        this.allObstaleDefaultHealth = health;
    }

    public int getAllObstaleDefaultHealth() {
        return allObstaleDefaultHealth;
    }
}
