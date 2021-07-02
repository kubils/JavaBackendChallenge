package Location.NormalLocs;

import Location.Tools.Armor;
import Location.Tools.Weapon;
import Location.NormalLocation;
import Main.Player;

public class ToolStore extends NormalLocation {


    public ToolStore(Player player) {
        super("Store", player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in store. Welcome!");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("3- Exit");

        System.out.println("Choose : ");
        int s = scanner.nextInt();

        while (s < 1 || s > 3) {
            System.out.println("Wrong choose, try again: ");
            s = scanner.nextInt();
        }

        switch (s) {
            case 1:
                //(this) sends player object = new Player()
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }

    public void printArmor() {
        System.out.println("-----Armors-----");
        for (Armor armor : Armor.armors()) {
            System.out.println("Armors : " + armor.getName() + " \tID : " + armor.getId()
                    + "\tBlock : " + armor.getBlock() + " \tMoney : " + armor.getMoney());
        }

    }

    public void buyArmor() {
        System.out.println("Choose armor: ");
        int s = scanner.nextInt();

        while (s < 1 || s > Armor.armors().size()) {
            System.out.println("Wrong choose, try again: ");
            s = scanner.nextInt();
        }

        Armor selectedArmor = Armor.getArmorById(s);
        if (selectedArmor != null) {
            if (selectedArmor.getMoney() > this.getPlayer().getMoney()) {
                System.out.println("Not enough money for this weapon ");
            } else {
                int i = this.getPlayer().getMoney() - selectedArmor.getMoney();
                this.getPlayer().setMoney(i);
                System.out.println("You bought this weapon: " + selectedArmor.getName());

                System.out.println("Previous armor : " + this.getPlayer().getInventory().getArmor().getName());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println("New armor : " + this.getPlayer().getInventory().getArmor().getName());

            }
        }
    }

    public void printWeapon() {
        System.out.println("-----Weapons-----");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println("Weapon : " + weapon.getName() + " \t ID : " + weapon.getId()
                    + "\t Damage : " + weapon.getDamage() + " \tMoney : " + weapon.getMoney());
        }

    }

    public void buyWeapon() {
        System.out.println("Choose weapon: ");
        int s = scanner.nextInt();

        while (s < 1 || s > Weapon.weapons().size()) {
            System.out.println("Wrong choose, try again: ");
            s = scanner.nextInt();
        }

        Weapon selectedW = Weapon.getWeaponById(s);
        if (selectedW != null) {
            if (selectedW.getMoney() > this.getPlayer().getMoney()) {
                System.out.println("Not enough money for this weapon ");
            } else {
                int i = this.getPlayer().getMoney() - selectedW.getMoney();
                this.getPlayer().setMoney(i);
                System.out.println("You bought this weapon: " + selectedW.getName());

                System.out.println("Previous weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedW);
                System.out.println("New weapon : " + this.getPlayer().getInventory().getWeapon().getName());

            }
        }
    }
}
