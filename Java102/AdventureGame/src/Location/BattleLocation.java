package Location;

import GameChars.Obstacle.Obstacles;
import GameChars.Obstacle.Snake;
import Main.Player;

import java.util.Random;
import java.util.Scanner;

public abstract class BattleLocation extends Location {

    private Obstacles obstacle;
    private String award;
    private int maxObstacle;
    private Scanner scanner = new Scanner(System.in);
    private boolean isActive;
    private Snake snake;

    public BattleLocation(String name, Player player, Obstacles obstacle,String award,boolean isActive) {
        super(name, player);
        this.obstacle = obstacle;
        this.isActive = isActive;
        this.award = award;

    }

    public BattleLocation(String name, Player player, Obstacles obstacle, String award, int maxObstacle, boolean isActive) {
        super(name, player);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
        this.isActive = isActive;
    }

    @Override
    public boolean onLocation() {
        if (this.isActive) {
            System.out.println("You are in : " + this.getName());
            System.out.println("Be careful!!! Lots of " + this.obstacle.getName() + " live here");
            System.out.println("1- Battle\t 2- Escape");
            int select = scanner.nextInt();
            int obstacleNumber = this.randomObstacleNumber();
            switch (select) {
                case 1:
                    if (combat(obstacleNumber)) {
                        System.out.println(this.getName() + "Enemies defeated!!!");
                        return true;
                    }
                    break;
                default:
            }
            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("You death!!!");
                return false;
            }
        } else {
            System.out.println("You achieved special award!!!");
        }
        return true;
    }

    public boolean combat(int obstacleNumber) {
        System.out.println("Count :" + obstacleNumber + " lives here");
        for (int i = 0; i < obstacleNumber; i++) {
            this.obstacle.setHealth(this.obstacle.getAllObstaleDefaultHealth());
            playerStatus();
            System.out.println();
            obstacleStatus();
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("-----------------------");
                System.out.println("1 - Attack\t 2 - Escape");
                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                        Random random = new Random();
                        int r = random.nextInt(2) + 1;
                        //first attack 1-player 2-obstacle
                        if (r == 1) {
                            System.out.println("You attacked!!!");
                            obstacle.setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());

                        } else {
                            System.out.println("Obstacle hit to you!!!");
                            //health + armor - obsDamage
                            int obstacleDamage =this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();

                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        }
                        afterHit(i+1);
                        break;
                    case 2:
                        return  false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("------------------------------------------");
                System.out.println("Fight win!!!");

                if(this.getObstacle().getName().equals("Snake")) {
                    snake = new Snake();
                    snake.droppedFromSnake(this.getPlayer());
                } else {
                    System.out.println(this.getObstacle().getMoney() + " is your award");
                    int award = this.getPlayer().getMoney() + this.getObstacle().getMoney();
                    this.getPlayer().setMoney(award);
                    System.out.println("Your money : " + this.getPlayer().getMoney());
                }
            } else {
                return false;
            }
        }

        if(this.getName().equals("Cave") || this.getName().equals("River") || this.getName().equals("Forest")) {
            this.getPlayer().getInventory().getSpecilAwardList().add(this.getAward());
            System.out.println(this.getPlayer().getInventory().getSpecilAwardList().toString());
        }
        return true;
    }

    protected  void afterHit(int i) {
        System.out.println("Your health : " + this.getPlayer().getHealth());
        System.out.println((i) + "." +"Obstacle health " + this.getObstacle().getHealth());
    }

    public void playerStatus() {
        System.out.println("--------------");
        System.out.println("Player info : ");
        System.out.println("--------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());

    }
    public void obstacleStatus() {

        System.out.println("Obstacle : " + this.getObstacle().getName());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Award  : " + this.getObstacle().getMoney());
    }
    public int randomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacles getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacles obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
