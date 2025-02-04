public class Maximum {
    /**
     * Determines the maximum number in a randomly generated
     * array of numbers.
     */
    public static void main ( String [] args ) {
        int [] numbers = new int [100];

        for ( int i=0; i<numbers.length; i++ ) {
            numbers[i] = (int) ( Math.random ( ) * 1000 );
        }

        printArray ( numbers );

    }

    /**
     * Prints an array in tabular form with 10 elements per row.
     * @param numbers - an array of integers
     */
    private static void printArray ( int [] numbers ) {
        for ( int i=0; i<numbers.length; i++ ) {
            if ( i == 0 ) {
                System.out.print ( numbers[i] );
            } else if ( i % 10 == 0 ) {
                System.out.print ( "\n" + numbers[i] );
            } else {
                System.out.print ( "\t" + numbers[i] );
            }
        }
        System.out.println ( );
    }
}
