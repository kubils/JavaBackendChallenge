package Main;

import Location.BattleLocations.Cave;
import Location.BattleLocations.Forest;
import Location.BattleLocations.Mine;
import Location.BattleLocations.River;
import Location.Location;

import java.util.Scanner;

import Location.NormalLocs.SafeHouse;
import Location.NormalLocs.ToolStore;


public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Adventure Main.Main.Game!!!");
        System.out.println("Please enter a name : ");
//        String playerName = scanner.nextLine();
        String playerName = "Kubilay";

        Player player = new Player(playerName);

        System.out.println("Hello " + player.getName() + " welcome to do dangerous game!!");
        System.out.println("Good Luck!!!");

        player.selectChar();


        while (true) {
            Location location = null;

            player.printInfo();

            System.out.println("------------Locations------------");
            System.out.println("1- Safe House---> Safe place for rest!");
            System.out.println("2- ToolStore --->You can buy weapon or armor !");
            System.out.println("3- Cave --->Be careful, can be dangerous!");
            System.out.println("4- Forest --->Be careful, can be dangerous!");
            System.out.println("5- River --->Be careful, can be dangerous!");
            System.out.println("6- Mine --->Be careful, can be dangerous!");
            System.out.println("0- Exit");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 1:
                    //(this) sends player object = new Player()
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().getSpecilAwardList().contains("Food")) {
                        System.out.println("You achieved special Food award!!!");
                        System.out.println("Select another location!!!");
                    } else {
                        location = new Cave(player);
                    }
                    break;
                case 4:
                    if (player.getInventory().getSpecilAwardList().contains("Firewood")) {
                        System.out.println("You achieved special Firewood award!!!");
                        System.out.println("Select another location!!!");

                    } else {
                        location = new Forest(player);
                    }
                    break;
                case 5:
                    if (player.getInventory().getSpecilAwardList().contains("Water")) {
                        System.out.println("You achieved special Water award!!!");
                        System.out.println("Select another location!!!");

                    } else {
                        location = new River(player);
                    }
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                case 0:
                    System.out.println("GoodBye!!!");
                    System.exit(1);
            }
            if (location != null) {
                if (!location.onLocation()) {
                    System.out.println("GAME OVER");
                    break;
                }
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
