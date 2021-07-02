package GameChars.Obstacle;

import Location.BattleLocation;
import Location.NormalLocs.ToolStore;
import Location.Tools.Armor;
import Location.Tools.Weapon;
import Main.Inventory;
import Main.Player;

import java.util.Random;
import java.util.Scanner;

public class Snake extends Obstacles {

    private int damage;
    private Inventory inventory;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public Snake() {
        super(4, "Snake", 12);
        this.damage = random.nextInt(4) + 3;
    }

    public void droppedFromSnake(Player player) {
        int select;
        int id = 0;

        int prob = random.nextInt(100) + 1;
        if (prob <= 15) {
            int probWeapon = random.nextInt(10) + 1;
            if (prob <= 2) {
                System.out.println("You dropped a RIFLE!!!");
                id = 3;

            } else if (prob <= 5) {
                System.out.println("You dropped a SWORD!!!");
                id = 2;
            } else {
                System.out.println("You dropped a PISTOL!!!");
                id = 1;
            }
            System.out.println("You want to change with your weapon?\n 1-Yes 2-No");
            select = scanner.nextInt();
            if (select == 1) {
                player.getInventory().setWeapon(Weapon.getWeaponById(id));
            }
            System.out.println("Your weapon is : " + player.getInventory().getWeapon().getName());

        } else if (prob <= 30) {
            int probArmor = random.nextInt(10) + 1;
            if (probArmor <= 2) {
                System.out.println("You dropped a weight armor!!!");
                id = 3;
            } else if (probArmor <= 5) {
                System.out.println("You dropped a medium armor!!!");
                id = 2;
            } else {
                System.out.println("You dropped a light armor!!!");
                id = 1;
            }
            System.out.println("You want to change with your armor?\n 1-Yes 2-No");
            select = scanner.nextInt();
            if (select == 1) {
                player.getInventory().setArmor(Armor.getArmorById(id));
            }
            System.out.println("Your armor is : " + player.getInventory().getArmor().getName());

        } else if (prob <= 55) {
            int probMoney = random.nextInt(10) + 1;
            if (probMoney <= 2) {
                System.out.println("You dropped from snake : 10 coin ");
                player.setMoney(player.getMoney() + 10);
            } else if (probMoney <= 5) {
                System.out.println("You dropped from snake : 5 coin ");
                player.setMoney(player.getMoney() + 5);
            } else {
                System.out.println("You dropped from snake : 1 coin ");
                player.setMoney(player.getMoney() + 1);
            }

        } else {
            System.out.println("Bad luck! Nothing dropped!!!");
        }
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
