import java.util.Scanner;

/**
    A program that plays a MadLib style game with a user.
    @author Your Name
    @version Today's date
*/
public class MadLib {

    public static void main(String[] args) {

        /* This should start to look a little more familiar now :) */
        Scanner keyboard = new Scanner ( System.in );

        /* This is an example of how to declare a variable and initialize it
           with user input (don't forget to prompt the user for input). 
           Copy-paste this as often as needed to complete the task. */
        System.out.print ( "Enter your name: " );
        String name = keyboard.next( );

    }
}
