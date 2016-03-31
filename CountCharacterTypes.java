import java.io.*;
import java.lang.reflect.Array;

public class CountCharacterTypes {
    public static void main(String[] args) {

        try (BufferedReader bfr =
                     new BufferedReader(
                             new FileReader("resources/words.txt"))) {
            try (BufferedWriter bfw = new BufferedWriter(new FileWriter("resources/count-chars.txt"))) {

                String str;
                int vowels = 0;
                int consonants = 0;
                int punctuation = 0;
                String vowelsStr = "aouei";
                String punctuationStr = "!,.?";

                while ((str = bfr.readLine()) != null) {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != ' ') {
                            if (vowelsStr.indexOf(str.charAt(i)) != -1) {

                                vowels++;
                            } else if (punctuationStr.indexOf(str.charAt(i)) != -1) {
                                punctuation++;
                            } else {
                                consonants++;
                            }

                        }
                    }
                }
                bfw.write(String.format("Vowels: %d%n" + "Consonants: %d%n" + "Punctuation: %d%n", vowels, consonants, punctuation));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
