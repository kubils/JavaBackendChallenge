import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        File file = new File("patika.txt");

        try {
            boolean value = file.createNewFile();
            String[] fileList = file.list();
            for(String str : fileList) {
                System.out.println(str);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }


       

    }
}
