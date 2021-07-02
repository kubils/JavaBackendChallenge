package Main;

import Location.Tools.Armor;
import Location.Tools.Weapon;

import java.util.ArrayList;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<String> specilAwardList;

    public Inventory() {
        this.weapon = new Weapon("Punch", 0,0,0);
        this.armor = new Armor("Body",0,0,0);
        this.specilAwardList = new ArrayList<String>();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArrayList<String> getSpecilAwardList() {
        return specilAwardList;
    }

    public void setSpecilAwardList(ArrayList<String> specilAwardList) {
        this.specilAwardList = specilAwardList;
    }
}

