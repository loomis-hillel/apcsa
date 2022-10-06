
/**
 * This is a slightly smarter ChatBot than the one we wrote
 * previously. It can begin to recognize some words or phrases
 * and respond when it recognizes them. Otherwise it uses 
 * a randomly generated response. 
 * @author Ken Loomis
 */
public class MagpieChatBot {
	
	private String name;
	
	/** 
	 * Constructs the MagpieChatBot using the name provided. 
	 * @param newName (String) the name of the bot
	 */
	public MagpieChatBot(String newName) {
		name = newName;
	}
	
	/** 
	 * Produces the name of the MagpieChatBot. 
	 * @return the name of the bot
	 */
	public String getName() {
		return name;
	}

	/**
	 * Produces a greeting message directed at the user.
	 * @return a predefined greeting message
	 */
	public String getGreeting() {
		/* Task #1: Replace the line below with a return statement
		 * that produces a greeting message. "Hello" would work, but
		 * it is a little bland. Come up with something better. */
		return "?";
	}

	/**
	 * Produces a closing message directed at the user.
	 * @return a predefined closing message
	 */
	public String getValediction() {
		/* Task #2: Replace the line below with a return statement
		 * that produces a closing message. "Goodbye" would work, but
		 * it is a little bland. Come up with something better. */
		return "?";
	}

	/**
	 * Detects when the user has entered a message that
	 * contains a certain keyword. 
	 * @param statement (String) the message entered by the user.
	 * @param keyword (String) the word that is checked
	 * @return true if the statement contains the keyword,
	 * otherwise false
	 */
	private boolean containsKeyword(String statement, String keyword) {
		/* Task #3: Add some code below that will detect if the keyword
		 * appears somewhere in the statement. Be careful to 
		 * handle uppercase and lowercase versions of the letters. */
		return true;	
	}
	
	/**
	 * Detects when the user has entered a message that
	 * contains the word "bye". 
	 * @param statement (String) the message entered by the user.
	 * @return true if the statement contains the word "bye", 
	 * otherwise false.
	 */
	public boolean isValediction(String statement) {
		return containsKeyword ( statement, "bye" );
	}
	

	
	/**
	 * Produces an appropriate response to the statement provided by the
	 * user. Some keywords will elicit predetermine responses. Otherwise
	 * the response will be a random response.
	 * @param statement (String) the message entered by the user.
	 * @return some message in response to the statement given.
	 */
	public String getResponse(String statement) {
		String response = "?";
		
		/* Task #4: Add some code below that will respond to certain 
		 * keywords with some predetermined messages. This has been
		 * started for you with one predetermine response. You should
		 * have an additional 5 keywords/responses. 
		 * 
		 * If no keywords have been detected then use a randomly 
		 * generated response. Hint: use the method below this one
		 * to generate a random response.*/
		if ( containsKeyword( statement, "loomis" ) ) {
			response = "Did you say Mr. Loomis. He's my favorite teacher.";
		}
		
		return response;
	}
	
	/**
	 * Produces a random response.
	 * @return
	 */
	private String getRandomResponse() {
		int num;
		String response = "?";
		/* Task #5: Add some code below that will generate a (pseudo)random 
		 * number and use that number to return a response. You should have at
		 * least 5 random responses. */
		return response;
	}

	

}
