package stringManipulation.controller;
import java.util.Scanner;

public class WordReverser 
{

	Scanner myScanner = new Scanner(System.in);
	
	public WordReverser()
	{

	}
	
	public String reverse(String word)
	{
		
		
		String result = "";
		for (int i = word.length(); i > 0; i--)
		
		{
			result = result + word.substring(i-1,i);
			
		}
				
						
	    return result;
	    	
	}
	

}
