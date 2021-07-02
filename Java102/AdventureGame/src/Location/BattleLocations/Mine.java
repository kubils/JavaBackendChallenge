package Location.BattleLocations;

import GameChars.Obstacle.Obstacles;
import GameChars.Obstacle.Snake;
import Location.BattleLocation;
import Main.Player;

import java.util.Random;

public class Mine extends BattleLocation {
    private Random random = new Random();
    private int maxObstacle;
    ;

    public Mine(Player player) {
        super("Mine", player, new Snake(), "Money, Weapon, Armor",6,true);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

}
