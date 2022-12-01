import java.util.Scanner;

public class TestPet {

    public static void main ( String [] args ) {

        // This should work after Task #3 is completed (and fully after Task #4)
        Pet pet = new Pet ( );
        System.out.println ( pet );

        // This should work after Task #3 is completed (and fully after Task #4)
        Pet yertle = new Pet ( "Yertle", "Myrtle", 7, 1.15, "Turtle", "Eastern Box");
        System.out.println ( yertle );

        // This should work after Task #5 is completed
        /* uncomment to run this test
        if ( ! yertle.getName().equals("Yertle") ) {
            System.out.println ( "Get name doesnt work!" );
        } else if ( ! yertle.getOwner().equals("Myrtle") ) {
            System.out.println ( "Get owner doesnt work!" );
        } else if ( yertle.getAge() != 7 ) {
            System.out.println ( "Get age doesnt work!" );
        } else if ( yertle.getWeight() != 1.15 ) {
            System.out.println ( "Get weight doesnt work!" );
        } else if ( ! yertle.getAnimalType().equals("Turtle") ) {
            System.out.println ( "Get animal type doesnt work!" );
        } else if ( ! yertle.getBreed().equals("Eastern Box") ) {
            System.out.println ( "Get name doesnt work!" );
        } else {
            System.out.println ( "Getter tests passed!" );
        }
        */

        // This should work after Task #6 is completed
        /* uncomment to run this test
        boolean passed = true;
        yertle.setAge(8);
        passed = passed && yertle.getAge() == 8;
        yertle.setAge(-1);
        passed = passed && yertle.getAge() == 8;
        yertle.setAge(35);
        passed = passed && yertle.getAge() == 35;
        yertle.setAge(101);
        passed = passed && yertle.getAge() == 35;
        yertle.setWeight(1.5);
        passed = passed && yertle.getWeight() == 1.5;
        yertle.setWeight(-10);
        passed = passed && yertle.getWeight() == 1.5;
        yertle.setWeight(0);
        passed = passed && yertle.getWeight() == 1.5;
        yertle.setWeight(251);
        passed = passed && yertle.getWeight() == 1.5;
        yertle.setWeight(3.5);
        passed = passed && yertle.getWeight() == 3.5;

        if ( passed ) {
            System.out.println ( "Setter tests passed!" );
        } else {
            System.out.println ( "At least 1 setter test failed!" );
        }
        */
    }


}
