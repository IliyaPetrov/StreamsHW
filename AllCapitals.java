import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {

        try (
                BufferedReader bfr = new BufferedReader(
                        new FileReader("resources/lines"));
        )

        {
            String s;
            String stringInCaps = "";
            while ((s = bfr.readLine()) != null) {
                stringInCaps += s.toUpperCase() + "\n";

            }


            try

                    (
                            BufferedWriter prw =
                                    new BufferedWriter(
                                            new FileWriter("resources/lines"))) {


                prw.write(stringInCaps);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
