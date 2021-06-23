package Classes.BoksFight;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r;

        
        if(Ring.startMatch() == 1) {
            System.out.println("Yazı : Marc maça başlayacak");
            r = new Ring(marc,alex , 90 , 100);
        } else {
            System.out.println("Tura : Alex maça başlayacak");
            r = new Ring(alex,marc , 90 , 100);
        }
        r.run();

      }
}
