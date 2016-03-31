import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private int nrOfStudents;

    public Course(String name, int nrOfStudents) {
        this.setName(name);
        this.setNrOfStudents(nrOfStudents);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNrOfStudents(int nrOfStudents) {
        this.nrOfStudents = nrOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNrOfStudents() {
        return nrOfStudents;
    }

    @Override
    public String toString() {
        return ("Name of the course: " + this.getName() + " Number of students: " + this.getNrOfStudents());
    }

}
