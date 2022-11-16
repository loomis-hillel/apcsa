
/**
  * Represents a student.
  * @author Ken Loomis
  * @version 11/15/22
 */
public class Student {

    private String name;
    private String id;
    private double gpa;

    public Student ( String n, String i, double g ){
        name = n;
        id = i;
        gpa = g;
    }

    public String toString ( ) {
        return name + "(" + id + ")";
    }

}