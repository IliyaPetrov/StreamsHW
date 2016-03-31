import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {

    public static void main(String[] args) {

        File fileOne = new File("resources/words.txt"), fileTwo = new File("resources/count-chars.txt"), fileThree = new File("resources/lines");
        File destinationZip = new File("resources/text-files.zip");

        zipFiles(fileOne, fileTwo, fileThree, destinationZip);


    }

    private static void zipFiles(File fileOne, File fileTwo, File fileThree, File destination) {

        byte[] buffer = new byte[1024];
        int len;

        File[] threeFiles = new File[3];
        threeFiles[0] = fileOne;
        threeFiles[1] = fileTwo;
        threeFiles[2] = fileThree;

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));
             ZipOutputStream zos = new ZipOutputStream(bos))

        {
            for (File f : threeFiles
                    ) {
                zos.putNextEntry(new ZipEntry(String.valueOf(f)));
                FileInputStream in = new FileInputStream(f);
                while ((len = in.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
