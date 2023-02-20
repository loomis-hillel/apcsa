import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates an ArrayList of pets and performs two sort techniques
 * to arrange the pets in the list. Once sorted the binary search
 * algorithm can be used to find an element in the array.
 * @author Ken Loomis
 */
public class Sort {

  /** A starting array of pets - to be converted into an arraylist in the code. */
	private static final String [] petArray =  { "turtle", "ferret", "snake", "snail", "hedgehog",
                                                  "dog", "spider", "fish", "rabbit", "iguana",
                                                  "mouse", "bird", "cockroach", "rock", "chinchilla",
                                                  "cat", "pig", "alligator" };

	public static void main(String[] args) {

		Scanner keyboard = new Scanner ( System.in );
		ArrayList<String> pets = new ArrayList<String>(petArray.length);
		for ( String pet : petArray ) {
			pets.add(pet);
		}

		System.out.print ( "What animal to search for: " );
		String pet = keyboard.next();

		System.out.println( "Linear search: "  );
		System.out.println( "\t" + pet + " Found at " + linearSearch ( pet, pets )  );

		System.out.println( "Unsorted: " + pets );
		// selectionSort ( pets );
		// insertionSort ( pets );
		System.out.println( "Sorted: " + pets );

		System.out.println( "Binary search: "  );
		System.out.println( "\t" + pet + " Found at " + binarySearch ( pet, pets )  );

	}

	/**
	 * Performs a linear search for the given target string
	 * @param target, the string to search for
	 * @param list, the ArrayList of strings to search through
	 * @return int, the index position of the string or -1 if not found.
	 */
	public static int linearSearch ( String target, ArrayList<String> list ) {
		int i;
		for ( i = 0; i < list.size(); i++ ) {
			if ( target.equals( list.get(i) ) ) {
				System.out.println ( "Found in " + (i+1) + " comparisons" );
				return i;
			}
		}
		System.out.println ( "Not found in " + (i+1) + " comparisons" );
		return -1;
	}

	/**
	 * Performs a binary search for the given target string
	 * @param target, the string to search for
	 * @param list, the ArrayList of strings to search through
	 * @return int, the index position of the string or -1 if not found.
	 */
	public static int binarySearch ( String target, ArrayList<String> list ) {
		int i = 0;
		int left = 0;
		int right = list.size();
		while ( left < right ) {
			int middle = ( right + left ) / 2;
			int cmp = target.compareTo( list.get(middle) );
			i++;
			if ( cmp > 0 ) { 
				left = middle+1; 
			} else if ( cmp < 0 ) {  
				right = middle;
			} else {
				System.out.println ( "Found in " + i + " comparisons" );
				return middle;
			}
		}
		System.out.println ( "Not found in " + (i) + " comparisons" );
		return -1;

	}

	/**
	 * Performs a selection sort of the given list of strings.
	 * @param list, the ArrayList of strings to sort
	 */
	public static void selectionSort ( ArrayList<String> list ) {
		// Write selection sort here
	}

	/**
	 * Performs an insertion sort of the given list of strings.
	 * @param list, the ArrayList of strings to sort
	 */
	public static void insertionSort ( ArrayList<String> list ) {
		// Write insertion sort here
	}

}
