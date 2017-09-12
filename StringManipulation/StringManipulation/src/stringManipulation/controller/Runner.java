package stringManipulation.controller;

public class Runner 
{

	public static void main(String[] args) 
	{
      StringCommands myProgram = new StringCommands();
		
		System.out.println(myProgram.orToOur("flavor"));
		
		WordReverser myReverser = new WordReverser();
		System.out.println(myReverser.reverse("Racecar"));
		
	}

}
