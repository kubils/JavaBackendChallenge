import java.io.*;

public class byteStream {
    public static void main(String[] args) throws IOException {
        
        byte[] bytes = {55,1,88,77,111,33,22,4,5};
        
        
        // ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        // System.out.println("Avaliable bytes at beginnning : " + input.available());
        // for (int i = 0; i < bytes.length; i++) {
        //     int data = input.read();
        //     System.out.print(data + ", ");
        // }
        // input.close();
        
        String str = "bugün günlerden at";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] outB = str.getBytes();
        output.write(outB);

        String outputData = output.toString();
        System.out.println(outputData);
        output.close();
    }    
}
