import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("resources/lines"))) {
            String s;


            while ((s = bfr.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
