package marshmellow.model;

public class MonsterModel 
{

	private double legNumber;
	private int eyeNumber;
	private String marshName;
	private boolean buttons;
	private int armNumber;
	
	public MonsterModel()
	{	
	    legNumber = 0.0;
	    eyeNumber = 0;
	    marshName = "";
	    buttons = false;
	    armNumber = 0;	
	}
	
	public MonsterModel(double legNumber, int eyeNumber, String marshName, boolean buttons, int armNumber)
	
	{
	   this.legNumber = legNumber;
	   this.eyeNumber = eyeNumber;
	   this.marshName = marshName;
	   this.buttons   =   buttons;
	   this.armNumber = armNumber;	
	}
	
	public String toString()
	
	{
	    String str = marshName + " is a Marshmellow Monster. He has " + eyeNumber + " eyes, " + legNumber + " legs, and " + armNumber + " arms.";
	    if(buttons)
	      {
	      str = str + " He has buttons.";	    
	      }
	       else
	      {
	      str = str + " He has no buttons.";
	      }
	      return str;
	}    		  
	    			    	
}
	