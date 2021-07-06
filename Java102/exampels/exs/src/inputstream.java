import java.io.FileInputStream;

public class inputstream {

    public static void main(String[] args) {
        
        try {
            //data read --> byte type
            FileInputStream input = new FileInputStream("patika.txt");
            //skips 5 c from head
            input.skip(5);

            //read() single byte read
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            //TODO: handle exception
        } finally {
        }


    }
    
}
