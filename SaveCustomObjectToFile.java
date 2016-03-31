import sun.applet.Main;

import java.io.*;

public class SaveCustomObjectToFile {
    private static Course[] courses;


    public static void main(String[] args) {

        courses = new Course[4];
        courses[0] = new Course("Programming Basics", 120);
        courses[1] = new Course("Java Fundamentals", 40);
        courses[2] = new Course("Linux", 23);
        courses[3] = new Course("PHP", 32);
        saveObjects();
        loadObjects();


    }

    private static void saveObjects() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("resources/course.save")))) {

            for (Course cr : courses
                    ) {
                oos.writeObject(cr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadObjects() {

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("resources/course.save")))) {

            Object obj;
            while ((obj = ois.readObject()) != null) {

                System.out.println(obj);
            }

        } catch (EOFException e) {
            System.out.print("END OF FILE");
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
