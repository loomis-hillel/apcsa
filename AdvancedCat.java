/**
    A sample program representing a cat that the user can pet.
    @author Ken Loomis
*/
public class AdvancedCat {

    /** The number of pets that a cat has received. */
    private int pets;
    /** The number of pets that a cat can handle. */
    private int limit;

    /** Constructs a cat with 0 pets to begin with and a given limit */
    public AdvancedCat ( int newLimit ) {
        pets = 0;
        limit = newLimit;
    }
    
    /** Performs a single pet of the cat which causes the cat to purr or growl. */
    public void pet ( ) {
        pets++;
        if ( pets <= limit )
        	System.out.println ( "Purr!" );
        else
        	System.out.println ( "Grrr!" );
    }
    
    /** Performs a multiple pets of the cat. USES SCARY RECURSION! */
    public void pet ( int numTimes ) {
    	pet ( );
    	if ( numTimes > 1 )
    		pet ( numTimes - 1 );
    }
    
    /** Produces the number of times a cat has been petted. */
    public int getPets ( ) {
        return pets;
    }

    /** Converts the cat to a string */
    public String toString ( ) {
        return "You petted the cat " + getPets() + " times";
    }

    /** Outputs the status of the cat: the number of pets it has received so far */
    public void status ( ) {
        System.out.println ( toString() );
    }
  
    /** A sample program showing how to pet the cat. */
    public static void main(String[] args) {
        AdvancedCat cat = new AdvancedCat ( 5 );
        cat.pet(6);
        cat.status();
    }
}
