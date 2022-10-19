/**
 * Represents a student that contains the student's
 * id number, name, and gpa (between 0.00 and 4.00).
 * @author Ken Loomis
 */
public class Student implements Comparable<Student>{

    private String name;
    private String id;
    private double gpa;

    /**
     * Instantiates a student given the student's id, name,
     * and gpa. The id and name must contain at least 1 character.
     * The gpa must be between 0.00 and 4.00 (inclusive) and
     * may not exceed more than 2 digits beyond the decimal.
     */
    public Student ( String id, String name, double gpa ) {
        if (id == null || id.length() <= 0 )
            throw new IllegalArgumentException("Invalid ID: Must contain at least 1 character.");
        if (name == null || name.length() <= 0)
            throw new IllegalArgumentException("Invalid Name: Must contain at least 1 character.");
        if (gpa < 0 || gpa > 4.25 )
            throw new IllegalArgumentException("Invalid GPA: 0 to 4.25 accepted.");
        if ((int) (gpa*100) != (gpa*100) )
            throw new IllegalArgumentException("Invalid GPA: two decimal of precision only.");

        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString ( ) {
        return "Student (" + id + "): " + name + " [" + gpa + " gpa]";
    }

    @Override
    public int compareTo ( Student other ) {
        return (int) (this.gpa*100 - other.gpa*100);
    }

    @Override
    public boolean equals ( Object other ) {
        if ( other instanceof Student )
            return this.id.equals(((Student)other).id);
        return false;
    }

}
