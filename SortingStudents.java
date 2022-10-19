import java.util.Scanner;

/**
 * Accepts student information for three students. Checks to make sure
 * that they are unique. Then prints the sorted list of the 3 students.
 * @author Ken Loomis
 */
class SortingStudents {
    public static void main ( String [] args ) {
        Scanner keyboard = new Scanner ( System.in );
        String id, name;
        double gpa;
        Student stdntA, stdntB, stdntC;
        Student stdnt1, stdnt2, stdnt3;
        stdnt1 = stdnt2 = stdnt3 = null;

        System.out.println ( "Enter Student A information..." );
        System.out.print ( "\tID: " );
        id = keyboard.nextLine();
        System.out.print ( "\tName: " );
        name = keyboard.nextLine();
        System.out.print ( "\tGPA: " );
        gpa = keyboard.nextDouble();
        keyboard.nextLine();
        stdntA = null;  

        System.out.println ( "Enter Student B information..." );
        System.out.print ( "\tID: " );
        id = keyboard.nextLine();
        System.out.print ( "\tName: " );
        name = keyboard.nextLine();
        System.out.print ( "\tGPA: " );
        gpa = keyboard.nextDouble();
        keyboard.nextLine();
        stdntB = null; 
        

        System.out.println ( "Enter Student C information..." );
        System.out.print ( "\tID: " );
        id = keyboard.nextLine();
        System.out.print ( "\tName: " );
        name = keyboard.nextLine();
        System.out.print ( "\tGPA: " );
        gpa = keyboard.nextDouble();
        keyboard.nextLine();
        stdntC = null; 

        System.out.println ( "Unsorted: " );
        System.out.println ( stdntA );
        System.out.println ( stdntB );
        System.out.println ( stdntC );

        /* Add the code to sort the three students here */
        
        System.out.println ( "Sorted: " );
        System.out.println ( stdnt1 );
        System.out.println ( stdnt2 );
        System.out.println ( stdnt3 );

    }
}
