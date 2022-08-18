
import java.util.Scanner;

/* 
 *	<Put a description here>
 *	@author <Your name> and Ken Loomis
 *	@version <put today's date here>
 */
public class ChangeMaker {

	public static void main(String[] args) {
		
		/*	This is something that you need to get input from the
			the user. It will be explained in a later unit. */
		Scanner keyboard = new Scanner (System.in);
		
		// Variables
		double totalDue, givenAmnt, change;
		// Add any other variables below
		

		/*	These next few lines of code collect the user input
			so that we can see different outputs for given inputs. */
		System.out.print("Enter your total: $ ");
		totalDue = keyboard.nextDouble();
		System.out.print("Enter the collected amount: $ ");
		givenAmnt = keyboard.nextDouble();
		
		change = givenAmnt - totalDue;
		System.out.println("The change is: $ " + change);
		
		/*	Add the code below to calculate change given */

	}

}
