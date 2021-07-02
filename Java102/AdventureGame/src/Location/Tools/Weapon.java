package Location.Tools;

import java.util.ArrayList;

public class Weapon {

    private int id;
    private String name;
    private int damage;
    private int money;

    public Weapon(String name, int id, int damage, int money) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }

    public static ArrayList<Weapon> weapons() {
        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();

        weaponList.add(new Weapon("Pistol", 1, 2, 5));
        weaponList.add(new Weapon("Sword", 2, 3, 35));
        weaponList.add(new Weapon("Rifle", 3, 7, 45));
        return weaponList;
    }

    public static Weapon getWeaponById(int id) {
        for (Weapon w : Weapon.weapons()) {
            if (w.getId() == id) {
                return  w;
            }
         }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
