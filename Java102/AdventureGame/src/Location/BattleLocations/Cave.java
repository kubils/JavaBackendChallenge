package Location.BattleLocations;

import GameChars.Obstacle.Obstacles;
import GameChars.Obstacle.Zombie;
import Location.BattleLocation;
import Main.Player;

public class Cave extends BattleLocation {


    public Cave(Player player) {
        super("Cave", player, new Zombie(), "Food",3, true);
    }
}
