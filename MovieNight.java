import java.util.Scanner;

/**
  * This program produces some Movie suggestions for a user
  * based on the user's age.
  * @author: <your name>
  * @version: <the date>
 */
public class MovieNight {
    public static void main ( String [] args ) {

        // Part I
        
        // Part II
        
        // Part II
        
        // Part III
        System.out.println ( "How are you getting to the theater: " );
        
    }

    /**
      * Produces 1 of 5 PG13-rated movies titles from 2022/21
      * @return The name of a movie (String)
      * @author Ken Loomis
     */
    public static String pg13Movie ( ) {
        int choice = (int) (Math.random() * 5);
        switch ( choice ) {
            case 0: return "Spider-Man: No Way Home";
            case 1: return "Death on the Nile";
            case 2: return "The Batman";
            case 3: return "Morbius";
            case 4: return "Doctor Strange in the Multiverse of Madness";
            default: return "Top Gun: Maverick";
        }
    }

    /**
      * Produces 1 of 5 R-rated movies titles from 2022/21
      * @return The name of a movie (String)
      * @author Ken Loomis
     */
    public static String rMovie ( ) {
        String [] movies = {    "Spiderhead", 
                                "Bullet Train", 
                                "Nope", 
                                "Don't Look Up", 
                                "The King's Man" };
        int choice = (int) (Math.random() * 5);
        return movies [ choice ];
    }

}
