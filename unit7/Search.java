import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates an ArrayList of pets and performs two search techniques
 * to find a pet from the list. The index position of the pet
 * will be shown in the console (it should be the same for both 
 * algorithms).
 * @author Ken Loomis
 */
public class Search {

  /** A starting array of pets - to be converted into an arraylist in the code. */
	private static final String [] petArray =  { "alligator", "bird", "cat", "chinchilla", "cockroach",
                                                  "dog", "ferret", "fish", "hedgehog", "iguana",
                                                  "mouse", "pig", "rabbit", "rock", "snail",
                                                  "snake", "spider", "turtle" };

	public static void main(String[] args) {

		Scanner keyboard = new Scanner ( System.in );
		ArrayList<String> pets = new ArrayList<String>(petArray.length);
		for ( String pet : petArray ) {
			pets.add(pet);
		}

		System.out.print ( "What animal to search for: " );
		String animal = keyboard.next();

		System.out.println( "Linear search: "  );
		System.out.println( "\t" + animal + " Found at " + linearSearch ( animal, animals )  );
		System.out.println();

		System.out.println( "Linear search: "  );
		System.out.println( "\t" + animal + " Found at " + linearSearch ( animal, animals )  );

	}

	/**
	 * Performs a linear search for the given target string
	 * @param target, the string to search for
	 * @param list, the ArrayList of strings to search through
	 * @return int, the index position of the string or -1 if not found.
	 */
	public static int linearSearch ( String target, ArrayList<String> list ) {

		return -1;

	}

	/**
	 * Performs a binary search for the given target string
	 * @param target, the string to search for
	 * @param list, the ArrayList of strings to search through
	 * @return int, the index position of the string or -1 if not found.
	 */
	public static int binarySearch ( String target, ArrayList<String> list ) {

		return -1;

	}

}
