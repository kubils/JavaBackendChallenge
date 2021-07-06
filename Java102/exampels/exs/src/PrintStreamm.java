import java.io.PrintStream;

public class PrintStreamm {

    public static void main(String[] args) {
        
        //TODO: handle exception
        try {
            PrintStream s = new PrintStream("patika.txt");

            s.println("sended from printstream");

            s.close();
        } catch (Exception e) {
        }
        
    }
    
}
