
package Serialization;
import java.io.*;

public class objectInput {
    
    public static void main(String[] args) {
        try {
            FileInputStream fInputStream = new FileInputStream("src/Serialization/output.txt");
            ObjectInputStream oInputStream = new ObjectInputStream(fInputStream);
    
            Car car = (Car) oInputStream.readObject();
    
            System.out.println("Name : " + car.getName());
            System.out.println("Color : " + car.getColor());
    
            fInputStream.close();
            oInputStream.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
   
}
