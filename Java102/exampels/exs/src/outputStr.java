
import java.io.FileOutputStream;

public class outputStr {

    //FileOutputStream output = new FileOutputStream(File fileObject);

    public static void main(String[] args) {
        
        String s = "\nhhhhhhhhhhh\n sd asdda sd asd as ";
        try {
            // append true add to end of text, else override
            //for write the file
            FileOutputStream output = new FileOutputStream("patika.txt",true);
            // FileOutputStream output2 = new FileOutputStream("patika.txt");

            byte[] bytes = s.getBytes();
            
            output.write(bytes);
            output.close();

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
