package Location.NormalLocs;

import Location.NormalLocation;
import Main.Player;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super("Safe house", player);
    }

    @Override
    public boolean onLocation() {

        //3 main location -> cave- forest - river
        if (this.getPlayer().getInventory().getSpecilAwardList().size() == 3) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!Congratulations!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("YOU WIN THE GAME");
            System.exit(1);
        }
        System.out.println("You are in safe house");
        System.out.println("Your health is renewed");

        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
