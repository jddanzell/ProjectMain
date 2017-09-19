package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		/**  
		 * Keyword is cat and dog
		 */
		else if (findKeyword(statement, "cat") >= 0
		        || findKeyword(statement,"dog") >= 0)
		
		{
			response = "Tell me more about your pets.";
		}
		/**
		 * Key word is Mr. Goebel
		 * statement = statement.toLowerCase()
		 * String statement = in.nextLine()
		 * Statement = statement.trim()
		 */
		else if (findKeyword(statement, "Mr. Goebel") >=0)
				
		{
			response = "He sounds like a good teacher";
		}
		else if (findKeyword(statement, "food") >=0)
				
		{
			response = "Robots can't have food.";
		}
		else if (findKeyword(statement, "game") >=0
			    || findKeyword(statement, "games") >=0
			    || findKeyword(statement, "gaming") >=0)
		{
			response = "I don't have any games on my system.";
		}
		else if (statement.indexOf("friend") >=0
			    || statement.indexOf("friends") >=0
			    || statement.indexOf("friendship") >=0)
		{  
			response = "I do not understand 'Friendship'.";
		} 
		else if (statement.indexOf(statement.trim() + "") >=0)
		
		{
			response = "Please say something";
		}
		else
			
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Is that so.";
		}
		else if (whichResponse == 5) 
		{
			response = "I see.";
		}
		return response;
	}
}
