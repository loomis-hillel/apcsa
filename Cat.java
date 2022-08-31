/**
    A sample program representing a cat that the user can pet.
    @author Ken Loomis
*/
public class Cat {

    /** The number of pets that a cat has received. */
    private int pets;

    /** Constructs a cat with 0 pets to begin with. */
    public Cat (  ) {
        pets = 0;
    }
    
    /** Performs a single pet of the cat which causes the cat to purr. */
    public void pet ( ) {
        pets++;
        System.out.println ( "Purr!" );
    }

    /** Performs a multiple pets of the cat which causes the cat to mrow. */
    public void pet ( int times ) {
        pets = pets + times;
        System.out.println ( "Mrroww!" );
    }
    
    /** Outputs the status of the cat: the number of pets it has received so far */
    public void status ( ) {
        System.out.println ( "You petted the cat " + pets + " times" );
    }
  
    /** A sample program showing how to pet the cat. */
    public static void main(String[] args) {
        Cat cat = null;
        cat = new Cat ();
        cat.pet();
        cat.pet(2);
        cat.pet();
        cat.status();
    }
}
