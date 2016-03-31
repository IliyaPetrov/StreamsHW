import java.io.*;
import java.nio.ByteBuffer;

public class CopyJpg {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream(new File("resources/java.jpg"));
                FileOutputStream fos = new FileOutputStream(new File("resources/java_new.jpg"))) {

            byte[] buffer = new byte[8192];

            while (true) {

                int data = fis.read(buffer);
                if (data <= 0) break;
                fos.write(buffer, 0, data);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
