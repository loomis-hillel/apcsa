/**
 * Tests the Worker class to make sure that it
 * operates correctly.
 * @author Ken Loomis
 * @version 2022
 */
public class TestWorker {

    public static void main ( String [] args ) {    
        
        // Test bank
        String name[] = {"Worker0", "Worker1", "Worker2", "Worker3", "Worker4"};
        double wage[] = {12, 12, 12, 13, 14};

        // Creates 5 workers
        Worker[] worker = new Worker[5];
        for ( int i=0; i<5; i++ ) {
            worker[i] = new Worker ( "Worker" + i, 10+i, 40 ); 
        }

        // Tests workers
        boolean passed = true;
        
        for ( int i=0; i<5; i++ ) {
            System.out.println ( worker[i] );
            System.out.println ( "\tId: expected (" + (100001 + i) + "), actual(" + worker[i].getId() + ")" );
            passed = passed && worker[i].getId() == 100001 + i;
            System.out.println ( "\tName: expected (" + name[i] + "), actual(" + worker[i].getName() + ")" );
            passed = passed && worker[i].getName().equals(name[i]);
            System.out.println ( "\tWage: expected (" + wage[i] + "), actual(" + worker[i].getWage() + ")" );
            passed = passed && worker[i].getWage() == wage[i];
            System.out.println ( "Tests passed = " + passed + "\n" );
        }
        
    }
}
