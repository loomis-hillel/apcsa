import java.util.Scanner;

/**
 * A simple program that simulates interaction with a user.
 * As long as the user has not said the word "bye" in the 
 * interaction then the chat will continue.
 * 
 * @author Ken Loomis
 * @version November 2021
 */
public class MagpieChatRunner {

	/**
	 * Instantiates a MagpieChatBot and interacts with the
	 * user until the user enters "bye" as part of the chat.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* Task 0: Change the name of the chatbot if you want. */
		String name = "Magpie";
		Scanner keyboard = new Scanner (System.in);
		MagpieChatBot mag = new MagpieChatBot( name );
		String username;
		
		System.out.print( "Enter your username to login: " );
		username = keyboard.nextLine();
		
		System.out.print( mag.getName() + " > " );
        System.out.println (mag.getGreeting());
  
        /* You do not need to know how this part works, yet. */
        System.out.print ( username + " > " );
        String statement = keyboard.nextLine();
        while (!mag.isValediction(statement))
        {
        	System.out.print( mag.getName() + " > " );
            System.out.println (mag.getResponse(statement));
            System.out.print ( username + " > " );
            statement = keyboard.nextLine();
        }
        System.out.print( mag.getName() + " > " );
        System.out.println (mag.getValediction());

	}

}
