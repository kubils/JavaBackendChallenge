package Location.BattleLocations;

import GameChars.Obstacle.Obstacles;
import GameChars.Obstacle.Vampire;
import Location.BattleLocation;
import Location.NormalLocation;
import Main.Player;

public class Forest extends BattleLocation {


    public Forest(Player player) {
        super("Forest", player, new Vampire(), "Firewood",3,true);
    }
}
