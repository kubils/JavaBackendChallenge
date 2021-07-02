package Location.Tools;

import java.util.ArrayList;

public class Armor {

    private int id;
    private String name;
    private int block;
    private int money;

    public Armor(String name, int id, int block, int money) {
        this.name = name;
        this.id = id;
        this.block = block;
        this.money = money;
    }

    public static ArrayList<Armor> armors() {
        ArrayList<Armor> armorList = new ArrayList<Armor>();
        armorList.add(new Armor("light", 1, 1, 5));
        armorList.add(new Armor("medium", 2, 3, 25));
        armorList.add(new Armor("heavy", 3, 5, 40));


        return armorList;
    }

    public static Armor getArmorById(int id) {
        for (Armor w : Armor.armors()) {
            if (w.getId() == id) {
                return w;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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
