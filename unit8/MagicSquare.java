import java.util.Scanner;

/**
 * Checks to see if a given set of 9 numbers makes a 
 * magic square.
 * The goal of a magic square (of size 3x3) is to create
 * a square of 9 numbers whose rows, columns, and diagonals
 * add up to the same amount. In this case the value must 
 * be 15. The numbers should include all values from 1 to 9
 * with no duplicates.
 * @author Ken Loomis & <your name>
 * @version 
 */
public class MagicSquare {

	private static final int TARGET = 15;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner ( System.in );
		// Declare a 3x3 array of integers here.

		// Create a loop structure that will collect the 9 numbers.		
		System.out.println( "Enter magic square: ");
		
		// This will check that the inputs are between 1 and 9.
		boolean isMagic = checkInput ( square );

		// Check the rows to ensure they add up to the target value


		// Check the columns to ensure they add up to the target value

		
		// Check the diagonals to make sure they add up to the target

		
		// If it's a magic square then say so.
		if ( isMagic ) {
			System.out.println ( "Magic square!!" );
		} else {
			System.out.println ( "Not a magic square!!" );
		}
		
	}

	private static boolean checkInput ( int [] [] square ) {
		boolean isMagic = square.length == 3 && square[0].length == 3;
		int [] counts = new int [9];
		for ( int [] row : square ) 
			for ( int num : row ) 
				counts[num-1]++;
		for ( int count : counts )
			isMagic = isMagic && count == 1;
		return isMagic;
	}

}
