import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {

        ArrayList<Double> doublesList = new ArrayList<>(Arrays.asList(4.3, 2.1, 3.5, 7.9));
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("resources/doublesarr.txt")));
        ) {

            for (double element : doublesList
                    ) {
                oos.writeDouble(element);

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("resources/doublesarr.txt")))) {

            for (int i = 0; i < doublesList.size(); i++) {
                System.out.println(ois.readDouble());
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }
}


