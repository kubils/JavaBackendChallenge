package Main;

import GameChars.Heros.Archer;
import GameChars.GameCharacter;
import GameChars.Heros.Knight;
import GameChars.Heros.Master;
import GameChars.Heros.Samurai;


import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scan = new Scanner(System.in);
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String charName;
    private Inventory inventory;

    //other fields will choose by player
    public Player(String name) {
        this.name = name;
        //initialize with player
        this.inventory = new Inventory();
    }

    public void selectChar() {
        //polymorphism
        GameCharacter[] gameChars = {new Samurai(), new Archer(), new Knight(), new Master()};
        System.out.println("-----------------------------------------------");
        for (GameCharacter g : gameChars) {
            System.out.println("ID " + g.getId() + "\t\tCharacter : " + g.getName() + "\t Damage : " + g.getDamage() +
                    "\t Health : " + g.getHealth() + "\t Money : " + g.getMoney());
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Please select a hero ID: ");
        int selectChar = scan.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            case 4:
                initPlayer(new Master());
                break;
            default:
                System.out.println("Enter Valid value");
        }
        System.out.println("Choooooosen =>");
//        System.out.println("Character : " +this.getCharName() + "\t Damage : " + this.getDamage() +
//                "\t Health : " + this.getHealth() + "\t Money : " + this.getMoney());
    }

    public void printInfo() {
        System.out.println("Weapon : " + this.getInventory().getWeapon().getName()
                + "\t Armor :" + this.getInventory().getArmor().getName()
                + "\t Block :" + this.getInventory().getArmor().getBlock()
                + "\t Damage : " + this.getTotalDamage() +
                "\t Health : " + this.getHealth() + "\t Money : " + this.getMoney());


    }

    public void initPlayer(GameCharacter gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public int getTotalDamage() {
        return damage + this.inventory.getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
