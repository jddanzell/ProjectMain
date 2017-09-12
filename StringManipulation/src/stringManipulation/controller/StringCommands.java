package stringManipulation.controller;
import java.util.Scanner;

public class StringCommands
{
    Scanner myScanner = new Scanner(System.in);
	
	public StringCommands()
	{
		
		
	}

    public void charles()
    {
    	
    	System.out.println("Enter your name.");
    	String reply = myScanner.nextLine();
    	if (reply.equalsIgnoreCase("Charles"))
        {
            System.out.println("Hi Charles");
        }
    	else
    	{
    		System.out.println("I don't know you.");	
    	}
    }
    public String orToOur(String word)
    {
    	
    	String result = "";
    	if (word.endsWith("or"))
    	{
           word = word.substring(0,word.length()-2);
           word = word.concat("our");
           result = word;

    	}
    	else
    	{
    		
    	result = word;
    	}
    	
    	return result;
    }
}


