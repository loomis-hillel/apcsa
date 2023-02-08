import java.util.ArrayList;

/**
 * Code that manipulates a list of prime numbers.
 * @author Ken Loomis
 */
public class PrimeList {

    public static void main ( String [] args ) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        while ( primes.size () < 10 ) {
            primes.add ( (int) (Math.random() * 1000) + 1 );
        }

        for ( int i=0; i<primes.size(); i++ ) {
            if ( !isPrime(primes.get(i)) ) {
                primes.remove(i);
            }
        }

        System.out.println ( primes );
    }

    /**
     * Checks if the given number is a prime number
     * Precondition: num is a positive integer
     * @param num, the integer that will be checked assumed to be
     * greater than 0
     * @return produces true if num is prime, false otherwise.
     */
    private static boolean isPrime ( int num ) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Produces the next prime number after a given number.
     * If the given number is prime, it will return that number.
     * Precondition: num is a positive integer and there is a prime
     * that exists after num.
     * @param num, the integer used to find the next prime
     * @return produces the number if it is prime or the next prime number.
     */
    private static int nextPrime ( int num ) {
        for (int i = num; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // Should never reach this line
    }

}
