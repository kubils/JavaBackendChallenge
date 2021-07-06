package Serialization;
import java.io.*;
public class objectOutput {
    
    public static void main(String[] args) throws IOException {
        
        Car car = new Car("BMW", "Blue");

        FileOutputStream fOut = new FileOutputStream("src/Serialization/output.txt");
        ObjectOutputStream output = new ObjectOutputStream(fOut);

        output.writeObject(car);

        fOut.close();
        output.close();
    }
}
