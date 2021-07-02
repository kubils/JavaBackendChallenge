package Location.BattleLocations;

import GameChars.Obstacle.Bear;
import GameChars.Obstacle.Obstacles;
import Location.BattleLocation;
import Main.Player;

public class River extends BattleLocation {

    public River(Player player) {
        super("River", player, new Bear(), "Water",2,true);
    }
}
